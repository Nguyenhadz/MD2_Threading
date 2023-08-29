package display_ood_even;

public class DisplayOdd extends Thread{
    Display d;
    DisplayOdd(Display d) {
        this.d = d;
    }
    public void run() {
        d.display(2);
    }
}
