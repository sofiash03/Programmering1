import java.util.Scanner;

class Matrise{
    private int[] rad1;
    private int[] rad2;

    public Matrise(int[] rad1, int[] rad2){
        this.rad1 = rad1;
        this.rad2 = rad2; 
    }

    public int[] getRad1(){
        return rad1;
    }

    public int[] getRad2(){
        return rad2;
    }

    public Matrise doSum(Matrise annenMatrise){
        int[] annenRad1 = annenMatrise.getRad1(); 
        int[] annenRad2 = annenMatrise.getRad2();

        int lengde = rad1.length; 

        int[] new_rad1 = new int[lengde];
        int[] new_rad2 = new int[lengde];

        if(rad1.length == annenRad1.length && rad2.length == annenRad2.length && 
        rad2.length == rad1.length){

            for(int i = 0; i < lengde; i++){
                new_rad1[i] = rad1[i] + annenRad1[i];
                new_rad2[i] = rad2[i] + annenRad2[i];
            }
        }
        Matrise summertMatrise = new Matrise(new_rad1, new_rad2);
        return summertMatrise; 
    }

    public Matrise doMultiplication(Matrise annenMatrise){
        int[] annenRad1 = annenMatrise.getRad1(); 
        int[] annenRad2 = annenMatrise.getRad2();

        int element1 = 0; 
        int element2 = 0; 
        int element3 = 0;
        int element4 = 0; 

        
        if(rad2.length == rad1.length && rad1.length == 2){

            int[] col1 = {annenRad1[0], annenRad2[0]};
            int[] col2 = {annenRad1[1], annenRad2[1]}; 

            for(int i = 0; i < rad1.length; i++){
                element1 += rad1[i]*col1[i];
                element2 += rad1[i]*col2[i];
                element3 += rad2[i]*col1[i];
                element4 += rad2[i]*col2[i];
            }       
        }
            int[] new_rad1 = {element1, element2};
            int[] new_rad2 = {element3, element4};
            
            Matrise multiplisertMatrise = new Matrise(new_rad1, new_rad2);
            return multiplisertMatrise;
        }
        public Matrise doTransponere(){

            int[] newrad1 = new int[rad1.length];
            int[] newrad2 = new int[rad1.length];

            if(rad1.length == rad2.length){
                newrad1[0] = rad1[0];
                newrad1[1] = rad2[0];

                newrad2[0] = rad1[1];
                newrad2[1] = rad2[1];

            }
            Matrise transponertMatrise = new Matrise(newrad1, newrad2);
            return transponertMatrise;

        }       
    }