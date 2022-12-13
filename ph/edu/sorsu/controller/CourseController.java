package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;

import ph.edu.sorsu.dao.CourseDAO;
import ph.edu.sorsu.dao.impl.CourseDAOImpl;
import ph.edu.sorsu.entity.Course;

public class CourseController {
    private CourseDAO<ph.edu.sorsu.entity.Course> courseDAO;
    private Scanner sc;

    public CourseController(Scanner sc){
        this.courseDAO = new CourseDAOImpl();
        this.sc = sc;
    }

    public void createCourse(){
        System.out.println("Fill up the course form. ");

        System.out.print("ID          : ");
        Long id = Long.parseLong(sc.nextLine());

        System.out.print("Code        : ");
        String code = sc.nextLine();

        System.out.print("Description : ");
        String description = sc.nextLine();

        Course course = new Course();
        course.setId(id);
        course.setCode(code);
        course.setDescription(description);

        courseDAO.create(course);
    }

    public void displayCourse(){
        System.out.println("To get course record, provide the index position. ");
        System.out.print("Index Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Course course = courseDAO.read(indexPosition);


        System.out.println("---------------------------- Course Information ---------------------------");
        System.out.println("ID          : " + course.getId());
        System.out.println("Code        : " + course.getCode());
        System.out.println("Description : " + course.getDescription());

       
    }
    public void updateCourse() {
        System.out.println("To update the course record, provide the index position. ");
        System.out.print("Index Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Course course = courseDAO.read(indexPosition);
        courseDAO.read(indexPosition);

        System.out.println("---------------------------- Course Information ---------------------------");
        System.out.println("ID          : " + course.getId());
        System.out.println("Code        : " + course.getCode());
        System.out.println("Description : " + course.getDescription());

        System.out.println("Update the course Information. ");

        System.out.print("ID          : ");
        Long.parseLong(sc.nextLine());

        System.out.print("Code        : ");
        sc.nextLine();

        System.out.print("Description : ");
        sc.nextLine();

        courseDAO.update(indexPosition, course);

    }
    public void deleteCourse(){
        System.out.println("To delete the course record, provide the index position. ");
        System.out.print("Indedx Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        courseDAO.delete(indexPosition);
    }
    public void displayAllCourse(){
        List<Course> Course = courseDAO.readAll();
        
        System.out.println("Display All The Course. ");
        System.out.println("ID, CODE, DESCRIPTION");
        for(Course course: Course){
            System.out.println(course.getId() + ", " + course.getCode() + ", " + course.getDescription());
        }
        
    }
}