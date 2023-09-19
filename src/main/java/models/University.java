package models;

import devlApi.RecordStudent;

import java.util.List;

import static devlApi.APIprintService.println;

public class University {
    private String name;
    private Cogtevran cogtevran;
    private Gryffindor gryffindor;
    private Pufendies pufendies;
    private Slytherin slytherin;

    public University(){
        name = "Хогвартс";
    }

    public <T extends Student> void getSumMaxProperties(List<T> listStudent){
        int value = 0;
        T entity = null;

        for(var item : listStudent){
            if (item.getSumProperties() > value){
                value = item.getSumProperties();
                entity = item;
            }
        }

        println(
                "Высшие показатели:" + entity.getNameStudent() +
                        " личныеПоказатели:" + entity.getSumPersonalQualities () +
                        " на уровне факультета:" + entity.getSumPropertiesForFacult() +
                        " общая сумма:" + entity.getSumProperties()
        );
    }

    public void getMaxPersonalQualities(EFaculties eFaculties){

        RecordStudent record  = null;
        record = switch (eFaculties){
          case COGTEVRAN -> cogtevran.getMaxPersonalQualities();
          case SLYTHERIN -> slytherin.getMaxPersonalQualities();
          case GRYFFINDOR -> gryffindor.getMaxPersonalQualities();
          case PUFENDIES -> pufendies.getMaxPersonalQualities();
        };

        println(
                "Студент с наилучшими личными показателями:" + record.name() +
                        " magi:" + record.magi() +
                        " distMagi:" + record.distMagi()
        );

    }

    public <T extends Student> void complaireValue( String parComp, T student1, T student2 ){
        try {
            var valStudent1 = student1.getValue(parComp);
            var valStudent2 = student2.getValue(parComp);

            println("Сравнение " + parComp + ": " +
                    student1.getNameStudent() + ":" +
                    valStudent1 + ":" +
                    " " + student2.getNameStudent() + ":"+
                    valStudent2 );

        } catch (Exception ex){
            println(ex.getMessage());
        }
    }


    public void setCogtevran(Cogtevran cogtevran) {
        this.cogtevran = cogtevran;
    }

    public void setGryffindor(Gryffindor gryffindor) {
        this.gryffindor = gryffindor;
    }

    public void setPufendies(Pufendies pufendies) {
        this.pufendies = pufendies;
    }

    public void setSlytherin(Slytherin slytherin) {
        this.slytherin = slytherin;
    }

    public Cogtevran getCogtevran() {
        return cogtevran;
    }

    public Gryffindor getGryffindor() {
        return gryffindor;
    }

    public Pufendies getPufendies() {
        return pufendies;
    }

    public Slytherin getSlytherin() {
        return slytherin;
    }
}
