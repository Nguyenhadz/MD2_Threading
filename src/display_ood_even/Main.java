package display_ood_even;

public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        DisplayOdd displayOdd = new DisplayOdd(display);
        DisplayEven displayEven = new DisplayEven(display);
        displayOdd.start();
        displayEven.start();
    }
}
