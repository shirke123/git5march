package practise;

public class Student
{
    int roll_no;
    String name;
    Long contact_no;
    float total_marks;

    public  void Student(int roll_no,String name,long contact_no,float total_marks)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.contact_no=contact_no;
        this.total_marks=total_marks;
    }
    public  void display()
    {
        System.out.println("Roll-no"+roll_no);
        System.out.println("name"+name);
        System.out.println("contact_no"+contact_no);
        System.out.println("total_marks"+total_marks);

    }
    public  static  void main(String[]args){
        Student obj= new Student();
        obj.display();
    }

}
