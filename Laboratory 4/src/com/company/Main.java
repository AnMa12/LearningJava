package com.company;

import java.lang.reflect.Method;

class Main {
    private int x;
    private int y;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        return "Point[" + x + "," + y + "]";
    }
    public static void main(String[] args) {
        Main p = new Main();
        Class obj = p.getClass();
        System.out.println("Class name for object " + p + " is " +
                obj.getSimpleName());
        System.out.println("List of methods for class " +
                obj.getSimpleName()+ ":");
        Method[] ms = obj.getDeclaredMethods();
        for(Method m:ms)
            System.out.println(m.getName());
    }
}