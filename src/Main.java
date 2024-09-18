import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Crear un curso
        Courses javaCourse = new Courses("Java Full Stack", "Prof. JC", 2024);

        // Crear estudiantes
        Student student1 = new Student("Luis", "Melendez", 101, 99, 2);
        Student student2 = new Student("Pedro", "Perez", 102, 80, 2);
        Student student3 = new Student("Juan", "Lopez", 103, 70, 2);
        Student student4 = new Student("Filomeno", "Sanchez", 104, 65, 2);
        Student student5 = new Student("Merengano", "Chan", 104, 79, 2);

        Student[] studentsArray = {student1, student2, student3, student4, student5};

        javaCourse.enroll(studentsArray);

        System.out.println("Numero de estudiantes inscritos " + javaCourse.countStudents());

        System.out.println("Mejor calificacion del curso " + javaCourse.bestGrade());

        javaCourse.unEnroll(student3);
        
        System.out.println("Numero de estudiantes inscritos:  " + javaCourse.countStudents());
    }
}