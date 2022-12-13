package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;

import ph.edu.sorsu.dao.StudentDAO;
import ph.edu.sorsu.dao.impl.StudentDAOImpl;
import ph.edu.sorsu.entity.Course;
import ph.edu.sorsu.entity.Student;


public class StudentController {
    private StudentDAO<ph.edu.sorsu.entity.Student> studentDAO;
    private Scanner sc;

    public StudentController(Scanner sc){
        this.studentDAO = new StudentDAOImpl();
        this.sc = sc;
    }

    public void createStudent(){
        System.out.println("Fill up the student form. ");

        System.out.print("ID            : ");
        Long id = Long.parseLong(sc.nextLine());

        System.out.print("First Name     : ");
        String firstName = sc.nextLine();

        System.out.print("Middle Name    : ");
        String middleName = sc.nextLine();

        System.out.print("Last Name      : ");
        String lastName = sc.nextLine();

        System.out.print("Birth Date     : ");
        String birthDate = sc.nextLine();

        System.out.print("Birth Place    : ");
        String birthPlace = sc.nextLine();

        System.out.print("Contact Number : ");
        Long contactNumber = Long.parseLong(sc.nextLine());

        System.out.print("Email Address  : ");
        String emailAddress = sc.nextLine();

        System.out.print("Course         : ");
        Course course = new Course();

        Student student = new Student();
        student.setId(id);
        student.setFirstName(firstName);
        student.setMiddleName(middleName);
        student.setLastName(lastName);
        student.setBirthDate(birthDate);
        student.setBirthPlace(birthPlace);
        student.setContactNumber(contactNumber);
        student.setEmailAddress(emailAddress);
        student.setCourse(course);
        
        studentDAO.create(student);
    }

    public void displayStudent(){
        System.out.println("To get student record, provide the index position. ");
        System.out.print("Index Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Student student = studentDAO.read(indexPosition);

        System.out.println("--------------------------- Student Information ---------------------------");
        System.out.println("ID              : " + student.getId());
        System.out.println("First Name      : " + student.getFirstName());
        System.out.println("Middle Name     : " + student.getMiddleName());
        System.out.println("Last Name       : " + student.getLastName());
        System.out.println("Birth Date      : " + student.getBirthDate());
        System.out.println("Birth Place     : " + student.getBirthPlace());
        System.out.println("Contact Number  : " + student.getContactNumber());
        System.out.println("Email Address   : " + student.getEmailAddress());
        System.out.println("Course : " + student.getCourse());
    }
    public void updateStudent() {
        System.out.println("To update the student record, provide the index position. ");
        System.out.print("Index Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Student student = studentDAO.read(indexPosition);

        System.out.println("--------------------------- Student Information ---------------------------");
        System.out.println("ID              : " + student.getId());
        System.out.println("First Name      : " + student.getFirstName());
        System.out.println("Middle Name     : " + student.getMiddleName());
        System.out.println("Last Name       : " + student.getLastName());
        System.out.println("Birth Date      : " + student.getBirthDate());
        System.out.println("Birth Place     : " + student.getBirthPlace());
        System.out.println("Contact Number  : " + student.getContactNumber());
        System.out.println("Email Address   : " + student.getEmailAddress());
        System.out.println("Course : " + student.getCourse());

        System.out.println("Update the Student Information. ");

        System.out.print("ID             : ");
        Long.parseLong(sc.nextLine());

        System.out.print("First Name     : ");
        sc.nextLine();

        System.out.print("Middle Name    : ");
        sc.nextLine();

        System.out.print("Last Name      : ");
        sc.nextLine();

        System.out.print("Birth Date     : ");
        sc.nextLine();

        System.out.print("Birth Place    : ");
        sc.nextLine();

        System.out.print("Contact Number : ");
        Long.parseLong(sc.nextLine());

        System.out.print("Email Address  : ");
        sc.nextLine();

        System.out.print("Course         : ");
        sc.nextLine();

        studentDAO.update(indexPosition, student);

    }
    public void deleteStudent(){
        System.out.println("To delete the student record, provide the index position. ");
        System.out.print("Index Position: ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        studentDAO.delete(indexPosition);
    }
    public void displayAllStudent(){
        List<Student> Student = studentDAO.readAll();

        System.out.println("Display All The Student. ");
        System.out.println("ID, FIRST NAME, MIDDLE NAME, LAST NAME, BIRTH DATE, BIRTH PLACE, CONTACT NUMBER, EMAIL ADDRESS, COURSE");
        for(Student student: Student){
            System.out.println(student.getId() + ", " + student.getFirstName() + ", " + student.getMiddleName() + ", " + student.getLastName() + ", " + student.getBirthDate() + ", " + student.getBirthPlace() + ", " + student.getContactNumber() + ", " + student.getEmailAddress() + ", " + student.getCourse());
        }
        
    }
}