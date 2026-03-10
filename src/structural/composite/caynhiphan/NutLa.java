package structural.composite.caynhiphan;

public class NutLa extends Nut{
    public NutLa(int data) {
        super(data);
    }

    @Override
    public void duyet() {
        System.out.print(this.giaTri + " ");
    }

    @Override
    public void themTrai(Nut nut) {

    }

    @Override
    public void themPhai(Nut nut) {

    }

    @Override
    public void xoaTrai() {

    }

    @Override
    public void xoaPhai() {

    }
}
