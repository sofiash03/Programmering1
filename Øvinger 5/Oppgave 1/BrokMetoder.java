public class BrokMetoder {
    public static void main (String[]args){
        Brøk brok1 = new Brøk(1,3);
        Brøk brok2 = new Brøk(1, 5); 

        //METODER
            //ADDISJON
        brok1.doSum(brok2);
        int teller = brok1.getTeller();
        int nevner = brok1.getNevner();
        System.out.println(teller + "/" + nevner); 


            //SUBTRAKSJON
        brok1.doSubtract(brok2);
        teller = brok1.getTeller();
        nevner = brok1.getNevner(); 
        System.out.println(teller + "/" + nevner); 


            //MULTIPLIKASJON
        brok1.doMultiplication(brok2);
        teller = brok1.getTeller();
        nevner = brok1.getNevner();
        System.out.println(teller + "/" + nevner);

            //DIVISJON
        brok1.doDivision(brok2);
        teller = brok1.getTeller();
        nevner = brok1.getNevner(); 
        System.out.println(teller + "/" + nevner); 

            // FORKORTER BRØKEN
        Brøk brok3 = new Brøk(2, 6);
        brok3.doSimplify();
        int teller_3 = brok3.getTeller();
        int nevner_3 = brok3.getNevner(); 
        System.out.println(teller_3 + "/" + nevner_3);
    }
    
}
