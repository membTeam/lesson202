package spr.lesson202;

import models.EFaculties;
import models.LoadFromCSV;
import models.Slytherin;
import models.University;

import java.io.IOError;
import java.io.IOException;

import static devlApi.APIprintService.println;

public class Main {

    private static University university;

    public static void main(String[] args) {

        university = new University();

        var loadFromCSV = new LoadFromCSV();

        try{
            var res = loadFromCSV.loadSlytherin(university);
            println("Факультет: " + res.getClass().getSimpleName());
            for (var item : res.getListStudent()) {
                println(item.toString());
            }
            var student10 = res.getListStudent().get(0);
            var student20 = res.getListStudent().get(2);
            university.complaireValue("distMagi", student10, student20);
            university.complaireValue("resourcefulness", student10, student20);
            university.getMaxPersonalQualities(EFaculties.SLYTHERIN);
            university.getSumMaxProperties(res.getListStudent());


            println("");
            var res2 = loadFromCSV.loadGryffindor(university);
            println("Факультет: " + res2.getClass().getSimpleName());
            for (var item : res2.getListStudent()) {
                println(item.toString());
            }
            var student11 = res2.getListStudent().get(0);
            var student21 = res2.getListStudent().get(res2.getListStudent().size() - 1);
            university.complaireValue("distMagi", student11, student21);
            university.complaireValue("bravery", student11, student21);
            university.getMaxPersonalQualities(EFaculties.GRYFFINDOR);

            println("");
            var res3 = loadFromCSV.loadPufendies(university);
            println("Факультет: " + res3.getClass().getSimpleName());
            for (var item : res3.getListStudent()) {
                println(item.toString());
            }
            var student12 = res3.getListStudent().get(0);
            var student22 = res3.getListStudent().get(2);
            university.complaireValue("distMagi", student12, student22);
            university.complaireValue("loyaltyToIdeals", student12, student22);
            university.getMaxPersonalQualities(EFaculties.PUFENDIES);

            println("");
            var res4 = loadFromCSV.loadCogtevran(university);
            println("Факультет: " + res4.getClass().getSimpleName());
            for (var item : res4.getListStudent()) {
                println(item.toString());
            }
            var student13 = res4.getListStudent().get(0);
            var student23 = res4.getListStudent().get(res4.getListStudent().size() - 1);
            university.complaireValue("distMagi", student13, student23);
            university.complaireValue("witty", student13, student23);
            university.complaireValue("mudras", student13, student23);
            university.getMaxPersonalQualities(EFaculties.COGTEVRAN);
            university.getSumMaxProperties(res4.getListStudent());

        } catch (IOException | NumberFormatException ex){
            println(ex.getMessage());
        }

    }
}