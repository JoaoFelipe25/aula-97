import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Student student = new Student(0,"Cassiano",32, 10, 2022);

        // Teacher teacher = new Teacher(0,"Jose",44,4545,"Devops");

        // System.out.println("Nome do Aluno: " + student.getName());
        // System.out.println("Nome do Aluno: " + teacher.getName());

        // student.checkIn(student.getName());
        // student.checkOut(student.getName());
        // teacher.checkIn(teacher.getName());
        // teacher.checkOut(teacher.getName());

        List<Student> students = new ArrayList<Student>();
        List<Teacher> teachers = new ArrayList<Teacher>();

        students.add(new Student(0,"Cassiano",32, 10, 2022));
        students.add(new Student(1,"joao",31, 10, 2022));
        students.add(new Student(2,"Casio",30, 10, 2022));

        teachers.add(new Teacher(0,"Jose",34,4545,"DevOps"));
        teachers.add(new Teacher(1,"Joilson",24,4665,"cloud"));
        teachers.add(new Teacher(2,"Jacare",38,4005,"segurity"));

        System.out.println("Lista de estudante");
        students.stream().forEach(student -> System.out.println(student.getId()));
        System.out.println();
        students.stream().forEach(student -> System.out.println(student.getName()));
        System.out.println();
        students.stream().forEach(student -> System.out.println(student.getAge()));
        System.out.println();
        students.stream().forEach(student -> System.out.println(student.getClassName()));
        System.out.println();
        students.stream().forEach(student -> System.out.println(student.getYear()));
        System.out.println();

    }
}
