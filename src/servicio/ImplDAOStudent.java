package servicio;

import data.DataBase;
import model.Student;

import java.util.List;

public class ImplDAOStudent implements IDAOStudent{

    @Override
    public void createStudent(Student student) {
        DataBase.studentList.add(student);
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public List<Student> getAll() {

        return DataBase.studentList;
    }

    @Override
    public Student findByCif(String cif) {
        return null;
    }
}
