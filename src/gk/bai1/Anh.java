package gk.bai1;

public class Anh implements IAnh{
    private String anh;

    public Anh(String anh) {
        this.anh = anh;
    }

    @Override
    public String hienThi() {
        return anh;
    }
}
