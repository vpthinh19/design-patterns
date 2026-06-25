package behavior.strategy.cc1;

public class Main {
    static void main() {
        Context context = new Context();
        context.setTinhToan(new Cong());
        System.out.println(context.tinh(75, 12));
        context.setTinhToan(new Tru());
        System.out.println(context.tinh(54, 78));
        context.setTinhToan(new Chia());
    }
}
