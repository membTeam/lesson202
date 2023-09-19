package models;

public class StudentCogtevran extends Student {

    private int smart;
    private int mudras;
    private int witty;


    @Override
    public int getSumProperties(){
        return super.getSumPersonalQualities() + getSumPropertiesForFacult();
    }
    @Override
    public int getSumPropertiesForFacult(){
        return smart + mudras + witty;
    }
    @Override
    public String getValue(String value) throws Exception {
        if (value.equalsIgnoreCase("nameStudent")){
            throw new Exception("Сравнение только по числовым параметрам");
        }

        String res;
        res = switch (value.toLowerCase().trim()){
            case "magi" -> String.valueOf(getMagi());
            case "distmagi" -> String.valueOf(getDistMagi());

            case "smart" -> String.valueOf(smart);
            case "mudras" -> String.valueOf(mudras);
            case "witty" -> String.valueOf(witty);
            default -> throw new Exception("Параметр не определен ("+ value + ")");
        };

        return res;
    }

    @Override
    public String toString() {
        return "StudentCogtevran{" +
                super.toString() +
                " smart=" + smart +
                ", mudras=" + mudras +
                ", witty=" + witty +
                '}';
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setMudras(int mudras) {
        this.mudras = mudras;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }
}
