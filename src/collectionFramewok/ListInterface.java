package collectionFramewok;

public interface ListInterface{

    void show();

    void display();

}

class ArrayListClass implements ListInterface {

    public  void show(){
        System.out.println("In show");
    }

    public  void display(){
        System.out.println("In Display");
    }

     public  void add(){
    System.out.println("in add method");

    }

    public static void main(String[] args) {
    ListInterface obj=new ArrayListClass();
    obj.show();
    obj.display();
    //obj.add();

    }
}
