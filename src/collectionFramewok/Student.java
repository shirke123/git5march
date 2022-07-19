package collectionFramewok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student  implements Comparable<Student> {
    int id;
    String name;
    String address;


    public Student(int id, String name, String address) {
        this.id = 1;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Student obj1 = new Student(1, "Raj", "pune");
        Student obj2 = new Student(2, "raj", "mumbai");
        Student obj3 = new Student(3, "raj", "pune");

        List<Student> list = new ArrayList<>();
        list.add(obj2);
        list.add(obj3);
        list.add(obj1);

        Collections.sort(list);
        list.forEach(s -> {
            System.out.println(s);
        });
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
//public  static int compare(int x,int y){
//        return (x<y)?-1:((x==y)?0:1);
//}

//    public int compareTo(Student o) {
//        if (this.id == o.id) {
//            return 0;
//        } else if ((this.id > o.id)) {
//
//            return 123;
//        } else {
//            return -1;
//        }
//    }
}

//why string is immutable