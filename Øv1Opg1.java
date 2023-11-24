//Øving 1 Variabler, datatyper og uttrykk

//Skriv et program som regner om fra tommer til centimeter.

import java.util.Scanner;

class VariablerDatatyperUttrykk
{
     public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Lengde (tommer):");
        double lengde = in.nextDouble();

        double svar = lengde*2.54;
        System.out.print(lengde  + " tommer er " + svar + " centimeter" );
        
        in.close();
    }
}






