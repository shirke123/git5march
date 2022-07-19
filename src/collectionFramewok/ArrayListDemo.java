package collectionFramewok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// arraylist stores duplicate value.
// arraylist maintains insertions order.
// arraylist uses dynamic array to store element.
// it grows and shrink automatically by 50%.


public class ArrayListDemo {
    public static  void main(String[] args) {
        int[] arr = new int[60];
        arr[0] = 90;
        arr[1] = 90;
        arr[2] = 90;

        ArrayList<Employee1> list1 = new ArrayList<>();
        Employee1 employee = new Employee1(1," ramesh "," pune ");
        Employee1 employee2 = new Employee1(2," ramesh "," pune ");
        Employee1 employee3 = new Employee1(3," ramesh "," pune ");
        Employee1 employee4 = new Employee1(4," ramesh "," pune ");

        list1.add(employee);
        list1.add(employee3);
        list1.add(employee4);
        list1.add(employee4);

        for ( Employee1 employee1: list1) {
            System.out.println(employee1.id + " " + employee1.name+ " " + employee1.address);
        }

         List<Integer> list =  Arrays.asList(1, 2, 3, 4, 4, 5);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5));

        List<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4, 4, 3));

        List<Integer> list4 = new ArrayList<>() {{
            add(0);
            add(0);
            add(0);
        }};
    }
}

class Employee1{
    public int address;
    int id;
    String name;
    String Address;

    public Employee1(int id,String name,String address){
        this.id=1;
        this.name="Ramesh";
        this.Address="pune";
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
