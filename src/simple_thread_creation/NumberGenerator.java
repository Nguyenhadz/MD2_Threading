package simple_thread_creation;

public class NumberGenerator implements Runnable{

    @Override
    public synchronized void run() {
        for (int i = 0; i<=10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
