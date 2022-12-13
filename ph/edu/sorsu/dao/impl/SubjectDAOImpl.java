package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ph.edu.sorsu.dao.SubjectDAO;
import ph.edu.sorsu.entity.Subject;

public class SubjectDAOImpl implements SubjectDAO<Subject> {
    private List<Subject> listOfSubjects = new ArrayList<>();

 
    public void create(Subject entity){
        boolean isAdd = listOfSubjects.add(entity);

        if(isAdd) {
            System.out.println("[INFO] You have successfully added a new subject. ");
        }else{
            System.out.println("[ERROR] You have NOT successfully added a new subject. ");
        }
    }
    public Subject read(int indexPosition){
        System.out.println("[INFO] Retrieving subjedct record from the list...");
        return listOfSubjects.get(indexPosition);
    }
    public void update(int indexPosition, Subject entity){
        System.out.println("[INFO] Updating the subject record in the list.");
        listOfSubjects.remove(indexPosition);
        listOfSubjects.add(indexPosition, entity);
        System.out.println("[INFO] You have succesfully updated the subject.");

    }
    public void delete(int indexPosition){
        System.out.println("[INFO] Deleting subject record from the list.");
        listOfSubjects.remove(indexPosition);
        System.out.println("[INFO] You have successfully deleted the subject. ");
    }
    public List<Subject> readAll(){
        System.out.println("[INFO] Retrieving the list of subject.");
        System.out.println("[INFO] " + listOfSubjects.size() + "Subject(s) foud in your list.");
        return listOfSubjects;
    }
}