import data.DataBase;
import model.Student;
import servicio.IDAOStudent;
import servicio.ImplDAOStudent;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("21011639", "Daniel", "Isaac",
                "Osorio", "Silva");

        IDAOStudent dao = new ImplDAOStudent();
        dao.createStudent(s);
        System.out.println("Quantity of student: " + dao.getAll().size());
        s.setFirstName("Carlos");
        //dao.updateStudent(s);
        printStudent(DataBase.studentList);
    }
    private static void printStudent(List<Student> studentList) {
        for(Student e : studentList) {
            System.out.println(e.toString());
        }
    }
}