package behavior.observer.ca2;

public class Main {
    static void main() {
        Button button = new Button();
        Activity activity = new Activity(button);
        button.click();
        button.click();
        button.click();
        button.click();
    }
}
