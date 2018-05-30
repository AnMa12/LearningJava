package com.company.ExceptieProprie;

class ExceptieProprie extends Exception {
    public ExceptieProprie() {}
    public ExceptieProprie(String msg) {
        // apeleaza constructorul superclasei Exception
        super(msg);
    }
}
class CreareExceptie {
    public static void f() throws ExceptieProprie {
        System.out.println("Exceptie in f()");
        throw new ExceptieProprie();
    }

    public static void g() throws ExceptieProprie {
        System.out.println("Exceptie in g()");
        throw new ExceptieProprie("aruncata din g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch(ExceptieProprie e) {e.printStackTrace();}

        try {
            g();
        } catch(ExceptieProprie e) {e.printStackTrace();}
    }
}