import java.util.Scanner;

public class KlientProgramStudentOversikt {
    public static void main(String[] args) {
        Student jon = new Student("Jon Bergland", 8);
        Student sofia = new Student("Sofia Habrekke", 8);
        Student nathalie = new Student("Nathalie Andreassen", 8);
        Student johanne = new Student("Johanne Fixdal", 8);
        Student josefine = new Student("Josefine Arntsen", 9);

        Student[] studenter = {jon, sofia, nathalie, johanne, josefine};



        Oversikt BIDATA = new Oversikt(studenter);
        while(true){
            Scanner readChoice = new Scanner(System.in);
            System.out.println("\n- MENU -");
            System.out.println("[1] Finn antall studenter registrert");
            System.out.println("[2] Finn antall oppgaver en student har løst");
            System.out.println("[3] Registrer en ny student");
            System.out.println("[4] Øk antall oppgaver en student har løst");
            System.out.println("[5] Print info om registrerte studenter");
            System.out.println("[6] Avslutt Program");
            int choice = readChoice.nextInt();

            if(choice == 1){
                System.out.println("Det er registrert " + BIDATA.getAntStud() + " studenter");
            }

            if (choice == 2){
                Scanner readNavn = new Scanner(System.in);
                System.out.print("Navn på student: ");
                String navn = readNavn.nextLine();

                int antOppg = BIDATA.finnAntOpgForStud(navn);

                System.out.println(navn + " har løst " + antOppg + " oppgaver");
//                readNavn.close();
            }
            if(choice == 3){
                Scanner readinfo = new Scanner(System.in);
                System.out.print("Navn: ");
                String navn = readinfo.nextLine();

                System.out.print("Oppgaver løst: ");
                int antOppg = readinfo.nextInt();

                Student nyStud = new Student(navn, antOppg);
                BIDATA.registrerNyStud(nyStud);

//                readinfo.close();
            }
            if (choice == 4){
                Scanner readinfo = new Scanner(System.in);
                System.out.print("Navn: ");
                String navn = readinfo.nextLine();

                System.out.print("Økning i oppgaver: ");
                int okning = readinfo.nextInt();

                BIDATA.okAntOpgForStud(navn, okning);
//                readinfo.close();
            }
            if(choice == 5) {
                System.out.println(BIDATA.toString());
            }
            if(choice == 6){
                System.out.println("avslutter program...");
                break;
            }
        }
    }
}
