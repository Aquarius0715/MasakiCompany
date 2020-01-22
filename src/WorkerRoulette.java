
import java.util.Random;



public class WorkerRoulette {

    public void WorkerRoulette() {

        DefineHuman d = new DefineHuman();





        int i = new Random().nextInt(3);

        switch (i) {

            case 0:

                d.Employment_NenkinKyohio();

                break;

            case 1:

                d.Employment_NuruErami();

                break;

            case 2:

                d.Employment_TanakaMastoshi();

                break;

            case 3:

                d.Employment_Yamadatarou();

                break;

        }

    }

}