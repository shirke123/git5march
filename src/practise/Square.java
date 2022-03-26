package practise;

public class Square {
    int length;

    public  void  calculatearea(int length)
    {

        System.out.println("area");
    }
    class SquareDemo extends  Square{

    }

    public static void main(String[] args) {
     Square obj=new Square();
     obj.calculatearea(23);
    }
}
