public class Cercle extends Figura
{
    private double r;
    public Cercle (double r)
    {
        this.r=r;

    }
   //* public double area () {return Math.pi*this.r*this.r;}//
    public  double areas () {return Math.PI*Math.pow(r, 2);}

    @Override
    public double area() {
        return 0;
    }
}
