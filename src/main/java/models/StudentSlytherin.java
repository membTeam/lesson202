package models;

public class StudentSlytherin extends Student {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public StudentSlytherin() { }

    @Override
    public String toString() {
        return "StudentSlytherin {" +
                super.toString() +
                " cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    @Override
    public String getValue(String value) throws Exception {
        if (value.equalsIgnoreCase("nameStudent")) {
            throw new Exception("Сравнение только по числовым параметрам");
        }

        var strValue = value.toLowerCase().trim();

        String res;
        res = switch (strValue) {
            case "magi" -> String.valueOf(getMagi());
            case "distmagi" -> String.valueOf(getDistMagi());

            case "cunning" -> String.valueOf(cunning);
            case "determination" -> String.valueOf(determination);
            case "ambition" -> String.valueOf(ambition);
            case "resourcefulness" -> String.valueOf(resourcefulness);
            case "lustforpower" -> String.valueOf(lustForPower);
            default -> throw new Exception("Параметр не определен (" + value + ")");
        };

        return res;

    }

    @Override
    public int getSumProperties(){
        return super.getSumPersonalQualities() + getSumPropertiesForFacult();
    }

    @Override
    public int getSumPropertiesForFacult(){
        return cunning +
                determination + ambition +
                resourcefulness + lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
