package models;

import devlApi.RecordStudent;

import java.util.List;

public class Gryffindor {
    private List<StudentGryffindor> listStudent;

    public Gryffindor(){}

    public void setListStudent(List<StudentGryffindor> listStudent) {
        this.listStudent = listStudent;
    }

    public List<StudentGryffindor> getListStudent() {
        return listStudent;
    }

    public RecordStudent getMaxPersonalQualities(){

        int temp = 0;
        StudentGryffindor student = null;

        for(var item : listStudent){
            if (item.getSumPersonalQualities()> temp){
                temp = item.getSumPersonalQualities();
                student = item;
            }
        }

        return new RecordStudent(student.getNameStudent(), student.getMagi(), student.getDistMagi());
    }

}
