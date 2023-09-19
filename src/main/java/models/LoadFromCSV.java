package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadFromCSV {
    private static int parsToInt(String arg){
        return Integer.parseInt(arg.trim());
    }

    private static List<String> loadCSVfile(EFaculties eFaculties) throws IOException {

        var file = switch (eFaculties){
            case COGTEVRAN -> "cogtevran.csv";
            case SLYTHERIN -> "slytherin.csv";
            case GRYFFINDOR -> "gryffindor.csv";
            case PUFENDIES -> "pufendies.csv";
        };

        var pathFile = "csvData/" + file;

        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        }

        return result;
    }

    public Slytherin loadSlytherin(University university) throws IOException, NumberFormatException {
        List<StudentSlytherin> result = new ArrayList<>();
        var listCSV = loadCSVfile(EFaculties.SLYTHERIN);

        for(var item : listCSV){
            var entity = new StudentSlytherin();
            var arr = item.split(",");
            entity.setNameStudent(arr[0]);
            entity.setMagi(parsToInt(arr[1]));
            entity.setDistMagi(parsToInt(arr[2]));

            entity.setCunning(parsToInt(arr[3]));
            entity.setDetermination( parsToInt(arr[4]));
            entity.setAmbition(parsToInt(arr[5]));
            entity.setResourcefulness(parsToInt(arr[6]));
            entity.setLustForPower(parsToInt(arr[7]));

            result.add(entity);
        }

        Slytherin slytherin;
        slytherin = new Slytherin();
        slytherin.setListStudent(result);

        university.setSlytherin(slytherin);

        return slytherin;
    }

    public Gryffindor  loadGryffindor(University university) throws IOException, NumberFormatException {
        List<StudentGryffindor> result = new ArrayList<>();
        var listCSV = loadCSVfile(EFaculties.GRYFFINDOR);

        for(var item : listCSV){
            var entity = new StudentGryffindor();
            var arr = item.split(",");
            entity.setNameStudent(arr[0]);
            entity.setMagi(parsToInt(arr[1]));
            entity.setDistMagi(parsToInt(arr[2]));

            entity.setNobility(parsToInt(arr[3]));
            entity.setHonor(parsToInt(arr[4]));
            entity.setBravery(parsToInt(arr[5]));

            result.add(entity);
        }

        Gryffindor gryffindor;
        gryffindor = new Gryffindor();
        gryffindor.setListStudent(result);

        university.setGryffindor(gryffindor);

        return gryffindor;
    }

    public Cogtevran loadCogtevran(University university) throws IOException, NumberFormatException {
        List<StudentCogtevran> result = new ArrayList<>();
        var listCSV = loadCSVfile(EFaculties.COGTEVRAN);

        for(var item : listCSV){
            var entity = new StudentCogtevran();
            var arr = item.split(",");
            entity.setNameStudent(arr[0]);
            entity.setMagi(parsToInt(arr[1]));
            entity.setDistMagi(parsToInt(arr[2]));

            entity.setSmart(parsToInt(arr[3]));
            entity.setMudras(parsToInt(arr[4]));
            entity.setWitty(parsToInt(arr[5]));

            result.add(entity);
        }

        Cogtevran cogtevran;
        cogtevran= new Cogtevran();
        cogtevran.setListStudent(result);

        university.setCogtevran(cogtevran);

        return cogtevran;
    }

    public Pufendies loadPufendies(University university) throws IOException, NumberFormatException {
        List<StudentPufendies> result = new ArrayList<>();
        var listCSV = loadCSVfile(EFaculties.PUFENDIES);

        for(var item : listCSV){
            var entity = new StudentPufendies();
            var arr = item.split(",");
            entity.setNameStudent(arr[0]);
            entity.setMagi(parsToInt(arr[1]));
            entity.setDistMagi(parsToInt(arr[2]));

            entity.setHardworking(parsToInt(arr[3]));
            entity.setLoyaltyToIdeals(parsToInt(arr[4]));
            entity.setHonesty(parsToInt(arr[5]));

            result.add(entity);
        }

        Pufendies pufendies;
        pufendies = new Pufendies();
        pufendies.setListStudent(result);

        university.setPufendies(pufendies);

        return pufendies;
    }

}
