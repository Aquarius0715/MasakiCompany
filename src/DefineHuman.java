import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DefineHuman {

    //インスタンスを生成する
    Human h = new Human();

    //Mapを生成する
    Map<String, Integer> score = new HashMap<String, Integer>();
    Map<Integer, DefineHuman> workers = new HashMap<Integer, DefineHuman>();


    void DecideMyProfiel() {                                       //主人公のプロフィールを決める
        System.out.println("面接官：それでは名前を教えてください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println(name + "さんこんにちは。");
        System.out.println("面接官：年齢はいくつですか");
        int age = new Scanner(System.in).nextInt();
        System.out.println(age + "才ですか。");
        System.out.println("面接官：" + name + "さん、早速ですがあなたの採用が決まりました。おめでとうございます");
        h.RegularWorkaerCheck();
        h.PersonalityAll(true, name, age, true);
        if (h.regularworker == true) {
            h.DecideRarityEpic();
        } else if (h.regularworker == false) {
            h.DecideRarityCommon();
        }
        System.out.println(h.prefix + h.name + "さんのプロフィールは" + h.regularworkerresult + h.age_word + "で、有能値は" + h.ind + "です");
    }

    public DefineHuman Employment_NenkinKyohio() {
        h.PersonalityAll(true, "年金 拒否男", 72, false);
        h.RegularWorkaerCheck();
        if (h.regularworker == true) {
            h.DecideRarityEpic();
        } else if (h.regularworker == false) {
            h.DecideRarityCommon();
            h.SexCheck();
            score.put(h.name, h.IndividualValue );
            workers.put(0, Employment_NenkinKyohio());
        }
        System.out.println(h.prefix + h.regularworkerresult + h.name + "、" + h.age_word + "、" + h.sexresult + "で、" + h.ind + "を雇用しました");
        return Employment_NenkinKyohio();
    }

    public DefineHuman Employment_TanakaMastoshi() {
        h.PersonalityAll(true, "田中　雅功", 32, true);
        h.RegularWorkaerCheck();
        if (h.regularworker == true) {
            h.DecideRarityEpic();
        } else if (h.regularworker == false) {
            h.DecideRarityCommon();
            h.SexCheck();
            score.put(h.name, h.IndividualValue );
            workers.put(1, Employment_TanakaMastoshi());
        }
        System.out.println(h.prefix + h.regularworkerresult + h.name + "、" + h.age_word + "、" + h.sexresult + "で、" + h.ind + "を雇用しました");
        return Employment_TanakaMastoshi();
    }

    public DefineHuman Employment_Yamadatarou() {
        h.PersonalityAll(true, "山田　太郎", 58, true);
        h.RegularWorkaerCheck();
        if (h.regularworker == true) {
            h.DecideRarityEpic();
        } else if (h.regularworker == false) {
            h.DecideRarityCommon();
            h.SexCheck();
            score.put(h.name, h.IndividualValue );
            workers.put(2, Employment_Yamadatarou());
        }
        System.out.println(h.prefix + h.regularworkerresult + h.name + "、" + h.age_word + "、" + h.sexresult + "で、" + h.ind + "を雇用しました");
        return Employment_Yamadatarou();
    }

    public DefineHuman Employment_NuruErami() {
        h.PersonalityAll(false, "塗瑠　偉美", 22, false);
        h.RegularWorkaerCheck();
        if (h.regularworker == true) {
            h.DecideRarityEpic();
        } else if (h.regularworker == false) {
            h.DecideRarityCommon();
            h.SexCheck();
            score.put(h.name, h.IndividualValue );
            workers.put(3, Employment_NuruErami());
        }
        System.out.println(h.prefix + h.regularworkerresult + h.name + "、" + h.age_word + "、" + h.sexresult + "で、" + h.ind + "を雇用しました");
        return Employment_NuruErami();
    }
}

