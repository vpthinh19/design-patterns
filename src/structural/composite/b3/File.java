package structural.composite.b3;

public class File extends Component{
    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        return prefix + this.ten + "\n";
    }

    @Override
    public String getPath() {
        if (parent != null){
            return parent.getPath() + "\\" + ten;
        }
        return ten;
    }

    @Override
    public void addItem(Component component) {

    }

    @Override
    public void removeItem(Component component) {

    }
}
