package structural.decorator.b2;

public class Main {
    static void main() {
        Chuoi chuoiBanDau = new ChuoiTho("là cc cl j z?");
        Decorator tokenizer = new Tokenizer(chuoiBanDau);
        Decorator swr = new StopwordRemoval(tokenizer);
        System.out.println(swr.print());
    }
}
