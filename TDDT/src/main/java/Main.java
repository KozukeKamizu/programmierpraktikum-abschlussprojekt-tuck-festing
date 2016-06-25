import XML_body.*;

/**
 * Created by Andreas on 24.06.2016.
 */
public class Main {

    public static void main(String[] args){

        System.out.println("Hello Tuck Festing!");
        Exersises e = new Exersises();
       // System.out.println(e.exersises.get(0).exersiseName);
        XMLController.saveAllExercises(e);
    }


}
