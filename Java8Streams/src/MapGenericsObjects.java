import java.util.HashMap;
import java.util.Map;

public class MapGenericsObjects {

    public static void main(String args[]){

        Student student = new Student("mahi", "mahesh@gmail");
        Student student1 = new Student("sam", "sam@gmail");
        Student student2= new Student("ram", "ram@gmail");
        Address address = new Address("hyderabad", "500788");
        Address address1 = new Address("pune", "300576");
        Address address2 = new Address("delhi", "200788");


        Map<Integer, Student> sss = new HashMap<>();
        sss.put(101, student);
        sss.put(102, student1);
        sss.put(103, student2);
        System.out.println(sss.toString());


        Map<String, Address> adds = new HashMap<>();
        adds.put("101", address);
        adds.put("102", address1);
        adds.put("103", address2);
        System.out.println(adds.toString());


        Map<Student, Address> std = new HashMap<>();
        std.put(student, address );
        std.put(student1, address1 );
        std.put(student2, address2 );
        System.out.println(std);

    }
}
