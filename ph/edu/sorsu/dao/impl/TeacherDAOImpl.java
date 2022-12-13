package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ph.edu.sorsu.dao.TeacherDAO;
import ph.edu.sorsu.entity.Teacher;


public class TeacherDAOImpl implements TeacherDAO<Teacher> {
    private List<Teacher> listOfTeachers = new ArrayList<>();

    public void create(Teacher entity){
        boolean isAdd = listOfTeachers.add(entity);

        if(isAdd) {
            System.out.println("[INFO] You have successfully added a new teacher. ");
        }else{
            System.out.println("[ERROR] You have NOT successfully added a new teacher. ");
        }
    }
    public Teacher read(int indexPosition){
        System.out.println("[INFO] Retrieving teacher record from the list.");
        Teacher listTeacher = listOfTeachers.get(indexPosition);
        return listTeacher;
    }
    public void update(int indexPosition, Teacher entity){
        System.out.println("[INFO] Updating the teacher record in the list.");
        listOfTeachers.remove(indexPosition);
        listOfTeachers.add(indexPosition, entity);
        System.out.println("[INFO] You have succesfully updated the teacher.");

    }
    public void delete(int indexPosition){
        System.out.println("[INFO] Deleting teacher record from the list.");
        listOfTeachers.remove(indexPosition);
        System.out.println("[INFO] You have successfully deleted the teacher. ");
    }
    public List<Teacher> readAll(){
        System.out.println("[INFO] Retrieving the list of teacher.");
        System.out.println("[INFO] " + listOfTeachers.size() + "Teacher(s) foud in your list.");
        return listOfTeachers;
    }
}