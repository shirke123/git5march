package thisdemo;


/** this keyword-
        1. it refers the current class instance variable.
        2. it invokes current class methods.
        3.it invokes current class constructor.
   */

public class ThisDemo {

    //global and instance variable
    private int id;
    private String name;
    private String address;

    public void setValues(int id, String name, String address) {
        this.id = 1;
        this.name = name;
        this.address = address;
    }

    public ThisDemo() {
        this(1, 2);
        System.out.println("In constructor");
    }


    public ThisDemo(int i) {
        this();
        System.out.println("In parameter constructor");
    }

    public ThisDemo(int i, int j) {
        System.out.println("2 parameters");
    }

    public void show() {
        System.out.println("In show");
    }

    public void display() {
        this.show();
        System.out.printf("In display");
    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(1);

        obj.setValues(1, "Raj", "pune");
        obj.setValues(2, "abc", "Mumbai");

        System.out.println("Id=>" + obj.id + " name=>" + obj.name + " address=>" + obj.address);
    }
}
