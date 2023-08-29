package display_ood_even;

public class DisplayEven extends Thread{
    Display d;
    DisplayEven(Display d) {
        d.display(1);
    }
}
