//Oppgave 2
//Skriv et program som finner ut om et tall er et primtall. Et primtall er et tall som kun kan deles 
//med 1 og med seg selv uten å få rest. Les inn tallet fra brukeren og la programmet repetere 
//slik at flere tall kan analyseres

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Primtall{
public static void main(String[]args){
    String readtall1 = JOptionPane.showInputDialog("<html><h2><font color = 'purple'> Velg et tall: </font></h2></html>");
    int tall1 = Integer.parseInt(readtall1);
    boolean primtall = true;

    for (int i = 2; i <= tall1; i++){
        if (tall1 != i){

            if (tall1%i == 0){
                primtall = false;
        }
    }
    }

    if (primtall){
         JOptionPane.showMessageDialog(null, "<html><h3><font color = 'green'>" + tall1 +" er et primtall !! :) <3 </font></h2></html>");
        }

    else{
         JOptionPane.showMessageDialog(null,"<html><h3><font color = 'red'>" + tall1 +" er ikke et primtall >:(</font></h2></html>");
        }
    


        

    }

    }
