import java.util.Random;



public class Human {

    ////////////////////////////////////変数を指定

    String prefix = "[会社ログ]";

    boolean sex;

    String name;

    int age;

    String age_word;

    boolean regularworker;

    int IndividualValue;

    String ind;

    String regularworkerresult;

    String sexresult = null;

    ////////////////////////////////////

    public void PersonalityAll(boolean sex, String name, int age, boolean regularworker) {           //登場人物の根幹となる

        this.name = name;

        this.sex = sex;

        this.age = age;

        this.age_word = this.age + "才";           //intをStringに変換

        this.regularworker = regularworker;

        int RandomIndividualValue = new Random().nextInt(100 + 1);

        this.IndividualValue = RandomIndividualValue;

    }



    public String RegularWorkaerCheck() {                                               //労働の種類を決める



        if (regularworker == true) {

            regularworkerresult = ("正規労働者、");

        } else regularworkerresult = ("非正規労働者、");

        return regularworkerresult;

    }



    public boolean SexCheck() {                                                        //性別を判定する



        if (sex == true) {                                           //trueの場合男

            sexresult = ("性別は男");                                         //falseの場合女

        } else sexresult = ("性別は女");

        return sex;

    }





    public String DecideRarityCommon() {                                                //非正規労働者の場合のレアリティを決める

        if(IndividualValue >= 1 && IndividualValue <= 20) {         //20%の確率で有能値[ゴミ]を雇用

            ind = "[ゴミ]";

        } else

        if (IndividualValue >= 21 && IndividualValue <= 30) {       //10%の確率で有能値[無能]を雇用

            ind = "[無能]";

        } else

        if (IndividualValue >= 31 && IndividualValue <= 60) {       //30%の確率で有能値[普通]を雇用

            ind = "[普通]";

        } else

        if(IndividualValue >= 61 && IndividualValue <= 90) {        //30%の確率で有能値[使える]を雇用

            ind = "[使える]";

        } else

        if(IndividualValue >= 91 && IndividualValue <= 82) {        //7%の確率で有能値[有能]を雇用

            ind = "[有能]";

        } else

        if(IndividualValue >= 93 && IndividualValue <= 100)

            ind = "[超有能]";

        {        //3%の確率で有能値[超有能]を雇用

        }

        return ind;

    }



    public String DecideRarityEpic() {                                                  //正規労働者の場合のレアリティを決める

        if (IndividualValue >= 1 && IndividualValue <= 10) {                //10%の確率で有能値[ゴミ]を雇用

            ind = "[ゴミ]";

        } else if (IndividualValue >= 11 && IndividualValue <= 20) {        //10%の確率で有能値[無能]を雇用

            ind = "[無能]";

        } else if (IndividualValue >= 21 && IndividualValue <= 55) {        //35%の確率で有能値[普通]を雇用

            ind = "[普通]";

        } else if (IndividualValue >= 56 && IndividualValue <= 82) {        //27%の確率で有能値[使える]を雇用

            ind = "[使える]";

        } else if (IndividualValue >= 83 && IndividualValue <= 92) {        //10%の確率で有能値[有能]を雇用

            ind = "[有能]";

        } else if (IndividualValue >= 93 && IndividualValue <= 98) {       //7%の確率で有能値[超有能]を雇用

            ind = "[超有能]";

        } else if (IndividualValue >= 99 && IndividualValue <= 100) {       //1%の確率で有能値[エリート]を雇用

            ind = "[エリート]";





        }

        return ind;

    }

}