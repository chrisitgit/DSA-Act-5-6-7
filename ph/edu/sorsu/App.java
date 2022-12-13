package ph.edu.sorsu;

import java.util.Scanner;

import ph.edu.sorsu.controller.CourseController;
import ph.edu.sorsu.controller.ScheduleController;
import ph.edu.sorsu.controller.StudentController;
import ph.edu.sorsu.controller.SubjectController; 
import ph.edu.sorsu.controller.TeacherController;                                                                                 


public class App {

    /**
    * @param args
    */
   public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|                     SorSU Enrollment Management System                  |");
        System.out.println("|                            version 1.0-ALPHA                            |");
        System.out.println("|                             Garbida - Abletia                           |");
        System.out.println("---------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Available Modules:");
            System.out.println("  [1] Student  ");
            System.out.println("  [2] Teacher  ");
            System.out.println("  [3] Course   ");
            System.out.println("  [4] Subject  ");
            System.out.println("  [5] Schedule ");
            System.out.println("  [0] Exit Applicaton ");
            System.out.println("---------------------------------------------------------------------------");
           
            System.out.print("Enter the module number to work on: ");
            String InputModuleNumber = sc.nextLine();
            int select = Integer.parseInt(InputModuleNumber);
            System.out.println("---------------------------------------------------------------------------");

            if(select > 0 && select <= 5 ){

               switch(select){
                  case 1:
                  StudentController studentController = new StudentController(sc);
                  do{
                     System.out.println("---------------------------------------------------------------------------");
                     System.out.println("Student Module Menu: ");
                     System.out.println("  [1] Create Student");
                     System.out.println("  [2] Get Student");
                     System.out.println("  [3] Update Student");
                     System.out.println("  [4] Delete Student");
                     System.out.println("  [5] Get All Students");
                     System.out.println("  [0] Exit this Module");
                     System.out.println("---------------------------------------------------------------------------");

                     System.out.print("Enter the menu number to work on: ");
                     int select1 = Integer.parseInt(sc.nextLine());
                     System.out.println("---------------------------------------------------------------------------");

                     if(select1 == 1){
                        studentController.createStudent();
   
                     }
                     else if(select1 == 2){
                        studentController.displayStudent();
      
                     }
                     else if(select1 == 3){
                        studentController.updateStudent();
      
                     }
                     else if(select1 == 4){
                       studentController.deleteStudent();
      
                     }
                     else if(select1 == 5){
                      studentController.displayAllStudent();
      
                     }
                     else if(select1 == 0){
                        System.out.println("Exit this module. ");
                        break;
                    
                     }
                     
                     
               }while(select > 0 && select <= 5);
               break;

                  case 2:
                  TeacherController teacherController = new TeacherController(sc);
                  do {
                     System.out.println("---------------------------------------------------------------------------");
                     System.out.println("Teacher Module Menu: ");
                     System.out.println("  [1] Create Teacher");
                     System.out.println("  [2] Get Teacher");
                     System.out.println("  [3] Update Teacher");
                     System.out.println("  [4] Delete Teacher");
                     System.out.println("  [5] Get All Teachers");
                     System.out.println("  [0] Exit this Module");
                     System.out.println("---------------------------------------------------------------------------");

                     System.out.print("Enter the menu number to work on: ");
                        int select2=
                        Integer.parseInt(sc.nextLine());
                     System.out.println("---------------------------------------------------------------------------");
                       
                     if(select2 == 1){
                        
                        teacherController.createTeacher();

                     }
                        else if(select2 == 2){
                        teacherController.displayTeacher();

                        }
                        else if(select2 == 3){
                        teacherController.updateTeacher();

                        }
                        else if(select2 == 4){
                        teacherController.deleteTeacher();

                        }
                        else if(select2 == 5){
                        teacherController.displayAllTeacher();

                        }
                        else if(select2 == 0){
                        teacherController.displayAllTeacher();

                        }
                        else if(select2 == 0){
                   System.out.println("  [0] Exit this Module");
                           break;
                        }

                     }while (select > 0 && select <= 5);
                     break;
      
                        case 3:
                        CourseController courseController = new CourseController(sc);
                        do{
                           System.out.println("---------------------------------------------------------------------------");
                           System.out.println("Course Module Menu: ");
                           System.out.println("  [1] Create Course");
                           System.out.println("  [2] Get Course");
                           System.out.println("  [3] Update Course");
                           System.out.println("  [4] Delete Course");
                           System.out.println("  [5] Get All Courses");
                           System.out.println("  [0] Exit this Module");
                           System.out.println("---------------------------------------------------------------------------");
      
                           System.out.print("Enter the menu number to work on: ");
                           int select3 = Integer.parseInt(sc.nextLine());
                           System.out.println("---------------------------------------------------------------------------");
      
                           if(select3 == 1){
                             courseController.createCourse();
      
                           }
                           else if(select3 == 2){
                              courseController.displayCourse();
            
                           }
                           else if(select3 == 3){
                              courseController.updateCourse();
            
                           }
                           else if(select3 == 4){
                             courseController.deleteCourse();
            
                           }
                           else if(select3 == 5){
                             courseController.displayAllCourse();
            
                           }
                           else if(select3 == 0){
                              System.out.println("Exit this module.");
                              break;
      
                           }
      
                     }while(select > 0 && select <= 5 );
                     break;
      
                        case 4:
                        SubjectController subjectController = new SubjectController(sc);
                        do{
                           System.out.println("---------------------------------------------------------------------------");
                           System.out.println("Subject Module Menu: ");
                           System.out.println("  [1] Create Subject");
                           System.out.println("  [2] Get Subject");
                           System.out.println("  [3] Update Subject");
                           System.out.println("  [4] Delete Subject");
                           System.out.println("  [5] Get All Subjects");
                           System.out.println("  [0] Exit this Module");
                           System.out.println("---------------------------------------------------------------------------");
      
                           System.out.print("Enter the menu number to work on: ");
                           int select4 = Integer.parseInt(sc.nextLine());
                           System.out.println("---------------------------------------------------------------------------");
      
                           if(select4 == 1){
                             subjectController.createSubject();
            
                           }
                           else if(select4 == 2){
                              subjectController.displaySubject();
            
                           }
                           else if(select4 == 3){
                              subjectController.updateSubject();
            
                           }
                           else if(select4 == 4){
                             subjectController.deleteSubject();
            
                           }
                           else if(select4 == 5){
                             subjectController.displayAllSubject();
            
                           }
                           else if(select4 == 0){
                              System.out.println("Exit this module.");
                              break;
            
                           }
                     }while(select > 0 && select <= 5 );
                     break;
      
                        case 5:
                        ScheduleController scheduleController = new ScheduleController(sc);
                        do{
                           System.out.println("---------------------------------------------------------------------------");
                           System.out.println("Schedule Module Menu: ");
                           System.out.println("  [1] Create Schedule"); 
                           System.out.println("  [2] Get Schedule");
                     System.out.println("  [3] Update Schedule");
                     System.out.println("  [4] Delete Schedule");
                     System.out.println("  [5] Get All Schedules");
                     System.out.println("  [0] Exit this Module");
                     System.out.println("---------------------------------------------------------------------------");

                     System.out.print("Enter the menu number to work on: ");
                     int select5 = Integer.parseInt(sc.nextLine());
                     System.out.println("---------------------------------------------------------------------------");

                     if(select5 == 1){
                        scheduleController.createSchedule();
      
                     }
                     else if(select5 == 2){
                       scheduleController.displaySchedule();
                     
      
                     }
                     else if(select5 == 3){
                       scheduleController.updateSchedule();
      
                     }
                     else if(select5 == 4){
                       scheduleController.deleteSchedule();
      
                     }
                     else if(select5 == 5){
                       scheduleController.displayAllSchedule();
      
                     }
                     else if (select5 == 0){
                        System.out.println("Exit this module.");
                        break;                          
      
                     }
               }while (select > 0 && select <= 5);
               break;
                  
               }
            }else if(select == 0){
               System.out.println("Exit Application. ");
               System.exit(0);

            }
        }
    }
}

                        
                     
                        
