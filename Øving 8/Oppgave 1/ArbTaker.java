import java.util.GregorianCalendar;
class ArbTaker {
    int ansattnr;
    int ansettelsesar;
    int manedslonn;
    float skatteprosent;
    Person person;
    int ar;

    public ArbTaker(Person person, int ansattnr, int ansettelsesar, int manedslonn, float skatteprosent) {
        this.person = person;
        this.ansattnr = ansattnr;
        this.ansettelsesar = ansettelsesar;
        this.manedslonn = manedslonn;
        this.skatteprosent = skatteprosent;

        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        this.ar = kalender.get(java.util.Calendar.YEAR);

    }

    //    GET- metoder
    public int getAnsattnr() {
        return ansattnr;
    }

    public int getAnsettelsesar() {
        return ansettelsesar;
    }

    public int getManedslonn() {
        return manedslonn;
    }

    public float getSkatteprosent() {
        return skatteprosent;
    }
    public Person getPerson(){
        return person;
    }

    public void setAnsattnr(int ansattnr) {
        this.ansattnr = ansattnr;
    }

    public void setAnsettelsesar(int newAnsettelsesar) {
        this.ansettelsesar = newAnsettelsesar;
    }

    public void setManedslonn(int newManedslonn) {
        this.manedslonn = newManedslonn;
    }

    public void setSkatteprosent(float newSkatteprosent) {
        this.skatteprosent = newSkatteprosent;
    }
    
    public float doFinnSkattetrekkMande(){
        float skattedesimal = skatteprosent/100;        //overfører skatteprosenten til desimaltall, feks 21% --> 0.21
        return skattedesimal*manedslonn;                // ganger med månedslønnen for å finne hvor mye den trekkes i månden
    }
    public int doFinnBruttoLonnAr(){
        return manedslonn * 12;
    }       // Bruttolønn = lønn uten skatt, finner lønn uten noen skattetrekk
    
    public float doFinnSkattetrekkAr(){
        float skattedesimal = skatteprosent/100;                // finner skatt i desimaltall
        float mandestrekk = skattedesimal*manedslonn;           // finner ut hvor mye som blir trukket i månden
        float skattetrekk = 10*mandestrekk + mandestrekk/2;     // siden juni er skattefritt og i december halveres skatten ganger med 10.5

        return skattetrekk; 
    }
    public String doFormaterNavn(){
        String newstring = "";
        newstring += person.getEtternavn() + ", " + person.getFornavn();
        return newstring; 
    }
    public int doFinnAlder(){
        int fodselsar = person.getFodselsar();
        int alder = ar - fodselsar;                             // Finner fødselsår og året nå, trekker fra for å finne alder

        return alder;

    }
    public int doFinnArAnsatt(){
        int antallArAnsatt = ar - ansettelsesar;               // bruker året nå og trekker fra ansettelsesåret for å finne antall år anatt

        return antallArAnsatt;     
    }

    public boolean doPersonAnsattLengerEnn(int antallAr){
        int antallArAnsatt = ar - ansettelsesar;
        boolean sant = false;
        
        if(antallArAnsatt > antallAr){                         // sjekker om antall år ansatt er større enn det vi leter etter
            sant = true;
        }
        return sant;
    }
    public void doPrintAnsattInfo(){
        ArbTaker ansatt = new ArbTaker(person, ansattnr, ansettelsesar, manedslonn, skatteprosent);

        // BErgener basert på DAta, bruker metodene for å finne relevant info
        float arslonn = ansatt.doFinnBruttoLonnAr();
        float skattetrekk = ansatt.doFinnSkattetrekkAr();
        String navn = ansatt.doFormaterNavn();
        int alder = ansatt.doFinnAlder();
        int ar_ansatt = ansatt.doFinnArAnsatt();
        float skattetrekk_mande = ansatt.doFinnSkattetrekkMande();
        boolean ansattLengerEnn10 = ansatt.doPersonAnsattLengerEnn(10);


        //PRINTER DATA
        System.out.println("\n------ ANSATT INFORMASJON -----");
        System.out.println("------     personalia     -----");
        System.out.println("Navn: " + navn);
        System.out.println("Alder: " + alder);

        System.out.println("\n-----     ansatt info.    -----");
        System.out.println("Ansatt nr.: " + ansattnr);
        System.out.println("Ansettelsesår: " + ansettelsesar);
        System.out.println("Antall år ansatt: " + ar_ansatt);

        //Skriver ut dersom arbeidstaker har vært ansatt lenger en (10) år
        if(ansattLengerEnn10){
            System.out.println(person.getEtternavn() + " har vært ansatt lengre enn 10 år " + "\n");
        }
        else{
            System.out.println(person.getEtternavn() + " har ikke vært ansatt lengre enn 10 år " + "\n");
        }

        System.out.println("Månedslønn: " + manedslonn + " kr");
        System.out.println("Årslønn: " + arslonn + " kr/ året");
        System.out.println("Skatteprosent: " + skatteprosent);
        System.out.println("Skattetrekk i månden: " + skattetrekk_mande + " kr");
        System.out.println("Skattetrekk i året: " + skattetrekk + " kr \n");

    }
}