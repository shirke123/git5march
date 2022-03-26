package practise;

public  class Interface implements InterfaceDemo{

    public void add(int i, int j) {
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        Interface  obj=new Interface();
        obj.add(2,3);
    }
}
