package sk.sosholic.prvypolrok.Hadaniecisla;

import java.util.Random;
import java.util.Scanner;

public class HadaneCislo {

    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 20;
        int cisloKtoreTrebaUhadnut = r.nextInt( high - low) + low;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Toto je hra na hladaanie cisla od 1 do 10000");
        System.out.println("Mas 10 pokusov");
        int x = 0;
        while (x<10){
            System.out.print("zadaj cislo: ");
            int cislo = scanner.nextInt();
            System.out.println("zadane cislo je: " + cislo);
            boolean neco =cislo<cisloKtoreTrebaUhadnut;
            if(cislo>cisloKtoreTrebaUhadnut){
                System.out.println("zadane cislo " + cislo + "je vecsie");
            }else if (neco){
                System.out.println("zadane cislo " + cislo + "je mensie");
            }else {
                System.out.println("zadane cislo " + cislo + "su rovne");
            }
          x++;
        }



    }
}
