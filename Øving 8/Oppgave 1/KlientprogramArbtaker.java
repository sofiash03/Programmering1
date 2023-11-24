import java.util.Objects;
import java.util.Scanner;
class KlientprogramArbtaker {
    public static void main(String[] args) {
        // TAR INN INPUT FRA BRUKER, DATA OM ARBEIDSTAKER
        // ANSATT
        Scanner read = new Scanner(System.in);
        System.out.print("\nFornavn: ");
        String fornavn = read.nextLine();

        System.out.print("Etternavn: ");
        String etternavn = read.nextLine();

        System.out.print("Fødselsår: ");
        int fodselsar = read.nextInt();

        // PERSON
        Person person1 = new Person(fornavn, etternavn, fodselsar);

        System.out.print("\nAnsatt nr.: ");
        int ansattnr = read.nextInt();

        System.out.print("Ansettelsesår: ");
        int ansettelsesar = read.nextInt();

        System.out.print("Manedslønn: ");
        int  manedslonn = read.nextInt();

        System.out.print("Skatteprosent: ");
        float skatteprosent = read.nextFloat();

        //ARBTAKER
        ArbTaker ansatt1_arbtaker = new ArbTaker(person1, ansattnr, ansettelsesar, manedslonn, skatteprosent);
        ansatt1_arbtaker.doPrintAnsattInfo();

        while(true){
            // Gir klient et valg om å endre på data, eller printe ut info om arbeidstaker
            Scanner readChoice = new Scanner(System.in);
            System.out.print("ANSATT INFORMASJON \n 1. Endre informasjon \n 2. Print informasjon \n 3. avslutt program \n ");
            int choice = readChoice.nextInt();


            if(choice == 1) {
                System.out.println("Dersom du ikke ønsker å endre en variabel, trykk ENTER");

                //Tar inn evt data som skal endres
                // OBJEKTVARIABLER PERSON
                Scanner readNew = new Scanner(System.in);
                System.out.print("\nFornavn: ");
                String newFornavn = readNew.nextLine();

                //dersom imputen er tom, skal ingenting endres
                if(!newFornavn.isEmpty()){
                    person1.setFornavn(newFornavn);
                    System.out.println("nytt fornavn: " + person1.getFornavn());
                }

                System.out.print("Etternavn: ");
                String newEtternavn = readNew.nextLine();

                if(!newEtternavn.isEmpty()){
                    person1.setEtternavn(newEtternavn);
                    System.out.println("nytt etternavn: " + person1.getEtternavn());
                }

                System.out.print("Fødselsår: ");
                String newFodselsar = readNew.nextLine();

                if(!newFodselsar.isEmpty()){
                    fodselsar = Integer.parseInt(newFodselsar);
                    ansatt1_arbtaker.getPerson().setFodselsar(fodselsar);
                    System.out.println("nytt fødselsår: " + person1.getFodselsar());
                }


                // OBJEKTVARIABLER ARBTAKER
                System.out.print("\nAnsatt nr.: ");
                String newAnsattnr = readNew.nextLine();

                if(!newAnsattnr.isEmpty()){
                    ansattnr = Integer.parseInt(newAnsattnr);
                    ansatt1_arbtaker.setAnsattnr(ansattnr);
                    System.out.println("nytt ansattnr.: " + ansatt1_arbtaker.getAnsattnr());
                }

                System.out.print("Ansettelsesår: ");
                String newAnsettelsesar = readNew.nextLine();

                if(!newAnsettelsesar.isEmpty()){
                    ansettelsesar = Integer.parseInt(newAnsettelsesar);
                    ansatt1_arbtaker.setAnsettelsesar(ansettelsesar);
                    System.out.println("nytt ansettelsesår: " + ansatt1_arbtaker.getAnsettelsesar());
                }

                System.out.print("Manedslønn: ");
                String  newManedslonn = readNew.nextLine();

                if(!newManedslonn.isEmpty()){
                    manedslonn = Integer.parseInt(newManedslonn);
                    ansatt1_arbtaker.setManedslonn(manedslonn);
                    System.out.println("ny månedslønn: " + ansatt1_arbtaker.getManedslonn());
                }

                System.out.print("Skatteprosent: ");
                String newSkatteprosent = readNew.nextLine();

                if(!newSkatteprosent.isEmpty()){
                    skatteprosent = Float.parseFloat(newSkatteprosent);
                    ansatt1_arbtaker.setSkatteprosent(skatteprosent);
                    System.out.println("ny skatteprosent: " + ansatt1_arbtaker.getSkatteprosent() + "%");
                }
            }

            if(choice == 2){
                ansatt1_arbtaker.doPrintAnsattInfo();
            }
            if(choice == 3){
                System.out.println("Avslutter program...");
                break;
            }
            
            
        }
    }
    
}
