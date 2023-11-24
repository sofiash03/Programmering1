//Oppgave 1: 
//Lag et program som skriver ut en del av multiplikasjonstabellen, for eksempel fra 13-15. Da 
//skal utskriften se omtrent slik ut (prikkene skal erstattes med regnestykker).
//13-gangen:
//13 x 1 = 13
//13 x 2 = 26

import java.util.Scanner;

class Gangetabell{
public static void main(String[]args) {
    Scanner readtall1 = new Scanner(System.in);
    System.out.print("Hva skal ganges?: ");
    double tall1 = readtall1.nextDouble();

    Scanner readtall2 = new Scanner(System.in);
    System.out.print("til?: ");
    double tall2 = readtall2.nextDouble();

    Scanner readnedregrense = new Scanner(System.in);
    System.out.print("Nedre grense av gangetabellen?: ");
    double nedregrense = readnedregrense.nextDouble();

    Scanner readøvregrense = new Scanner(System.in);
    System.out.print("Øvre grense av gangetabellen?: ");
    double øvregrense = readøvregrense.nextDouble();

    if(tall1 > tall2){
        for (double n = tall1; n <= tall2; n++){
            System.out.println(" ");
            System.out.println(n + "-gangen");
            for (double i = nedregrense; i <= øvregrense; i++){
                System.out.println(n + " x " + i + " = " + (tall1*i));
    }
    }
}
    else if(tall2 > tall1){
        for (double n = tall2; n <= tall1; n++){
            System.out.println(" ");
            System.out.println(n + "-gangen");
            for (double i = nedregrense; i <= øvregrense; i++){
                System.out.println(n + " x " + i + " = " + (tall2*i));
        

    }
}
}





