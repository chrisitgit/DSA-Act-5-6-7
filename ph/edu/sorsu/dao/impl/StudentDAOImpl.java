package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ph.edu.sorsu.dao.StudentDAO;
import ph.edu.sorsu.entity.Student;

public class StudentDAOImpl implements StudentDAO<Student> {
    private List<Student> listOfStudents = new ArrayList<>();

    
    public void create(Student entity){
        boolean isAdd = listOfStudents.add(entity);

        if(isAdd) {
            System.out.println("[INFO] You have successfully added a new students. ");
        }else{
            System.out.println("[ERROR] You have NOT successfully added a new students. ");
        }
    }
    public Student read(int indexPosition){
        System.out.println("[INFO] Retrieving student record from the list...");
        return listOfStudents.get(indexPosition);
    }
    public void update(int indexPosition, Student entity){
        System.out.println("[INFO] Updating the student record in the list.");
        listOfStudents.remove(indexPosition);
        listOfStudents.add(indexPosition, entity);
        System.out.println("[INFO] You have succesfully updated the Student.");

    }
    public void delete(int indexPosition){
        System.out.println("[INFO] Deleting student record from the list.");
        listOfStudents.remove(indexPosition);
        System.out.println("[INFO] You have successfully deleted the student. ");
    }
    public List<Student> readAll(){
        System.out.println("[INFO] Retrieving the list of student.");
        System.out.println("[INFO] " + listOfStudents.size() + "Student(s) foud in your list.");
        return listOfStudents;
    }
}