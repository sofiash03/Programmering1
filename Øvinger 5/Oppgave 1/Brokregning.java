import java.util.Scanner;

public class Brokregning {

    public static void main(String[]args){
        int onske = 0;
        while(onske != 5){
            //HVILKEN OPERASJON ØNSKER VI Å GJØRE
            Scanner inn_onske = new Scanner(System.in);
            System.out.print("Hva ønsker du å gjøre? \n 1. Addere \n 2. Subtrahere \n 3. Multiplisere \n 4. Dividere \n 5. Avslutt \n");
            onske = inn_onske.nextInt(); 

            if (onske == 5){
                break;
            }


            //DEFINERER DEN FØRSTE BRØKEN
            Scanner inn_teller1 = new Scanner(System.in);
            System.out.print("Skriv inn teller for den første brøken: ");
            int teller1 = inn_teller1.nextInt();

            Scanner inn_nevner1 = new Scanner(System.in);
            System.out.print("Skriv inn nevner for den første brøken: ");
            int nevner1 = inn_nevner1.nextInt();         

            Brøk Brøk1 = new Brøk(teller1, nevner1);
            System.out.println("Brøk 1 er: " + teller1 + "/" + nevner1);


            //DEFINERER DEN ANDRE BRØKEN
            Scanner inn_teller2 = new Scanner(System.in);
            System.out.print("Skriv inn teller for den andre brøken: ");
            int teller2 = inn_teller2.nextInt();

            Scanner inn_nevner2 = new Scanner(System.in);
            System.out.print("Skriv inn nevner for den andre brøken: ");
            int nevner2 = inn_nevner2.nextInt();

            System.out.println("Brøk 2 er: " + teller2 + "/" + nevner2);

            Brøk Brøk2 = new Brøk(teller2, nevner2);


            //UTFØRER HANDLINGER 
            if (onske == 1){
                Brøk1.doSum(Brøk2);
            }
            if (onske == 2){
                Brøk1.doSubtract(Brøk2);
            }
            if (onske == 3){
                Brøk1.doMultiplication(Brøk2);
            }
            if (onske == 4){
                Brøk1.doDivision(Brøk2);
            }
            int teller = Brøk1.getTeller();
            int nevner = Brøk1.getNevner();

            System.out.println("Brøken etter operasjonen er "+ teller + "/" + nevner);



        }


    }





}
