package servicio;

import model.Student;

import java.util.List;

//es una clase abstracta que tiene todos sus metodos abstractos
//todos son publicos por default
public interface IDAOStudent {
    void createStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
    List<Student> getAll();
    Student findByCif(String cif);
}
