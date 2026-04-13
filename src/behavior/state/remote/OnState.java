package behavior.state.remote;

public class OnState implements IRemoteState{
    public OnState() {
    }

    @Override
    public void handle(RemoteControl remote) {
        System.out.println("off");
        remote.setState(new OffState());
    }
}
