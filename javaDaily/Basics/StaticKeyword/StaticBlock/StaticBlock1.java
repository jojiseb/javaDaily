package StaticBlock;

import java.util.LinkedList;
import java.util.List;

class StaticBlockDemo {
    private static List<String> ranks = new LinkedList<>();

    public List<String> getRanks() {
        return ranks;
    }

    static {
        ranks.add("Lieutenant");
        ranks.add("Captain");
        ranks.add("Officer");
    }

    static {
        ranks.add("Colonel");
        ranks.add("General");
        ranks.add("Reus");
    }
}

public class StaticBlock1 {
    public static void main(String[] args) {
        StaticBlockDemo sc = new StaticBlockDemo();
        System.out.println("Ranks: "+sc.getRanks());
    }
}
