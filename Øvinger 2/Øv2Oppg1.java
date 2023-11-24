//Øving 2 Kontrollstrukturen valg
//Oppgave 1
//Et år er skuddår dersom det er delelig med 4. Unntaket er hundreårene, de må være delelig med 400.
//Tegn aktivitetsdiagram som viser algoritmen for å finne ut om et år er skuddår. Årstallet skal 
//leses inn fra brukeren. Sett opp testdata. Lag og prøv ut programmet.

import javax.swing.JOptionPane;

class Skuddår {
public static void main(String[]args) {

    String readårstall = JOptionPane.showInputDialog("Årstall: ");
    int årstall = Integer.parseInt(readårstall);

    if (årstall % 4 == 0 && årstall % 100 != 0 && årstall != 0 || årstall % 400 == 0 && årstall != 0 ){
        JOptionPane.showMessageDialog(null, "år " + årstall + " er et skuddår! :)");
        
    }
    if (årstall == 0){
        JOptionPane.showMessageDialog(null, "år " + årstall + " eksisterer ikke :/");
    }

    else {
        JOptionPane.showMessageDialog(null, "år " + årstall + " er ikke et skuddår! :(");

    }
}
}






