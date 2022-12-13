package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;

import ph.edu.sorsu.dao.ScheduleDAO;
import ph.edu.sorsu.dao.impl.ScheduleDAOImpl;
import ph.edu.sorsu.entity.Schedule;
import ph.edu.sorsu.entity.Teacher;
import ph.edu.sorsu.entity.Subject;



public class ScheduleController {
    private ScheduleDAO<ph.edu.sorsu.entity.Schedule> scheduleDAO;
    private Scanner sc;

    public ScheduleController(Scanner sc){
        this.scheduleDAO = new ScheduleDAOImpl();
        this.sc = sc;
    }

    public void createSchedule(){
        System.out.println("Fill up the schedule form. ");

        System.out.print("ID              : ");
        Long id = Long.parseLong(sc.nextLine());

        System.out.print("Subject         : ");
        Subject subject = new Subject();
        subject.setSubject(sc.nextLine());

        System.out.print("Teacher         : ");
        Teacher teacher = new Teacher();
        teacher.setTeacher(sc.nextLine());

        System.out.print("Time Start      : ");
        String timeStart = sc.nextLine();

        System.out.print("Time End        : ");
        String timeEnd = sc.nextLine();

        System.out.print("Day of the Week : ");
        String dayOfTheWeek = sc.nextLine();

        Schedule schedule = new Schedule();
        schedule.setId(id);
        schedule.setSubject(subject);
        schedule.setTeacher(teacher);
        schedule.setTimeStart(timeStart);
        schedule.setTimeEnd(timeEnd);
        schedule.setDayOfTheWeek(dayOfTheWeek);

        scheduleDAO.create(schedule);
    }

    public void displaySchedule(){
        System.out.println("To get course record, provide the index position. ");
        System.out.print("Index Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Schedule schedule = scheduleDAO.read(indexPosition);

        System.out.println("--------------------------- Schedule Information --------------------------");
        System.out.println("ID              : " + schedule.getId());
        System.out.println("Subject         : " + schedule.getSubject());
        System.out.println("Teacher         : " + schedule.getTeacher());
        System.out.println("Time Start      : " + schedule.getTimeStart());
        System.out.println("Time End        : " + schedule.getTimeEnd());
        System.out.println("Day of the Week : " + schedule.getDayOfTheWeek());
    }
    public void updateSchedule() {
        System.out.println("To update the course record, provide the index position. ");
        System.out.print("Index Position");
        int indexPosition = Integer.parseInt(sc.nextLine());

        Schedule schedule = scheduleDAO.read(indexPosition);
        scheduleDAO.read(indexPosition);

        System.out.println("--------------------------- Schedule Information --------------------------");
        System.out.println("ID              : " + schedule.getId());
        System.out.println("Subject         : " + schedule.getSubject());
        System.out.println("Teacher         : " + schedule.getTeacher());
        System.out.println("Time Start      : " + schedule.getTimeStart());
        System.out.println("Time End        : " + schedule.getTimeEnd());
        System.out.println("Day of the Week : " + schedule.getDayOfTheWeek());

        System.out.println("Update the Schedule Information. ");

        System.out.print("ID              : ");
        Long.parseLong(sc.nextLine());

        System.out.print("Subject         : ");
        sc.nextLine();

        System.out.print("Teacher         : ");
        sc.nextLine();

        System.out.print("Time Start      : ");
        sc.nextLine();

        System.out.print("Time End        : ");
        sc.nextLine();

        System.out.print("Day of the Week : ");
        sc.nextLine();

        scheduleDAO.update(indexPosition, schedule);

    }
    public void deleteSchedule(){
        System.out.println("To delete the schedule record, provide the index position. ");
        System.out.print("Indedx Position : ");
        int indexPosition = Integer.parseInt(sc.nextLine());

        scheduleDAO.delete(indexPosition);
    }
    public void displayAllSchedule(){
        List<Schedule> Schedule = scheduleDAO.readAll();

        System.out.println("Display All The Schedule. ");
        System.out.println("ID, SUBJECT, TEACHER, TIME START, TIME END, DAY OF THE WEEK");
        for(Schedule schedule: Schedule){
            System.out.println(schedule.getId() + ", " + schedule.getSubject() + ", " + schedule.getTeacher() + ", " + schedule.getTimeStart() + ", " + schedule.getTimeEnd() + ", " + schedule.getDayOfTheWeek());
        }
    }
}