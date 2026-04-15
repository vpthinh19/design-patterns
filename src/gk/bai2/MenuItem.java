package gk.bai2;

public abstract class MenuItem {
    protected String ten;

    public MenuItem(String ten) {
        this.ten = ten;
    }

    public abstract void add(MenuItem item);
    public abstract void remove(MenuItem item);
    public abstract void hienThi(String prefix);
    public abstract double tinhGia();
}
