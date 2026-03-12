package structural.decorator.b2;

public class Main {
    static void main() {
        Chuoi chuoiBanDau = new ChuoiTho("Tokenize là quá trình tách chuỗi thành các từ.");
        Decorator tachTu = new Tokenizer(chuoiBanDau);
        Decorator xoaTuDung = new StopwordRemoval(tachTu);
        Decorator xoaDauCau = new PunctualRemoval(xoaTuDung);
        System.out.println(chuoiBanDau.get());
        System.out.println("Tách từ: " + tachTu.get());
        System.out.println("Xóa từ dừng: " + xoaTuDung.get());
        System.out.println("Xóa dấu câu: " + xoaDauCau.get());
    }
}
