package collectionFramewok;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeSet {
    int id;
    String name;
    String address;

    public void display(int id, String name, String address) {
        this.id = id;
        this.name = "name";
        this.address = "address";
    }

    @Override
    public String toString() {
        return "EmployeeSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        EmployeeSet that = (EmployeeSet) o;
        return Objects.hash(this.id,this.name,this.address)
                ==Objects.hash(that.id,that.name,that.address);
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(id,name,address));
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {


        EmployeeSet employee1=new EmployeeSet();
        EmployeeSet employee2=new EmployeeSet();
        EmployeeSet employee3=new EmployeeSet();
        EmployeeSet employee4=new EmployeeSet();

        Set<EmployeeSet> list1=new HashSet<>();

          list1.add(employee1);
          list1.add(employee2);
          list1.add(employee3);
          list1.add(employee4);
        System.out.println(list1);
        }
    }




