import java.util.Scanner;

public class GameSystem {

    int day;

    public void GameSystem() {

                System.out.println("DAY" + day++);

    }

    public void Opening() {
        System.out.println("鬼畜会社経営");
        while (true) {
            System.out.println("「スタート」と入力してください。");
            String start = new Scanner(System.in).nextLine();
            if (start.equals("スタート")) {
                System.out.println("ゲームスタート！");
                break;
            } else System.out.println("打ちなおしてください。");
        }
    }
}
