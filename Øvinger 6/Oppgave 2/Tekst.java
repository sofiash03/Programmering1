 class Tekst {
    public String tekst;


    public Tekst(String tekst){
        this.tekst = tekst.toLowerCase(); 
    }

    public String getTekst(){
        return tekst;
    }
    public int[] doOprettListe(){
        int[] listeBokstaver = new int[tekst.length()];
        return listeBokstaver;
    }

    public int[] doConvertToListOfInt(){
        int[] tegn_tekst = new int[tekst.length()];

        for(int i = 0; i < tekst.length(); i ++){
            tegn_tekst[i] = tekst.charAt(i);
        }
        return tegn_tekst;
    }
    public char[] doConvertToListOfChar(){
        char[] char_tekst = new char[tekst.length() + 1];
        for(int i = 0; i < tekst.length(); i ++){
            char_tekst[i] = tekst.charAt(i);
        }
        return char_tekst;
    }

    public int[] doCountCharInAlphabet(){
        // OPPRETTER EN LISTE OG OBJ FOR ALPHABETET
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
        Tekst alphabet_obj = new Tekst(alphabet);
        int[] tegn_alphabet = alphabet_obj.doConvertToListOfInt(); 

        // OPPRETTER EN LISTE FOR TEKSTEN
        int[] tegn = new int[tekst.length()];

        // OPRETTER EN LISTE SOM SAMLER PÅ ANTALL AV HVERT TEGN
        int[] antallTegn = new int[alphabet.length() + 1];

        // TELLER HVOR MANGE GANGER HVERT TEGN BLIR BRUKT
        for(int j = 0; j < tekst.length(); j ++){
            tegn[j] = tekst.charAt(j); 

            // SAMMENLIGNER LISTENE
            for(int n = 0; n < alphabet.length(); n++){
                if (tegn[j] == tegn_alphabet[n]){
                    antallTegn[n] += 1;
                }
                else{
                    antallTegn[alphabet.length()] += 1;
                }
            }
        }
        // FJERNER DE EKSTRA TEGNENE
        antallTegn[alphabet.length()] -= alphabet.length()*tekst.length() - tekst.length();

        return antallTegn;
    }
}