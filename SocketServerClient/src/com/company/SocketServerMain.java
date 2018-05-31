package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class SocketServerMain {
    Connection connection;
    public static String getFromDataBase(String prenume) {
        Connection connection=null;
        try {
            connection=DriverManager.getConnection("jdbc:mysql://myownpi.ddns.net:3306/register?allowMultiQueries=true", "admin", "admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Statement stmt=null;
        try {
            stmt = connection.createStatement();
            String querry = "Select id_elev from Elev where Prenume = '" + prenume+"'";
            ResultSet rs = stmt.executeQuery(querry);
            while(rs.next()){
                return rs.getString("id_elev");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return "error";
    }

    public static void main(String [] s) {
        ServerSocket ss =null;
        Socket cs =null;
        try {
            ss = new ServerSocket(9000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            cs = ss.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataInputStream dis = null;
        DataOutputStream dos=null;
        try {
            dis = new DataInputStream(cs.getInputStream());
            dos = new DataOutputStream( cs.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(true) {
            String elevCautat=null;
            try {
                elevCautat= dis.readUTF();
                System.out.println(elevCautat);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                String rezultat = getFromDataBase(elevCautat);
                System.out.println(rezultat);
                dos.writeUTF(rezultat);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
