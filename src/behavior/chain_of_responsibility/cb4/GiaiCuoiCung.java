package behavior.chain_of_responsibility.cb4;

import java.util.List;

public class GiaiCuoiCung extends IGiai{
    public GiaiCuoiCung(String ten, int giaTri, List<String> boSo) {
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
        }
        System.out.println("Khong trung giai nao");
    }

    @Override
    public IGiai keTiep(IGiai giaiKeTiep) {
        return null;
    }
}
