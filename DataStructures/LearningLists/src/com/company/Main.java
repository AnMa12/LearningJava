package com.company;


class Link {
    public String bookName;
    public int millionsSold;

    public Link next;

    public Link(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display() {
        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }

    public String toString() {
        return bookName;
    }
}

class LinkedList {
    public Link firstLink;

    LinkedList() {
        //initialise the firstLink with null
        firstLink = null;
    }

    public boolean isEmpty() {
        return firstLink == null;
    }

    public void insertFirstLink(String bookName, int millionsSold) {
        Link newLink = new Link(bookName, millionsSold);
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link removeFirst() {
        Link linkReference = firstLink;

        if(!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty LinkedList!");
        }
        return linkReference;
    }

    public void display() {
        Link linkReference = firstLink;
        while(linkReference != null) {
            linkReference.display();
            System.out.println("Next link: " + linkReference.next);
            linkReference = linkReference.next;
            System.out.println();
        }
    }

    public Link find(String bookName, int millionsSold) {
        Link linkReference = firstLink;
        if(!isEmpty()) {
            while(linkReference != null) {
                if(linkReference.bookName.equals(bookName) && linkReference.millionsSold == millionsSold)
                    return linkReference;
                else {
                    linkReference = linkReference.next;
                }
            }
        }
        return null;
    }

    public Link delete(String bookName) {
        Link prevLink = firstLink;
        Link currentLink = firstLink.next;

        if(prevLink.bookName.equals(bookName)) {
            return prevLink;
        }

        while(currentLink != null) {
            if(currentLink.bookName.equals(bookName)) {
                //delete this node
                //prev link -> current link -> next link
                prevLink.next = currentLink.next;
            }
            prevLink = currentLink;
            currentLink = currentLink.next;
        }

        return currentLink;
    }
}


public class Main {

    public static void main(String[] args) {
	    LinkedList myLinkedList = new LinkedList();

	    myLinkedList.insertFirstLink("Don Quixote",500);
	    myLinkedList.insertFirstLink("Ion",200);
	    myLinkedList.insertFirstLink("Ton",200);
	    m
    }
}
