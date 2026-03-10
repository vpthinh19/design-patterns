package structural.composite.caynhiphan;

public abstract class Nut {
    protected int giaTri;

    public Nut(int data) {
        this.giaTri = data;
    }
    public abstract void duyet();
    public abstract void themTrai(Nut nut);
    public abstract void themPhai(Nut nut);
    public abstract void xoaTrai();
    public abstract void xoaPhai();
}
