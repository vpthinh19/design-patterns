package behavior.strategy.cc2;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int res = o1.getHoTen().compareTo(o2.getHoTen());
        if (res > 0) return 1;
        if (res < 0) return -1;
        return 0;
    }
}
