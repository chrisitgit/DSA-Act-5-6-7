package ph.edu.sorsu.entity;

public class Schedule {
    private Long id;
    private Subject subject;
    private Teacher teacher;
    private String timeStart;
    private String timeEnd;
    private String dayOfTheWeek;
   
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Subject getSubject(){
        return subject;
    }
    public void setSubject(Subject subject){
        this.subject = subject;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public String getTimeStart(){
        return timeStart;
    }
    public void setTimeStart(String timeStart){
        this.timeStart = timeStart;
    }
    public String getTimeEnd(){
        return timeEnd;
    }
    public void setTimeEnd(String timeEnd){
        this.timeEnd = timeEnd;
    }
    public String getDayOfTheWeek(){
        return dayOfTheWeek;
    }
    public void setDayOfTheWeek(String dayOfTheWeek){
        this.dayOfTheWeek = dayOfTheWeek;
    }
}