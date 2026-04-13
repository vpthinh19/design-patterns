package behavior.state.remote;

public class OffState implements IRemoteState{
    public OffState() {
    }

    @Override
    public void handle(RemoteControl remote) {
        System.out.println("on");
        remote.setState(new OnState());
    }
}
