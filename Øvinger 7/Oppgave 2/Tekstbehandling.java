class Tekstbehandling {
    public String tekst; 
    
    public Tekstbehandling(String tekst){
        this.tekst = tekst; 

    }
    public String getTekst(){
        return tekst; 
    }

    public String toUppercase(){
        return tekst.toUpperCase();
    }

    public int finnAntallOrd(){
        String tegn = "!:?. ";
        String[] ord = tekst.split("[" + tegn + "]");
        int antall = ord.length;
        return antall; 
    }

    public float finnGjennomsnittAntallOrd(){
        String tegn = ".!?:";
        String[] settninger = tekst.split("[" + tegn + "]");
        float antallOrd = 0;

        for(int i = 0; i < settninger.length; i++){
            String[] ord = tekst.split(" "); 
            antallOrd += ord.length; 
        }
        float antallSettninger = settninger.length; 
        float gjennomsnitt = antallOrd/antallSettninger;
        return gjennomsnitt; 
    }

    public float finnGjennomsnittOrdLengde(){
        String tegn = ".!?:";
        String[] ord = tekst.split(" ");
        float lengde_ord = 0;

        String[] nyord = new String[ord.length];

        for(int j = 0; j < ord.length; j++){
            String[] newstring = ord[j].split("[" + tegn + "]");
            nyord[j] = newstring[0];
        }

        for(int i = 0; i < nyord.length; i++){
            lengde_ord += nyord[i].length();
        }

        float antallOrd = nyord.length; 
        float gjennomsnitt = lengde_ord/(antallOrd); 
        return gjennomsnitt; 
    }
    public String findAndReplace(String find, String replace){

        String nyTekst = "";
        String[] ord = tekst.split(" ");

        for(int i = 0; i < ord.length; i++){

            if ((ord[i].substring(0, ord[i].length() - 1)).equals(find)){
                nyTekst += replace + ord[i].substring(ord[i].length() - 1, ord[i].length());
            }
            else if(ord[i].equals(find)){
                nyTekst += replace; 

            }
            else{
                nyTekst += ord[i];
            }
            nyTekst += " ";
        }
        return nyTekst;

    }
}
