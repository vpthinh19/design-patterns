package structural.composite.b3;
import java.util.ArrayList;

public class Folder extends Component{
    private ArrayList<Component> danhSachCon = new ArrayList<Component>();
    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        String string = prefix + this.ten + "\n";
        for (Component c:danhSachCon){
            string += c.getStringTreeFolder(prefix + "\t");
        }
        return string;
    }

    @Override
    public void addItem(Component component){
        danhSachCon.add(component);
        component.setParent(this);
    }
    @Override
    public void removeItem(Component component){
        for (Component c:danhSachCon){
            if (c == component){
                danhSachCon.remove(c);
                c.setParent(null);
            }
        }
    }
}
