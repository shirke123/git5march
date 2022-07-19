package abstractdemo;
/**
   Abstraction:>  Abstraction is the process  of hiding implementations of details
                  and showing only functionality to the user.
 */


public abstract  class AbsSports
{

        public abstract void play();//abstract method


            public void exercise()//concreate method
            {
           System.out.print("exercise");

            }
              public  void show(){
                exercise();
              }
        }

   /**            abstract                                                   interface
         1.abstract class have both method                         1.only abstract (default and static)
         abstract class and non-abstract class(contract method)

         2. we have private, protected and public method           2.only public(private methods after java 8)

         3.abstract class can extends another class or implements    3.only interface

         4.partial abstraction                                       4.100 % abstractions
    */