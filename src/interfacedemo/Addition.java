package interfacedemo;


public class Addition{

        public void  add(int i,int j)
        {
            System.out.println(i+j);

        }
        public void sub(int i,int j)
        {
           //System.out.println(i+j);
        }
         public static  void main(String[]args)
        {
            Addition add=new Addition();
            add.add(4,3);
        }
    }


