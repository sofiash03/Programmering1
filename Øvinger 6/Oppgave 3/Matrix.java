import java.util.Scanner;

class Matrix {
    private int antallRader; 
    private int antallKolonner; 
    private int[][] matrise;

    public Matrix(int antallRader, int antallKolonner){
        this.antallRader = antallRader;
        this.antallKolonner = antallKolonner;

        //Fyller Matrisen
        int[][] dennematrisen = new int[antallRader][antallKolonner];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fyll inn elementer i matrisen:");

        for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++) {
                System.out.print("Rad:" + (i + 1) + ", Element:" + (j + 1) + ": ");
                dennematrisen[i][j] = scanner.nextInt();
            }
        }
        this.matrise = dennematrisen;
    }
    public int[][] getMatrix(){
        return matrise;
    }

    public int getAntallRader(){
        return antallRader;
    }
    public int getAntallKolonner(){
        return antallKolonner;
    }

    public int[][] doAdderMatriser(Matrix annenMatrise){
        int[][] addertMatrise = new int[antallRader][antallKolonner];
        if(antallRader == annenMatrise.getAntallRader() && antallKolonner == annenMatrise.getAntallKolonner()){
            for (int i = 0; i < antallRader; i++){
                for(int j = 0; j < antallKolonner; j++){
                    addertMatrise[i][j] = matrise[i][j] + annenMatrise.getMatrix()[i][j];
                }
            }
        }
        return addertMatrise;
    }

    public int[][] doMultiplyMatriser(Matrix annenMatrise){
        int[][] multiplyMatrise = new int[antallRader][antallKolonner];

        if(antallKolonner == annenMatrise.getAntallRader()){
            for(int i = 0; i < antallRader; i++){
                for(int j = 0; j < annenMatrise.getAntallKolonner(); j++){
                    multiplyMatrise[i][j] = 0;
                    for(int g = 0; g < antallKolonner; g++) {
                    multiplyMatrise[i][j] += matrise[i][g]*annenMatrise.getMatrix()[g][j];  //multipliserer A[1][1] med B[1][1], og så vil den loope rundt igjen for A[1][2] og B[2][1]
                    }
                }
            }
        }
        return multiplyMatrise;
    }


    public int[][] doTransponere(){
        int [][] transponertMatrise = new int[antallKolonner][antallRader];
        
        for (int i = 0; i < antallRader; i++){
            for(int j = 0; j < antallKolonner; j++){
                transponertMatrise[j][i] = matrise[i][j];
            }
        }
        return transponertMatrise;
    }
}
