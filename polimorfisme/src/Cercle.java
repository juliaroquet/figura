public class Cercle extends Figura{
    private double r;
    public Cercle (double r){
        this.r=r;

    }
    public double area () {return Math.Pi*this.r*this.r;}
}
