import java.util.Scanner;

public class DefineHuman {






    void DecideMyProfiel() {                                       //主人公のプロフィールを決める

        Human h = new Human();

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





    public void Employment_NenkinKyohio() {

        Human h = new Human();

        h.PersonalityAll(true, "年金 拒否男", 72, false);

        h.RegularWorkaerCheck();

        if (h.regularworker == true) {

            h.DecideRarityEpic();

        } else if (h.regularworker == false) {

            h.DecideRarityCommon();

            h.SexCheck();

        }

        System.out.println(h.prefix + h.regularworkerresult + h.name + "、" + h.age_word + "、" + h.sexresult + "で、" + h.ind + "を雇用しました");

    }



    public void Employment_TanakaMastoshi() {

        Human h = new Human();

        h.PersonalityAll(true, "田中　雅功", 32, true);

        h.RegularWorkaerCheck();

        if (h.regularworker == true) {

            h.DecideRarityEpic();

        } else if (h.regularworker == false) {

            h.DecideRarityCommon();

            h.SexCheck();

        }

        System.out.println(h.prefix + h.regularworkerresult + h.name + "、" + h.age_word + "、" + h.sexresult + "で、" + h.ind + "を雇用しました");

    }



    public void Employment_Yamadatarou() {

        Human h = new Human();

        h.PersonalityAll(true, "山田　太郎", 58, true);

        h.RegularWorkaerCheck();

        if (h.regularworker == true) {

            h.DecideRarityEpic();

        } else if (h.regularworker == false) {

            h.DecideRarityCommon();

            h.SexCheck();

        }

        System.out.println(h.prefix + h.regularworkerresult + h.name + "、" + h.age_word + "、" + h.sexresult + "で、" + h.ind + "を雇用しました");

    }



    public void Employment_NuruErami() {

        Human h = new Human();

        h.PersonalityAll(false, "塗瑠　偉美", 22, false);

        h.RegularWorkaerCheck();

        if (h.regularworker == true) {

            h.DecideRarityEpic();

        } else if (h.regularworker == false) {

            h.DecideRarityCommon();

            h.SexCheck();

        }

        System.out.println(h.prefix + h.regularworkerresult + h.name + "、" + h.age_word + "、" + h.sexresult + "で、" + h.ind + "を雇用しました");

    }

}

