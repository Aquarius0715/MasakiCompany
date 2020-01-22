
import java.util.Random;



public class WorkerRoulette {

    DefineHuman d = new DefineHuman();
    private Object DefineHuman;

    public void WorkerRoulette() {

        int i = new Random().nextInt(3);
        for (int key : d.workers.keySet()) {
            DefineHuman = d.workers.get(key);
            if (i == key && i == 0) {
                DefineHuman value = d.workers.get(key);
                System.out.println(value);
            } else if (i == key && i == 1) {
                DefineHuman value = d.workers.get(key);
                System.out.println(value);
            } else if (i == key && i == 2) {
                DefineHuman value = d.workers.get(key);
                System.out.println(value);
            } else if (i == key && i == 3) {
                DefineHuman value = d.workers.get(key);
                System.out.println(value);

                //TODO　HashMapの処理の順番を治す
            }
        }
    }
}