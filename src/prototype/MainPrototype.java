package prototype;

public class MainPrototype {

    public static void main(String[] args) throws Exception {

        Student student = new Student();
        student.setName("Jack");

        Student student2 = (Student) student.clone();

        System.out.println(student2.getName());

    }
}
