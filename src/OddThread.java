public class OddThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
