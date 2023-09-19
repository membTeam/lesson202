package models;

import devlApi.RecordStudent;

import java.util.List;

public class Slytherin {

    private List<StudentSlytherin> listStudent;

    public Slytherin(){}

    public void setListStudent(List<StudentSlytherin> listStudent) {
        this.listStudent = listStudent;
    }

    public List<StudentSlytherin> getListStudent() {
        return listStudent;
    }

    public RecordStudent getMaxPersonalQualities(){

        int temp = 0;
        StudentSlytherin student = null;

        for(var item : listStudent){
            if (item.getSumPersonalQualities()> temp){
                temp = item.getSumPersonalQualities();
                student = item;
            }
        }

        return new RecordStudent(student.getNameStudent(), student.getMagi(), student.getDistMagi());
    }

}
