import java.util.Scanner;

class TekstanalyseGammel {
    public static void main (String[]args){
        String input = " ";

        // Opretter String for alphabet
        String alphabet_String = "abcdefghijklmnopqrstuvwxyzæøå";

        // Oppretter Obj. for Alphabet
        Tekst alphabet = new Tekst(alphabet_String);
        char[] char_alphabet = alphabet.doConvertToListOfChar();

        while(input != ""){
            // Tar inn imput fra bruker
            Scanner inn = new Scanner(System.in);
            System.out.println("Skriv inn en tekst å analysere(for å avslutte trykk enter):");
            input = inn.nextLine();

            // Opretter et objekt for teksten
            Tekst tekst = new Tekst(input);

            // Bruker metoden doSammenlignTekster for å telle antall av hver bokstav i alfabetet
            int[] liste_antall = tekst.doCountCharInAlphabet();

            // Printer Det vi har funnet
            if(input != ""){
                for(int i = 0; i < alphabet_String.length(); i++){
                    if(liste_antall[i] != 0){
                        System.out.println(char_alphabet[i] + ": " + liste_antall[i] );
                    }
                }
                System.out.println("annet: " + liste_antall[alphabet_String.length()]);

        }
        else{
            System.out.println("Du har avsluttet programmet");
        }
    }
    }
}

//         int tekst_length = tekst.length();
//         int[] tegn = new int[tekst_length];

//         String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

//         int alphabet_lengde = alphabet.length();
//         int[] tegn_alphabet = new int[alphabet_lengde];
//         char[] char_alphabet = new char[alphabet_lengde];

//         for(int i = 0; i < alphabet_lengde; i ++){
//             tegn_alphabet[i] = alphabet.charAt(i);
//             char_alphabet[i] = alphabet.charAt(i);
//         }

//         for(int j = 0; j < tekst_length; j ++){
//             tegn[j] = tekst.charAt(j); 


//             // TELLER HVOR MANGE GANGER HVERT TEGN BLIR BRUKT
//             for(int n = 0; n < alphabet_lengde; n++){
//                 if (tegn[j] == tegn_alphabet[n]){
//                     antallTegn[n] += 1;
//                 }
//                 else{
//                     antallTegn[29] += 1;

//                 }
//             }
//         }
//         antallTegn[29] -= alphabet_lengde*tekst_length - tekst_length; 


//         // Formatterrer utskrift for bruker 
//         System.out.println("Antall av hver bokstav: ");
//         for(int t = 0; t < alphabet_lengde; t++){
//             System.out.println(char_alphabet[t] + ":  " + antallTegn[t]);
//         }
//         System.out.println("annet: " + antallTegn[29]);

    
    
// }
// }

