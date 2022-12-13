package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;

import ph.edu.sorsu.dao.TeacherDAO;
import ph.edu.sorsu.dao.impl.TeacherDAOImpl;
import ph.edu.sorsu.entity.Teacher;


public class TeacherController {
    private TeacherDAO<ph.edu.sorsu.entity.Teacher> teacherDAO;
    private Scanner sc;

    public TeacherController(Scanner sc){
        this.teacherDAO = new TeacherDAOImpl();
        this.sc = sc;
    }

    public void createTeacher(){
        System.out.println("Fill up the teacher form. ");

        System.out.print("ID             : ");
        Long id = Long.parseLong(sc.nextLine());

        System.out.print("Rank           : ");
        String rank = sc.nextLine();

        System.out.print("FullName       : ");
        String fullName = sc.nextLine();

        System.out.print("Contact Number : ");
        Long contactNumber = Long.parseLong(sc.nextLine());

        System.out.print("Email Address  : ");
        String emailAddress= sc.nextLine();

     
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setRank(rank);
        teacher.setFullName(fullName);
        teacher.setContactNumber(contactNumber);
        teacher.setEmailAddress(emailAddress);
        
        teacherDAO.create(teacher);
    }

    public void displayTeacher(){
        System.out.println("To get teacher record, provide the index position. ");
        System.out.print("Index Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Teacher teacher = teacherDAO.read(indexPosition);
        teacherDAO.read(indexPosition);

        System.out.println("--------------------------- Teacher Information ---------------------------");
        System.out.println("ID              : " + teacher.getId());
        System.out.println("Code            : " + teacher.getRank());
        System.out.println("Description     : " + teacher.getFullName());
        System.out.println("Number of Units : " + teacher.getContactNumber());
        System.out.println("Code            : " + teacher.getEmailAddress());
     
    }
    public void updateTeacher() {
        System.out.println("To update the subject record, provide the index position. ");
        System.out.print("Index Position");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Teacher teacher = teacherDAO.read(indexPosition);

        System.out.println("--------------------------- Teacher Information ---------------------------");
        System.out.println("ID              : " + teacher.getId());
        System.out.println("Code            : " + teacher.getRank());
        System.out.println("Description     : " + teacher.getFullName());
        System.out.println("Number of Units : " + teacher.getContactNumber());
        System.out.println("Code            : " + teacher.getEmailAddress());
     

        System.out.println("Update the Teacher Information. ");

        System.out.print("ID             : ");
        Long.parseLong(sc.nextLine());

        System.out.print("Rank           : ");
        sc.nextLine();

        System.out.print("Full Name      : ");
        sc.nextLine();

        System.out.print("Contact Number : ");
        sc.nextLine();

        System.out.print("Email Address   : ");
        sc.nextLine();

        teacherDAO.update(indexPosition, teacher);

    }
    public void deleteTeacher(){
        System.out.println("To delete the teacher record, provide the index position. ");
        System.out.print("Index Position: ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        teacherDAO.delete(indexPosition);
    }
    public void displayAllTeacher(){
        List<Teacher> Teacher = teacherDAO.readAll();

        System.out.println("Display All The Course. ");
        System.out.println("ID, RANK, FULL NAME, CONTACT NUMBER, EMAIL ADDRESS");
        for(Teacher teacher: Teacher){
            System.out.println(teacher.getId() + ", " + teacher.getRank() + ", " + teacher.getFullName() + "," + teacher.getContactNumber() + ", " + teacher.getEmailAddress());
        }
        
    }
}