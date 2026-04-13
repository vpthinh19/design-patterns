package behavior.chain_of_responsibility.cb4;

import java.util.List;

public abstract class IGiai {
    protected String ten;
    protected int giaTri;
    protected List<String> boSo;

    public IGiai(String ten, int giaTri, List<String> boSo) {
        this.ten = ten;
        this.giaTri = giaTri;
        this.boSo = boSo;
    }
    public abstract void doVeSo(String so);
    public abstract IGiai keTiep(IGiai giaiKeTiep);
}
