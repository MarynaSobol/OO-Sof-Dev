public class Cylinder extends ThreeDShape
{
    private double radius;
    private double height;

    public Cylinder(String name, String colour, double radius, double height)
    {
        super(name, colour);
        this.radius = radius;
        this.height = height;
    }

    
    public double area()
    {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

    public double volume()
    {
        return Math.PI * this.radius * this.radius * this.height;
    }

    
    public String toString()
    {
        return super.toString() + "\nRadius = " + this.radius + "\nHeight = " + this.height;
    }
}
