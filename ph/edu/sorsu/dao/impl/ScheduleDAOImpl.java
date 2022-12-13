package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ph.edu.sorsu.dao.ScheduleDAO;
import ph.edu.sorsu.entity.Schedule;

public class ScheduleDAOImpl implements ScheduleDAO<Schedule> {
    private List<Schedule> listOfSchedules = new ArrayList<>();

    
    public void create(Schedule entity){
        boolean isAdd = listOfSchedules.add(entity);

        if(isAdd) {
            System.out.println("[INFO] You have successfully added a new schedule. ");
        }else{
            System.out.println("[ERROR] You have NOT successfully added a new schedule. ");
        }
    }
    public Schedule read(int indexPosition){
        System.out.println("[INFO] Retrieving schedule record from the list...");
        return listOfSchedules.get(indexPosition);
    }
    public void update(int indexPosition, Schedule entity){
        System.out.println("[INFO] Updating the schedule record in the list.");
        listOfSchedules.remove(indexPosition);
        listOfSchedules.add(indexPosition, entity);
        System.out.println("[INFO] You have succesfully updated the schedule.");

    }
    public void delete(int indexPosition){
        System.out.println("[INFO] Deleting schedule record from the list.");
        listOfSchedules.remove(indexPosition);
        System.out.println("[INFO] You have successfully deleted the teacher. ");
    }
    public List<Schedule> readAll(){
        System.out.println("[INFO] Retrieving the list of schedule.");
        System.out.println("[INFO] " + listOfSchedules.size() + "Schedule(s) foud in your list.");
        return listOfSchedules;
    }
}