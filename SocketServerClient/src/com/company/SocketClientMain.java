package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClientMain {
    public static void main(String [] s) {
        Socket cs=null;
        InetAddress address=null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(address.getHostAddress());
        try {
            cs = new Socket(address.getHostAddress(),9000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Introduceti numele pe care il doriti:");
        Scanner scanner = new Scanner(System.in);
        DataInputStream dis = null;
        DataOutputStream dos=null;
        try {
            dis = new DataInputStream(cs.getInputStream());
            dos = new DataOutputStream( cs.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true) {
            String elevCautat = scanner.next();
            try {
                dos.writeUTF(elevCautat);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                String rezultat = dis.readUTF();
                System.out.println(rezultat);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
