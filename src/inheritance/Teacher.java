package inheritance;
/** Inheritance ->
              acquiring all properties from child to class.

    advantages -> code of re-usability.

 */
 public class Teacher //parent class,super class,base class
{
    int id;
    String name;
    String address;


    public void show()
    {
        System.out.println("show in teacher");
    }
}
    class MathTeacher extends Teacher  //child class,subclass,derived class
    {
        public static void main(String[] args) {
            MathTeacher obj = new MathTeacher();
            obj.id = 1;
            obj.name = "abc";
            obj.address = "pune";
        }

        public void show()
        {
            System.out.println("in show teacher");
        }
    }
       class physicsTeacher extends MathTeacher
       {
        public static void main(String[] args) {
            physicsTeacher obj =new physicsTeacher();
            obj.id = 2;
            obj.name = "abc";
            obj.address = "pune";
            obj.show();
        }
    }

    class ChemistryTeacher extends Teacher {
        public static void main(String[] args) {
            ChemistryTeacher obj = new ChemistryTeacher();
            obj.id = 3;
            obj.name = "abc";
            obj.address = "pune";
            obj.show();
        }
    }

