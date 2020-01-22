
import java.util.Scanner;



public class Employment {



    public void Employment() {

        WorkerRoulette w = new WorkerRoulette();

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

            }

        }

        System.out.println("雇用フェーズを終わります");

    }

}