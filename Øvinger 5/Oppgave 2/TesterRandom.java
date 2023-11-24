import java.util.Random;

public class TesterRandom{
    public static void main (String[]args){
        MinRandom tall = new MinRandom();
        int ovre_grense = 3;
        
        for(int i = 1; i <= 100; i++){
            int random_heltall = tall.nesteHeltall(1, ovre_grense + 1);
            double random_desimaltall = tall.nesteDesimaltal(1, ovre_grense+1);

            // System.out.println("\n-- TEST nr. " + i + " -- \n Nedre grense: 1 \n Ovre grense: " + ovre_grense );

            // System.out.println("- Et tilfeldig heltall: " + random_heltall);
            // System.out.println("- Et tilfeldig desimaltall: " + random_desimaltall);

            if(random_desimaltall == ovre_grense){
                System.out.println("\n-- TEST nr. " + i + "\n det tilfeldige desimaltallet: " + random_desimaltall);

            }
            if(random_heltall == ovre_grense){
                System.out.println("\n-- TEST nr. " + i + "\n det tilfeldige heltallet: " + random_heltall);
           }

        }
    }
}
