package lab2b;

public class lab2b 
{
    public static void main(String[] args) 
    {
        Rectangle Data1 = new Rectangle(5,10);
        Rectangle Data2 = new Rectangle(7,5);
        Rectangle Data3 = new Rectangle(10,4);
        System.out.println(Data1.toString());
        System.out.println("The perimeter is: " + Data1.getPerimeter());
        System.out.println("The area is: " + Data1.getArea());
        System.out.println("");
        Data2.printRectangle();
        System.out.println("");
        Data3.printRectangle();
    }
}
