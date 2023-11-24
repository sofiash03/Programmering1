public class Oversikt {
    private Student[] studenter;
    private int antStud = 0;

    public Oversikt(Student[] studenter){
        this.studenter = studenter;
        this.antStud = studenter.length;
    }

    public int getAntStud(){
        return antStud;
    }

    public int finnAntOpgForStud(String studentNavn){
        int studentAntOpg = 0;
        boolean studentExists = false;

        for(int i = 0; i < studenter.length; i++){
            if(studenter[i].getNavn().equals(studentNavn)){
                studentAntOpg = studenter[i].getAntOppg();
                studentExists = true;
            }
        }
        if(studentExists){
            return studentAntOpg;
        }
        else{
            throw new IllegalArgumentException("Student by this name does not exist.");
        }
    }
    public void registrerNyStud(Student student){
        Student[] nyStudenter = new Student[antStud + 1];

        for(int i = 0; i < antStud; i++){
            nyStudenter[i] = studenter[i];
        }
        nyStudenter[antStud] = student;

        this.studenter = nyStudenter;
        this.antStud = antStud + 1;
    }
    public void okAntOpgForStud(String studentNavn, int okning){
        boolean studentExists = false;
        Student student = studenter[0];

        for(int i = 0; i < studenter.length; i++){
            if(studenter[i].getNavn().equals(studentNavn)){
                student = studenter[i];
                studentExists = true;
            }
        }
        if(studentExists){
            student.okAntOppg(okning);
        }
        else{
            throw new IllegalArgumentException("Student by this name does not exist.");
        }
    }
    public String toString(){
        StringBuilder string = new StringBuilder("\nDet er registrert " + antStud + " studenter:");
        for(int i = 0; i < antStud; i++){
            string.append("\n").append(studenter[i].toString());
        }
        return string.toString();

    }
}