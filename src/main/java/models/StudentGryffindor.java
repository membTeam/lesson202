package models;

public class StudentGryffindor extends Student {

    private int nobility;
    private int honor;
    private int bravery;

    public StudentGryffindor() {}

    @Override
    public String toString() {
        return "StudentGryffindor{" +
                super.toString() +
                " nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public int getSumProperties(){
        return super.getSumPersonalQualities() + getSumPropertiesForFacult();
    }

    @Override
    public int getSumPropertiesForFacult(){
        return nobility + honor + bravery;
    }

    @Override
    public String getValue(String value) throws Exception {
        if (value.equalsIgnoreCase("nameStudent")) {
            throw new Exception("Сравнение только по числовым параметрам");
        }

        String res;
        res = switch (value.toLowerCase().trim()){
            case "magi" -> String.valueOf(getMagi());
            case "distmagi" -> String.valueOf(getDistMagi());

            case "nobility" -> String.valueOf(nobility);
            case "honor" -> String.valueOf(honor);
            case "bravery" -> String.valueOf(bravery);
            default -> throw new Exception("Параметр не определен ("+ value + ")");
        };

        return res;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
