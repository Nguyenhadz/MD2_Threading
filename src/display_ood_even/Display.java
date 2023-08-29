package display_ood_even;

public class Display {
    void display (int a) {
            for (int i =0; i<=10; i++) {
                if ( a == 1 && i%2 == 0) {
                    System.out.println(i);
                } else if ( a == 2 && i%2 != 0) {
                    System.out.println(i);
                }
            }
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
