public class ShowNumber {
    public static void main(String[] args) {
        EvenThread e = new EvenThread();
        OddThread o = new OddThread();

        Thread se = new Thread(e);
        Thread so = new Thread(o);

        se.start();
        so.start();
    }
}
