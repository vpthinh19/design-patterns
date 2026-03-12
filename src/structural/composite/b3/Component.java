package structural.composite.b3;

public abstract class Component {
    protected String ten;
    protected String ngayTao;
    protected Component parent;

    public Component(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
    }

    public void setParent(Component parent){
        this.parent = parent;
    }
    public abstract String getStringTreeFolder(String prefix);
    public abstract String getPath();
    public abstract void addItem(Component component);
    public abstract void removeItem(Component component);
}
