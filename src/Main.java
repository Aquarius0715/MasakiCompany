import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //////////インスタンスを呼び出す/////
        DefineHuman d = new DefineHuman();
        Employment e = new Employment();
        GameSystem g = new GameSystem();
        //////////////////////////////////

        //オープニング

        g.Opening();

        //自分のプロフィールを設定

        d.DecideMyProfiel();

        //ここから社員を雇っていく

        e.Employment();

        //雇った社員の有能値を計算する
        e.ScoreCalculation();
        //TODO 雇った社員のうちの合計を計算する
    }
}

