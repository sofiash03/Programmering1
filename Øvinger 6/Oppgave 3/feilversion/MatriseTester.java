class MatriseTester {
    public static void main (String[]args){
        int[] matrise1rad1 = {1, 2};
        int[] matrise1rad2 = {3, 4};

        int[] matrise2rad1 = {5, 6};
        int[] matrise2rad2 = {7, 8}; 

        Matrise matrise1 = new Matrise(matrise1rad1,matrise1rad2);
        Matrise matrise2 = new Matrise(matrise2rad1, matrise2rad2);

        // Summerer matrisene
        Matrise summertMatrise = matrise1.doSum(matrise2);
        int[] summertrad1 = summertMatrise.getRad1();
        int[] summertrad2 = summertMatrise.getRad2();

        System.out.println("|" + summertrad1[0] + " " + summertrad1[1] + "|");
        System.out.println("|" + summertrad2[0] + " " + summertrad2[1] + "|\n");


        // multipliserer matrisene
        Matrise multiplisertMatrise = matrise1.doMultiplication(matrise2);
        int[] multipliseertrad1 = multiplisertMatrise.getRad1();
        int[] multipliseertrad2 = multiplisertMatrise.getRad2();

        System.out.println("|" + multipliseertrad1[0] + " " + multipliseertrad1[1] + "|");
        System.out.println("|" + multipliseertrad2[0] + " " + multipliseertrad2[1] + "|\n");

        // Transponere matrise
        Matrise transponertMatrise = matrise1.doTransponere();
        int[] transponertRad1 = transponertMatrise.getRad1();
        int[] transponertRad2 = transponertMatrise.getRad2();

        System.out.println("|" + transponertRad1[0] + " " + transponertRad1[1] + "|");
        System.out.println("|" + transponertRad2[0] + " " + transponertRad2[1] + "|\n");
    }
    
}
