package TeorieEx.counterExercice;

public class MainCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(c1.getCount() + " " +
                           c2.getCount() + " " +
                           c3.getCount());
    }
}
