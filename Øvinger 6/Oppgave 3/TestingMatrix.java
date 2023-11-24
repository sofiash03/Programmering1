class TestingMatrix {
    public static void main(String[] args) {
        int rader1 = 2;
        int kolonner1 = 3;
        int rader2 = 3;
        int kolonner2 = 2; 


        Matrix matrise1 = new Matrix(rader1,kolonner1);
        int[][] orig_matrise1 = matrise1.getMatrix();

        Matrix matrise2 = new Matrix(rader2, kolonner2);
        int[][] orig_matrise2 = matrise2.getMatrix();

        // PRINTER MATRISENE
        System.out.println("\n -Matrise 1-");
        for(int i = 0; i < rader1; i++){
            String rad_print = "";
            for(int j = 0; j < kolonner1; j++){
                rad_print += orig_matrise1[i][j] + " ";
                
            }
            System.out.println("| " + rad_print + "|");
        }

        System.out.println("\n -Matrise 2-");
        for(int i = 0; i < rader2; i++){
            String rad_print = "";
            for(int j = 0; j < kolonner2; j++){
                rad_print += orig_matrise2[i][j] + " ";
                
            }
            System.out.println("| " + rad_print + "|");
        }


        // ADDERER MATRISEN
        int[][] addertMatrise = matrise1.doAdderMatriser(matrise2);

        //PRINTER DEN ADDERTE MATRISEN
        System.out.println("\n -Adderte Matrise-");
        for(int i = 0; i < rader1; i++){
            String rad_print = "";
            for(int j = 0; j < kolonner1; j++){
                rad_print += addertMatrise[i][j] + " ";
                
            }
            System.out.println("| " + rad_print + "|");
        }

        //TRANSPONERER MATRISEN 
        int[][] transponertMatrise = matrise1.doTransponere();

        // PRINTER DEN TRANSPONERTE MATRISEN
        System.out.println("\n -Transponerte Matrise-");
        for(int i = 0; i < kolonner1 ; i++){
            String rad_print = "";
            for(int j = 0; j < rader1; j++){
                rad_print += transponertMatrise[i][j] + " ";
                
            }
            System.out.println("| " + rad_print + "|");
    }

        // MULTIPLISERER MATRISENE 
        int[][] multiplyMatrise = matrise1.doMultiplyMatriser(matrise2);

        // PRINTER DEN MULTIPLISERTE MATRISEN
        System.out.println("\n -Multipliserte Matrise-");
        for(int i = 0; i < rader1; i++){
            String rad_print = "";
            for(int j = 0; j < kolonner2; j++){
                rad_print += multiplyMatrise[i][j] + " ";
                
            }
            System.out.println("| " + rad_print + "|");
}
}
}