package structural.composite.b3;

import java.util.ArrayList;

public class Folder implements Component{
    private String tenThuMuc;
    private String ngayTao;
    private ArrayList<Component> danhSachCon = new ArrayList<Component>();

    public Folder(String tenThuMuc, String ngayTao) {
        this.ngayTao = ngayTao;
        this.tenThuMuc = tenThuMuc;
    }

    @Override
    public String getStringTreeFolder() {
        String res = new String();
        for (Component nut:danhSachCon){
            res += "\t" + nut.getStringTreeFolder() + "\n";
        }
        return res;
    }

    @Override
    public String getPath() {
        return "";
    }
}
