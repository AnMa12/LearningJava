package pachet1;

import pachet1.S;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    S ob =  new S();
        System.out.println(ob.Suma(2,3));


        int x[] = {1, 2, 3, 4};
        int y[] = new int[4];

        y = x;
        for(int i=0; i<y.length;i++)
            System.out.print(y[i]+" ");
        System.out.println("");
        x[1] = 10;

        for(int i=0; i<y.length;i++)
            System.out.print(y[i]+" ");
        System.out.println("");

        for(int i=0; i<x.length; i++)
            y[i] = x[i];
            x[1] = 10;
        for(int i=0; i<y.length;i++)
            System.out.print(y[i]+" ");

        System.out.println(x.hashCode());

        int ar[] = {5, 8, 2, 3, 9, 1, 4, 7, 6};
        int[] copy = Arrays.copyOf(ar, ar.length);
        System.out.println("Copied array => \n" + copy);
        int[] rcopy = Arrays.copyOfRange(ar, 1, 4);
        System.out.println("Copied subarray => \n" + Arrays.toString(rcopy));
    }
}
