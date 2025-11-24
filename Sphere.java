public class Sphere extends ThreeDShape
{
    private double radius;

    public Sphere(String name, String colour, double radius)
    {
        super(name, colour);
        this.radius = radius;
    }

    @Override
    public double area()
    {
        return 4 * Math.PI * this.radius * this.radius;
    }

    @Override
    public double volume()
    {
        return (4.0 / 3.0) * Math.PI * this.radius * this.radius * this.radius;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nRadius = " + this.radius;
    }
}
