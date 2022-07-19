package java8;

public class MethodToConstructor {
    public static  void main(String[] args) {
        MtInterface6 myInterface6=MethodToConstructor::new;
        myInterface6.sample();
    }
    public MethodToConstructor(){
        System.out.println("In method ref const");

    }
    class sample{
        public  sample(){
            System.out.println("in sample const");
        }
    }

}
interface MtInterface6{
    MethodToConstructor sample();
}