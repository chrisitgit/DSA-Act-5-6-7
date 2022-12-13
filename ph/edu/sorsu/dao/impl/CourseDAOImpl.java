package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ph.edu.sorsu.dao.CourseDAO;
import ph.edu.sorsu.entity.Course;

public class CourseDAOImpl implements CourseDAO<Course> {
    private List<Course> listOFCourses = new ArrayList<>();

    
    public void create(Course entity){
        boolean isAdd = listOFCourses.add(entity);

        if(isAdd) {
            System.out.println("[INFO] You have successfully added a new course. ");
        }else{
            System.out.println("[ERROR] You have NOT successfully added a new course. ");
        }
    }
    public Course read(int indexPosition){
        System.out.println("[INFO] Retrieving course record from the list.");
        return listOFCourses.get(indexPosition);
    }
    public void update(int indexPosition, Course entity){
        System.out.println("[INFO] Updating the course record in the list.");
        listOFCourses.remove(indexPosition);
        listOFCourses.add(indexPosition, entity);
        System.out.println("[INFO] You have succesfully updated the course.");

    }
    public void delete(int indexPosition){
        System.out.println("[INFO] Deleting course record from the list.");
        listOFCourses.remove(indexPosition);
        System.out.println("[INFO] You have successfully deleted the teacher. ");
    }
    public List<Course> readAll(){
        System.out.println("[INFO] Retrieving the list of course.");
        System.out.println("[INFO] " + listOFCourses.size() + "Course(s) foud in your list.");
        return listOFCourses;
    }
}