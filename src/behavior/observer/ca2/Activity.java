package behavior.observer.ca2;

public class Activity implements IActivity{
    private Button button;
    public Activity(Button button) {
        this.button = button;
        this.button.attach(this);
    }

    @Override
    public void print(int count) {
        System.out.println("Ban click lan thu " + count);
    }
}
