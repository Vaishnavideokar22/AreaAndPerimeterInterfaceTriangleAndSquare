interface GeomatricShape{
    void Area();
    void Perimeter();
}
class Square implements GeomatricShape{
    double area;
    double perimeter;
    double side;

    Square(double Side){
        this.side = Side;
}
public void Area(){
    area = side*side;
    System.out.println("The Area Of Square Is: " + area);
}
public void Perimeter(){
    perimeter = 4*side;
    System.out.println("The Perimeter Of Square Is:" + perimeter);
}
}
class Triangle implements GeomatricShape{
    double area;
    double perimeter;
    double side1;
    double side2;
    double side3;
    double base;
    double height;

    Triangle(double Side1,double Side2,double Side3,double Base,double Height){
        this.side1 = Side1;
        this.side2 = Side2;
        this.side3 = Side3;
        this.base = Base;
        this.height = Height;
}
public void Area(){
    area = (0.5*base*height);
    System.out.println("The Area Of Triangle Is: " + area);
}
public void Perimeter(){
    perimeter = side1+side2+side3;
    System.out.println("The Perimeter Of Triangle: " + perimeter);
}

}
public class AreaAndPerimeterInterface {

    public static void main(String[] args) {
        
        Square s1 = new Square(66);
        s1.Area();
        s1.Perimeter();

        Triangle t1 = new Triangle(11,33,45,66,77);
        t1.Area();
        t1.Perimeter();
    }
    
}
