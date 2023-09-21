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
        Student e = findByCif(student.getCif());
        e.setFirstName(student.getFirstName());
        e.setSecondName(student.getSecondName());
        e.setLastName(student.getLastName());
        e.setLastName2(student.getLastName2());
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
        for(Student e : DataBase.studentList) {
            if(e.getCif().equals(cif)){
                return e;
            }
        }
        return null;
    }
}
