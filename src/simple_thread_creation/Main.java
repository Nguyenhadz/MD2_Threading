package simple_thread_creation;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread a1 = new Thread(numberGenerator);
        Thread a2 = new Thread(numberGenerator);

        a1.start();
        a2.start();
    }

}
