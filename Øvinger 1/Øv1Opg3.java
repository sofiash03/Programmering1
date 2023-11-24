//Oppgave 3
//Skriv et program som leser inn et antall sekunder og beregner hvor mange timer, minutter og sekunder dette er. (Hint: Bruk heltallsdivisjon.) Sett opp testdatasett og prøv ut programmet"


import java.util.Scanner;

class TidTilSekunder {
   TidTilSekunder() {
   }

   public static void main(String[] args) {
      Scanner inn = new Scanner(System.in);
      System.out.println("Antall sekunder: ");
      int Sekunder = inn.nextInt();

      
      int timer = Sekunder / 3600;
      int min = Sekunder % 3600 / 60;
      int sek = Sekunder % 3600 % 60;
      System.out.println( Sekunder + " sekunder er " + timer + " timer, " + min + " min, og " + sek + " sekunder!<3 ");
   }
}

