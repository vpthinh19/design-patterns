package structural.composite.caynhiphan;

public class Main {
    static void main() {
        Nut nut1 = new NutTrong(10);
        Nut nut2 = new NutTrong(8);
        Nut nut3 = new NutTrong(12);
        Nut nut4 = new NutLa(6);
        Nut nut5 = new NutLa(7);
        Nut nut6 = new NutLa(11);
        Nut nut7 = new NutLa(13);
        nut1.themTrai(nut2);
        nut1.themPhai(nut3);
        nut2.themTrai(nut4);
        nut2.themPhai(nut5);
        nut3.themTrai(nut6);
        nut3.themPhai(nut7);
        nut1.duyet();
        nut1.xoaPhai();
        System.out.println("");
        nut1.duyet();
    }
}
