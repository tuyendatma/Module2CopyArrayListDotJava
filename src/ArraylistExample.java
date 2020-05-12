import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistExample {
    public static final int NUM_OF_ELEMENT =5;

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(3);
        for (int i=0; i<NUM_OF_ELEMENT;i++){
            Student student = new Student(i,"my name"+i);
            students.add(student);
        }
//        System.out.println(students.get(2));
        students.set(2,new Student(15,"Dat"));
//        System.out.println(students.get(2));
        System.out.println(students.size());
        ArrayList<Student> studentClone = (ArrayList<Student>) students.clone();
        students.set(2,new Student(15,"Dat"));
        for (Student student : studentClone) {
            System.out.println(student);
        }
        // chuyen arrayList sang linkedList
        LinkedList<Student> studentLinkedList = new LinkedList<>(students);
        System.out.println(studentLinkedList.get(1));
    }
}
