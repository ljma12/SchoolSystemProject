import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;  // Lista de estudiantes

    // Constructor con todos los atributos
    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();  // Inicializar la lista de estudiantes
    }

    // Método para inscribir a un estudiante
    public void enroll(Student student) {
        students.add(student);
        System.out.println(student.firstName + " " + student.lastName + " Fue inscrito");
    }
    
    public void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            students.add(student);
            System.out.println(student.firstName + " " + student.lastName + " Fue inscrito");
        }
    }

    // Método para desinscribir a un estudiante
    public void unEnroll(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println(student.firstName + " " + student.lastName + " Fue dado de baja");
        } else {
            System.out.println("Este estudiante no esta inscrito");
        }
    }

    // Método para contar el número de estudiantes inscritos
    public int countStudents() {
        return students.size();
    }

    // Método para obtener la mejor calificación entre los estudiantes inscritos
    public int bestGrade() {
        int best = 0;
        for (Student student : students) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }
}