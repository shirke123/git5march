package collectionFramewok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = 1;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ComparatorDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student obj1=new Student(1,"Raj","pune");
        Student obj2=new Student(2,"Prakash","mumbai");
        Student obj3=new Student(3,"Sagar","pune");

        List<Student> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Comparator<ComparatorDemo> comparator=(o1, o2)->{
            if (o1.id==o2.id) {
                return 0;
            } else if ((o1.id > o2.id)) {

                return 1;
            }else {
                return -1;
            }
        };


        Comparator<ComparatorDemo>comparator1=(o1,o2)->{
            return  o1.name.compareTo(o2.name);
        };

      //  Collections.sort(list,comparator.thenComparing(comparator1));
        list.forEach(s->{
            System.out.println(s);
        });
    }

}
