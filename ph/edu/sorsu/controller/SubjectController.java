package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;

import ph.edu.sorsu.dao.SubjectDAO;
import ph.edu.sorsu.dao.impl.SubjectDAOImpl;
import ph.edu.sorsu.entity.Course;
import ph.edu.sorsu.entity.Subject;


public class SubjectController {
    private SubjectDAO<ph.edu.sorsu.entity.Subject> subjectDAO;
    private Scanner sc;

    public SubjectController(Scanner sc){
        this.subjectDAO = new SubjectDAOImpl();
        this.sc = sc;
    }

    public void createSubject(){
        System.out.println("Fill up the subject form. ");

        System.out.print("ID              : ");
        Long id = Long.parseLong(sc.nextLine());

        System.out.print("Code            : ");
        String code = sc.nextLine();

        System.out.print("Description     : ");
        String description = sc.nextLine();

        System.out.print("Number of Units : ");
        Long numberOfUnits = Long.parseLong(sc.nextLine());

        System.out.print("Course          : ");
        Course course = new Course();
        course.setCourse(sc.nextLine());

     
        Subject subject = new Subject();
        subject.setId(id);
        subject.setCode(code);
        subject.setDescription(description);
        subject.setNumberOfUnits(numberOfUnits);
        subject.setCourse(course);
        
        subjectDAO.create(subject);
    }

    public void displaySubject(){
        System.out.println("To get subject record, provide the index position. ");
        System.out.print("Index Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Subject subject = subjectDAO.read(indexPosition);

        System.out.println("--------------------------- Subject Information ---------------------------");
        System.out.println("ID              : " + subject.getId());
        System.out.println("Code            : " + subject.getCode());
        System.out.println("Description     : " + subject.getDescription());
        System.out.println("Number of Units : " + subject.getNumberOfUnits());
        System.out.println("Course          : " + subject.getCourse());
     
    }
    public void updateSubject() {
        System.out.println("To update the subject record, provide the index position. ");
        System.out.print("Index Position");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Subject subject = subjectDAO.read(indexPosition);

        System.out.println("-------------------------- Subject Information ---------------------------");
        System.out.println("ID              : " + subject.getId());
        System.out.println("Code            : " + subject.getCode());
        System.out.println("Description     : " + subject.getDescription());
        System.out.println("Number of Units : " + subject.getNumberOfUnits());
        System.out.println("Code            : " + subject.getCode());
     

        System.out.println("Update the Subject Information. ");

        System.out.print("ID              : ");
        Long.parseLong(sc.nextLine());

        System.out.print("Code            : ");
        sc.nextLine();

        System.out.print("Description     : ");
        sc.nextLine();

        System.out.print("Number of Units : ");
        sc.nextLine();

        System.out.print("Course          : ");
        sc.nextLine();

        subjectDAO.update(indexPosition, subject);

    }
    public void deleteSubject(){
        System.out.println("To delete the subject record, provide the index position. ");
        System.out.print("Index Position: ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        subjectDAO.delete(indexPosition);
    }
    public void displayAllSubject(){
        List<Subject> Subject = subjectDAO.readAll();

        System.out.println("Display All The Schedule. ");
        System.out.println("ID, CODE, DESCRIPTION, NUMBER OF UNTS, COURSE");
        for(Subject subject: Subject){
            System.out.println( subject.getId() + ", " + subject.getCode() + ", " + subject.getDescription() + ", " + subject.getNumberOfUnits() + ", " + subject.getCourse());
        }
        
    }
}