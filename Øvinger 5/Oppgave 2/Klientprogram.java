class KlientProgramTilfeldig{
    public static void main (String[]args){
        MinRandom tall = new MinRandom();

        int random_heltall = tall.nesteHeltall(1, 10);
        System.out.println(random_heltall);

        double random_desimaltall = tall.nesteDesimaltal(1, 10);
        System.out.println(random_desimaltall);
    }
}