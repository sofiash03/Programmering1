class Brøk{
    private int teller; 
    private int nevner;


    public Brøk(int teller, int nevner){
        if (nevner == 0){
            throw new IllegalArgumentException("Nevneren kan ikke være 0");
        }
    
        this.teller = teller;
        this.nevner = nevner; 

    }
    public Brøk(int teller){
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller(){
        return teller;
    }
    public int getNevner(){
        return nevner;
    }

    public void doSum(Brøk annenBrøk){
        int annenNevner = annenBrøk.getNevner();
        int annenTeller = annenBrøk.getTeller();

        this.teller = teller*annenNevner + annenTeller*nevner;
        this.nevner = nevner*annenNevner;
    
    }

    public void doSubtract(Brøk annenBrøk){
        int annenNevner = annenBrøk.getNevner();
        int annenTeller = annenBrøk.getTeller();

        this.teller = teller*annenNevner - annenTeller*nevner;
        this.nevner = nevner*annenNevner;
    }

    public void doMultiplication(Brøk annenBrøk){
        int annenNevner = annenBrøk.getNevner();
        int annenTeller = annenBrøk.getTeller();

        this.teller = teller*annenTeller;
        this.nevner = nevner*annenNevner; 

    }
    public void doDivision(Brøk annenBrøk){
        int annenNevner = annenBrøk.getNevner();
        int annenTeller = annenBrøk.getTeller();

        this.teller = teller*annenNevner;
        this.nevner = nevner*annenTeller;
    }
    public void doSimplify(){
        if(nevner % teller == 0 ){
            this.nevner = nevner/teller;
            this.teller = teller/teller;
        }
        else{
            for(int i = 1; i <= teller; i++){
                if(teller % i == 0 && nevner % i == 0 ){
                    this.teller = teller/i; 
                    this.nevner = nevner/i; 
                }
            }
        }
    }
}