package behavior.chain_of_responsibility.cb4;

import java.util.List;

public class Giai extends IGiai {
    private IGiai giaiKeTiep;

    public Giai(String ten, int giaTri, List<String> boSo) {
        super(ten, giaTri, boSo);
    }

    @Override
    public void doVeSo(String so) {
        if (so != null){
            for (var soTrungThuong: this.boSo){
                if (so.endsWith(soTrungThuong)){
                    System.out.println("Trung " + this.ten + ": " + this.giaTri + " VND");
                    return;
                }
            }
            this.giaiKeTiep.doVeSo(so);
        }
    }

    @Override
    public IGiai keTiep(IGiai giaiKeTiep) {
        return this.giaiKeTiep = giaiKeTiep;
    }
}
