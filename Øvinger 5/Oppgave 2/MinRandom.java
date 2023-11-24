import java.util.Random;

class MinRandom {
    public Random tilfeldigTall;

    public MinRandom(){
        this.tilfeldigTall = new Random();
    }

    public int nesteHeltall(int nedre, int ovre){
        int myRandom = tilfeldigTall.nextInt(ovre - nedre) + nedre;
        return myRandom;
    }

    public double nesteDesimaltal(int nedre, int ovre){
        double myRandom = nesteHeltall(nedre, ovre) + tilfeldigTall.nextDouble();
        return myRandom;
    }
}
