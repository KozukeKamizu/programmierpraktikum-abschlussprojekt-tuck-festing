import XML_body.*;

/**
 * Created by Andreas on 24.06.2016.
 */
import java.util.ArrayList;
public class Main {

    public static void main(String[] args){

        System.out.println("Hello Tuck Festing!");
        Exersises e = new Exersises();
        Exersise t = new Exersise();
        t.setExersiseName("test");
        ArrayList<Exersise> tl = new ArrayList<Exersise>();
        tl.add(t);
        e.setExersises(tl);
       // System.out.println(e.exersises.get(0).exersiseName);
        XMLController.saveAllExercises(e);
    }


}
