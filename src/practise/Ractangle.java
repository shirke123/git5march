package practise;

public class Ractangle {
    int length;
    int width;

    public  Ractangle(int length, int width)
    {
        this.width=width;
        this.length=length;
    }
    public  void  RectangleArea(){
        System.out.println("show data");

    }
    public void RectanglePerimeter(){
        System.out.println("RectanglePrimeter");
    }

    public static void main(String[] args) {
        Ractangle obj=new Ractangle(5,7);
        obj.RectangleArea();
        Ractangle obj1=new Ractangle(5,6);
        obj1.RectanglePerimeter();

    }
}
