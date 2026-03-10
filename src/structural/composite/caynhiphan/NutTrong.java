package structural.composite.caynhiphan;

public class NutTrong extends Nut{
    private Nut nutTrai, nutPhai;
    public NutTrong(int data) {
        super(data);
        this.nutTrai = null;
        this.nutPhai = null;
    }

    @Override
    public void duyet() {
        System.out.print(this.giaTri + " ");
        if (this.nutTrai != null) nutTrai.duyet();
        if (this.nutPhai != null) nutPhai.duyet();
    }

    @Override
    public void themTrai(Nut nut) {
        this.nutTrai = nut;
    }

    @Override
    public void themPhai(Nut nut) {
        this.nutPhai = nut;
    }

    @Override
    public void xoaTrai() {
        this.nutTrai = null;
    }

    @Override
    public void xoaPhai() {
        this.nutPhai = null;
    }
}
