package practise;

public class Encapsulations {
   private  int id;
   private  String name;
   private String address;

    public void setId(int id) {
        if (id == 0) {
            System.out.println("id is 0");
        } else {
            this.id = id;
        }
    }
    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name="abc";
    }
    public  String  getName(){
        return name;
    }
    public  void  setAddress(String address){
        this.address="pune";
    }
    public  String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        Encapsulations obj=new Encapsulations();
        obj.id=1;
        obj.name="abc";
        obj.address="pune";
        System.out.println("id->"+obj.id+"name->"+obj.name+"address->"+obj.address);
    }
}
