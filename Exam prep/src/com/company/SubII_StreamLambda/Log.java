package com.company.SubII_StreamLambda;

public class Log {

    String user;
    int date;
    int login_time;
    int logout_time;

    public Log(String user, int date, int login_time, int logout_time) {
        this.user = user;
        this.date = date;
        this.login_time = login_time;
        this.logout_time = logout_time;
    }

    @Override
    public String toString() {
        return "Log{" +
                "user='" + user + '\'' +
                ", date=" + date +
                ", login_time=" + login_time +
                ", logout_time=" + logout_time +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getLogin_time() {
        return login_time;
    }

    public void setLogin_time(int login_time) {
        this.login_time = login_time;
    }

    public int getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(int logout_time) {
        this.logout_time = logout_time;
    }
}
