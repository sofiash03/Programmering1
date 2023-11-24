class NyString {
    public String tekst;

    public NyString(String tekst){
        this.tekst = tekst;
    }

    public String getTekst(){
        return tekst;
    }

    public NyString doFrokorting(){
        String vartekst = tekst.toLowerCase();
        String[] ord = vartekst.split(" ");
        String nystring = ""; 

        for(int i = 0; i < ord.length; i++){
            nystring += ord[i].charAt(0);
        }
        NyString nytekst = new NyString(nystring);
        return nytekst; 
    }
    public NyString doFjernTegn(char tegn){
        String nysetning = "";
        String vartekst = tekst; 

        for(int i = 0; i < tekst.length(); i++){
            if(tekst.charAt(i) != tegn){
                nysetning += vartekst.charAt(i);
            }
        }
        NyString fjernetSetning = new NyString(nysetning);
        return fjernetSetning;
    }
    
}
