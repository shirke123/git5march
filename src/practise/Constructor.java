package practise;
//default constructor
public class Constructor {
    int roll_no;
    String name;
    String address;

    public Constructor() {
        System.out.println("default constructor");
    }

    public void show() {
        System.out.println("roll_no:" + roll_no + "name:" + name + "address:" + address);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        obj.show();


        //parameter Constructor
        class Student {
            int roll_no;
            String name;
            String address;

            public   Student(int id,String name,String address){
                this.roll_no=roll_no;
                this.name=name;
                this.address=address;
                System.out.println("parameter constructor");
            }
            public  void show(){
                System.out.println("rollno"+roll_no);
                System.out.println("name"+name);
                System.out.println("address"+address);
            }

            public static void main(String[] args) {
                Student obj=new  Student(1,"abc","pune");
                obj.show();
            }


        }
    }
}

