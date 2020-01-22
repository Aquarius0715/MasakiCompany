import java.util.Scanner;



public class Main {



    public static void main(String[] args) {



        //オープニング



        System.out.println("鬼畜会社経営");

        while (true) {

            System.out.println("「スタート」と入力してください。");

            String start = new Scanner(System.in).nextLine();

            if (start.equals("スタート")) {

                System.out.println("ゲームスタート！");

                break;

            } else System.out.println("打ちなおしてください。");

        }

        //自分のプロフィールを設定



        DefineHuman d = new DefineHuman();

        d.DecideMyProfiel();



        //ここから社員を雇っていく



        Employment e = new Employment();

        e.Employment();



    }

}

