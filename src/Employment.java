
import java.util.Scanner;

public class Employment {

    WorkerRoulette w = new WorkerRoulette();
    DefineHuman d = new DefineHuman();

    public void Employment() {

        System.out.println("社員を一人雇いますか？");
        System.out.println("「はい」または「いいえ」で答えてください");
        for (int i = 0; i < 4; i++) {
            while (true) {
                String ans = new Scanner(System.in).nextLine();
                switch (ans) {
                    case "はい":
                        w.WorkerRoulette();
                        break;

                    case "いいえ":
                        break;

                    default:
                        System.out.println("「はい」または「いいえ」で答えてください");
                        continue;
                }
                break;
            }
        }
        System.out.println("雇用フェーズを終わります");
    }

    public void ScoreCalculation() {
        for(String key : d.score.keySet()) {
            int value = d.score.get(key);
            System.out.println(key + "さんの有能値は" + value);
        }
    }
}