package lab2b;

public class Rectangle 
{
    int width;
    int length;
    int area;
    int perimeter;
    int rectangle;
    int i;
    int j;
    int f;

    public Rectangle(int length, int width)
    {
        setWidth(width);
        setLength(length);
    }

    public void setWidth(int width)
    {
        if(this.width >= 0 && this.width <= 40)
        {
            this.width = width;
        }
        else
        {
            System.out.println("Try again");
        }
        
    }
    public int getWidth ()
    {
        return width;
    }

    public void setLength(int length)
    {
        if(this.length >= 0 && this.length <= 40)
        {
            this.length = length;
        }
        else
        {
            System.out.println("Try again");
        }   
    }
    public int getLength()
    {
        return length;
    }
    public String toString()
    {
        return String.format("Lenght = " + length + " Width = " + width);
    }

    public int getArea() 
    {
        area = length  * width;
        return area;
    }
    public int getPerimeter() 
    {
        perimeter = (length * 2) + (width * 2);
        return perimeter;
    }

    public void printRectangle() 
    {
        System.out.print("");
        for(i=0; i <= width-1; i++)
        {
           System.out.print("*");
        }
        System.out.println("");
        for(i=0; i <= length-2; i++)
        {
           System.out.print("*");
           for(j=0; j <= width-3; j++)
           {
                System.out.print(" ");
           }
           System.out.println("*");
        }
        System.out.print("");
        for(i=0; i <= width-1; i++)
        {
           System.out.print("*");
        }
    }

}
