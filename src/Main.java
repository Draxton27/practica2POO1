import model.Student;
import servicio.IDAOStudent;
import servicio.ImplDAOStudent;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("21011639", "Daniel", "Isaac",
                "Osorio", "Silva");
        IDAOStudent dao = new ImplDAOStudent()
        dao.createStudent(s);
        System.out.println("quanti");
    }
}