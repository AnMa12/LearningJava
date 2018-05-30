package com.company.SubI_Tampeala;

class A {
    String sir = "";
    public A(String sir) { this.sir = this.sir + sir + "A"; } //sir = DA
}
class B extends A {
    public B(String sir) { super(sir); this.sir = this.sir + sir + "B"; } //sir = DAB
}
class C extends B {
    public C(String sir) { super(sir); this.sir = this.sir + sir + "C"; } // sir = DABC
}

public class Extendings {
    public static void main(String[] args) {
        System.out.println(new C("D").sir); //DADABDABC - gresit
        //DABC - gresit CE PLM
    }
}