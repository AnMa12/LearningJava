package com.company;

public class Event {
    int id;
    int price;
    String title;
    Event(String title, int id, int price ){
        this.title = title;
        this.id = id;
        this.price = price;
    }
    public boolean equals(Object o){
        if(o==null||!(o instanceof Event) )
            return false;
        Event ev = (Event)o;
        return ev.id == id && ev.title.equals(title) && ev.price == price;
    }
    public int hashCode(){
        return id + title.hashCode() + price;
    }
    public String toString(){
        return id + ": " + title + ", " + price;
    }
    public static void main (String[] args){
        Event e1 = new Event("Concert", 10, 250);
        Event e2 = new Event("Teatru", 20, 130);
        Event e3 = new Event ("Concert", 10, 250);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e2.hashCode());
        if(e1.equals(e3))
            System.out.println("Are equals");
        else
            System.out.println("Are not equals");
    }
}