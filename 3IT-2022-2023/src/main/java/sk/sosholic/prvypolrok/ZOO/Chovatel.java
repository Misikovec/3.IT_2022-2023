package sk.sosholic.prvypolrok.ZOO;

import java.util.ArrayList;
import java.util.List;
public class Chovatel {

    private List<zviera> ZOO = new ArrayList<>();
    private String menoPriezvisko;

    public Chovatel(String menoPriezvisko){
        this.menoPriezvisko = menoPriezvisko;
    }

    public void pridatZviera(zviera animal){
        ZOO.add(animal);
    }

    public zviera zistiNajdrahsieZviera(){
            zviera najdrahsieZviera = ZOO.get(0);
     for (zviera animal : ZOO) {
         if (animal.getValue() >najdrahsieZviera.getValue()){
             najdrahsieZviera = animal;
         }
     }
     return najdrahsieZviera;
    }
}
