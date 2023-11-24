//Oppgave 2
//Skriv et program som regner om timer, minutter og sekunder til totalt antall sekunder. Sett opp testdatasett og prøv ut programmet.


import java.util.Scanner;

class SekunderMinutterTimer
{
    public static void main(String[]args) {

        Scanner inn = new Scanner(System.in);
        System.out.println("Antall timer:");
        double timer = inn.nextDouble();

        System.out.println("Antall minutter:");
        double min = inn.nextDouble();

        System.out.println("Antall sekunder:");
        double sekunder = inn.nextDouble();

        double svar = timer*360 + min*60 + sekunder;
        System.out.print(timer + " timer " + min + " minutter " + sekunder + " sekunder er totalt " + svar + " sekunder");


    }



}