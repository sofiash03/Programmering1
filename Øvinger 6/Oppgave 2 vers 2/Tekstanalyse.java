class Tekstanalyse {
    public int[] antallTegn = new int[30];
    public String tekst;

    public Tekstanalyse(String tekst){
        // OPPRETTER EN LISTE FOR ALPHABETET
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
         
        // OPPRETTER EN LISTE FOR TEKSTEN
        tekst = tekst.toLowerCase();
        int[] tegn = new int[tekst.length()];
        
        // TELLER HVOR MANGE GANGER HVERT TEGN BLIR BRUKT
            for(int j = 0; j < tekst.length(); j ++){
                tegn[j] = tekst.charAt(j); 
        
                // SAMMENLIGNER LISTENE
                for(int n = 0; n < alphabet.length(); n++){
                    if (tegn[j] == alphabet.charAt(n)){
                        antallTegn[n] += 1;
                    }
                    else{
                        antallTegn[29] += 1;
                    }
            }
        }
        // FJERNER DE EKSTRA TEGNENE
        antallTegn[29] -= alphabet.length()*tekst.length() - tekst.length();

        // OBJEKTVARIABLENE
        this.antallTegn = antallTegn;
        this.tekst = tekst;
    }

    
    public int[] getAntallTegn(){
        return antallTegn; 
    }

    public int doFindTotalLetters(){
        int sum = 0;
        for(int i = 0; i < 29; i++){
            if(i != 29 && antallTegn[i] != 0){
                sum += 1;
            }
        }
        return sum; 
    }
    public int doFindTotalOf(String letter){
        int letternumber = letter.charAt(0);
        int sum_letter = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

        for(int i = 0; i < antallTegn.length - 1; i++){
            if(alphabet.charAt(i) == letternumber){
                sum_letter = antallTegn[i];
            }
        }
        return sum_letter;
    }
    public float doFindProsentNotLetters(){
        float prosent = (antallTegn[29]*100)/tekst.length();
        return prosent; 
    }
    public String doFindMostUsedLetter(){
        int tegn = 0;
        String mestBrukt = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

        for(int i = 0; i < alphabet.length(); i++){
            char letter = alphabet.charAt(i);

            if (antallTegn[i] > tegn){
                tegn = antallTegn[i];
                mestBrukt = "";
                mestBrukt += letter;
            }
            else if(antallTegn[i] == tegn){
                mestBrukt += letter; 
            }
        }
        return mestBrukt; 
    }

}

