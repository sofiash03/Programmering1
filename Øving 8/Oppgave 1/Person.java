class Person {
    private String fornavn; 
    private String etternavn; 
    private int fodselsar; 

    public Person(String fornavn, String etternavn, int fodselsar){
        this.fornavn = fornavn; 
        this.etternavn = etternavn; 
        this.fodselsar = fodselsar; 

    }
    public String getFornavn(){
        return fornavn;
        }

    public String getEtternavn(){
        return etternavn;
        }

    public int getFodselsar(){
        return fodselsar;
        }
    
    public void setFornavn(String newFornavn){
        this.fornavn = newFornavn;
    }
    public void setEtternavn(String newEtternavn){
        this.etternavn = newEtternavn;
    }
    public void setFodselsar(int newFodselsar){
        this.fodselsar = newFodselsar;
    }
}
