package models;

import devlApi.RecordStudent;

import java.util.List;

public class Cogtevran {
    private List<StudentCogtevran> listStudent;

    public Cogtevran(){}

    public void setListStudent(List<StudentCogtevran> listStudent) {
        this.listStudent = listStudent;
    }

    public List<StudentCogtevran> getListStudent() {
        return listStudent;
    }

    public RecordStudent getMaxPersonalQualities(){

        int temp = 0;
        StudentCogtevran student = null;

        for(var item : listStudent){
            if (item.getSumPersonalQualities()> temp){
                temp = item.getSumPersonalQualities();
                student = item;
            }
        }

        return new RecordStudent(student.getNameStudent(), student.getMagi(), student.getDistMagi());
    }

}
