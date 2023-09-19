package models;

public abstract class Student {
    private String nameStudent;
    private int magi;
    private int distMagi;

    public Student(){}

    public abstract String getValue(String value) throws Exception;
    public abstract int getSumPropertiesForFacult();
    public abstract int getSumProperties();

    @Override
    public String toString() {
        return "name=" + nameStudent +
                " magi=" + magi +
                " distMagi=" + distMagi
                ;
    }

    public int getSumPersonalQualities(){
        return magi + distMagi;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getMagi() {
        return magi;
    }

    public void setMagi(int magi) {
        this.magi = magi;
    }

    public int getDistMagi() {
        return distMagi;
    }

    public void setDistMagi(int distMagi) {
        this.distMagi = distMagi;
    }


}
