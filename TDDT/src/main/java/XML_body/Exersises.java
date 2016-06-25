package XML_body;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Stefan on 25.06.2016.
 */
public class Exersises {
     ArrayList<Exersise> exersises = new ArrayList<Exersise>();
    public Exersises(){
        //Cant construct this body in Code
    }
    public void createExersise()
    {
        exersises.add(new Exersise());
    }

}
