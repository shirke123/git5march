package encapsulation;

/**  Encapsulation:>
    -wrapping a data and code in a single unit.
   - making field private and giving access them via getter and setter.

 */
/** advantages-
     1.  you can make class read only or write only.
     2.  you can protect from unauthorized access.
*/

public class EncapsulationDemo
{
   private int id;
   private String name;
   private String address;

    public void setId(int id){
        if(id==0)
        {
            System.out.println("id is 0");
        }else {
            this.id=id;

        }
    }
    public int getId() {
        return id;
    }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

    public static void main(String[]args)
{
    EncapsulationDemo obj=new EncapsulationDemo();
    obj.id=1;
    obj.name="abc";
    obj.address="pune";

    System.out.println("id=>"+obj.id+"   name=>"+obj.name+"   address=>"+obj.address);

}
}
   class Sample
   {
    public static void main(String[]args){
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setId(1);
        //obj.name="abc";
       // obj.address="pune";
    }
}
