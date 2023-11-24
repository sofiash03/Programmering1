import java.util.Scanner;

class TesterTekstanalyse {
    public static void main(String[] args) {
        String input = "."; 

        while(input != ""){
            Scanner inn = new Scanner(System.in);
            System.out.println("Skriv inn en tekst å analysere(for å avslutte trykk enter):");
            input = inn.nextLine();
            

            if(input != ""){

                Tekstanalyse tekst = new Tekstanalyse(input); 
                int total = tekst.doFindTotalLetters(); 
                int totalNrA = tekst.doFindTotalOf("a");
                float prosentIkkeBokstaver = tekst.doFindProsentNotLetters(); 
                String mestBrukt = tekst.doFindMostUsedLetter();

                System.out.println("Det er " + total + " forskjellige bokstaver. ");
                System.out.println("Det er " + totalNrA + " A-er i teksten ");
                System.out.println(prosentIkkeBokstaver + "% av teksten som ikke er bokstaver. ");
                System.out.println( mestBrukt + " er de(n) mest brukte bokstaven(e). ");
            }
        }
        
    }
    
}
