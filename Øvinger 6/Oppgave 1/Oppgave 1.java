import java.util.Random;

class Tabeller{
    public static void main(String[]args){
        java.util.Random random = new java.util.Random(); 

        int[] antallRandom = new int[10];
        int antall;
        int runder = 1000; 

        for(int i = 0; i < runder; i++){
            antall = random.nextInt(10);
            for(int n = 0; n < 10; n++){
                if(antall == n){
                    antallRandom[n] += 1;
                }
            }
        }

        int lengde_antall = antallRandom.length;
        for(int i = 0; i < lengde_antall; i++){
            String stjerner = "     "; 
            int stjernerAntall = antallRandom[i]/(runder/100);
            double antall_stjerner = Math.round(stjernerAntall);

            for(int n = 0; n < antall_stjerner; n++){
                stjerner += "*";
            }
            System.out.println(i + " : " + antallRandom[i] + " " + stjerner);
        }
        
    }
}