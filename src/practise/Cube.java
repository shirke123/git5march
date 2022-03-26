package practise;

public class Cube {
    int height;
    int width;
    int depth;
    int volume;

    public void calculate() {
       volume=height*width*depth;

        System.out.println("volume of the cube:");
    }

    public static void main(String[] args) {
        Cube obj= new Cube();
        obj.calculate();


    }
    }

