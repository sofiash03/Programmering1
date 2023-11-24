//Lag et program som hjelper oss i forhold til følgende problemstilling: Kjøttdeig av merke A 
//koster kr 35,90 for 450 gram, mens kjøttdeig av merke B koster kr 39,50 for 500 gram. 
//Hvilket merke er billigst

import javax.swing.JOptionPane;

class Kjøttdeig2 {
    public static void main(String[]args) {
        double prisA = 35.90;
        double vektA = 450;

        double prisB = 39.50;
        double vektB = 500;

        double kjøttdeigA_kg = ((prisA / vektA)*1000);
        double kjøttdeigB_kg = ((prisB/vektB)*1000);

        double kjøttdeigA_kgPris = Math.floor(kjøttdeigA_kg*100)/100;
        double kjøttdeigB_kgPris = Math.floor(kjøttdeigB_kg*100)/100;

        if (kjøttdeigA_kgPris < kjøttdeigB_kgPris){
            JOptionPane.showMessageDialog(null, "Kjøttdeig fra merke A (" + kjøttdeigA_kgPris + "kr per kg) er billigere enn kjøttdeigen fra merke B (" + kjøttdeigB_kgPris +"kr per kg)");
        }

        if (kjøttdeigA_kgPris > kjøttdeigB_kgPris){
            JOptionPane.showMessageDialog(null, "Kjøttdeig fra merke B (" + kjøttdeigB_kgPris + "kr per kg) er billigere enn kjøttdeigen fra merke A (" + kjøttdeigA_kgPris +"kr per kg)" );
        }

        if (kjøttdeigA_kgPris == kjøttdeigB_kgPris){
            JOptionPane.showMessageDialog(null, "Kjøttdeigene har samme pris. (" + kjøttdeigA_kgPris + "kr per kg) ");
            
        }
}
}