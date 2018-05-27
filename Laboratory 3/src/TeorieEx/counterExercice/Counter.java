package TeorieEx.counterExercice;

public class Counter {
    private static int count  = 0;

    public Counter() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
