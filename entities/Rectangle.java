package entities;

public class Rectangle
{
    public double width;
    public double height;

    public double area()
    {
        double resultArea = width * height;
        return resultArea;
    }
    public double perimeter()
    {
        double resultPerimeter = 2*(width + height);
        return resultPerimeter;
    }
    public double diagonal()
    {
        double resultDiagonal = Math.sqrt((width*width) + (height*height));
        return resultDiagonal;
    }
}
