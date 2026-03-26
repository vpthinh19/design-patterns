package behavior.observer.ca2;

public class Button {
    private int count;
    private IActivity activity;

    public Button() {
    }
    public void attach(IActivity a){
        this.activity = a;
    }
    public void detach(IActivity a){
        this.activity = null;
    }
    public void click(){
        if (this.activity != null){
            this.activity.print(++this.count);
        }
    }
}
