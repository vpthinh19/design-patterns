package behavior.chain_of_responsibility.cb4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        IGiai giaiDacBiet = new Giai("Giai Dac Biet", 2000000000, new ArrayList<>(List.of("339568")));
        IGiai giai1 = new Giai("Giai 1", 30000000, new ArrayList<>(List.of("27697")));
        IGiai giai2 = new Giai("Giai 2", 15000000, new ArrayList<>(List.of("52567")));
        IGiai giai3 = new Giai("Giai 3", 10000000, new ArrayList<>(List.of("11864", "79213")));
        IGiai giai4 = new Giai("Giai 4", 3000000, new ArrayList<>(List.of("12713","90705","86627","93595","70912","19100","62731")));
        IGiai giai5 = new Giai("Giai 5", 1000000, new ArrayList<>(List.of("0207")));
        IGiai giai6 = new Giai("Giai 6", 400000, new ArrayList<>(List.of("3061","1132","1822")));
        IGiai giai7 = new Giai("Giai 7", 200000, new ArrayList<>(List.of("969")));
        IGiai giai8 = new GiaiCuoiCung("Giai 8", 100000, new ArrayList<>(List.of("97")));

        giaiDacBiet.keTiep(giai1);
        giai1.keTiep(giai2);
        giai2.keTiep(giai3);
        giai3.keTiep(giai4);
        giai4.keTiep(giai5);
        giai5.keTiep(giai6);
        giai6.keTiep(giai7);
        giai7.keTiep(giai8);

        giaiDacBiet.doVeSo("127697");
    }
}
