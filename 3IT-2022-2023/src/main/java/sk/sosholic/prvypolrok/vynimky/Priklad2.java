package sk.sosholic.prvypolrok.vynimky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Priklad2 {

    public static void main(String[] args) {

        List<String> mojList = Arrays.asList("jablko","hruska","slivka");
    try{
        System.out.println(mojList.get(3));
    }catch (Exception ex){
        System.out.println("mame chybu"  );
    }
    }
}
