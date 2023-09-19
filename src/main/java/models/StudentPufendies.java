package models;

public class StudentPufendies extends Student {
    private int hardworking;
    private int loyaltyToIdeals;
    private int honesty;

    public StudentPufendies(){}

    @Override
    public String toString() {
        return "StudentPufendies{" +
                super.toString() +
                " hardworking=" + hardworking +
                ", loyaltyToIdeals=" + loyaltyToIdeals +
                ", honesty=" + honesty +
                '}';
    }

    @Override
    public int getSumProperties(){
        return super.getSumPersonalQualities() + getSumPropertiesForFacult();
    }

    @Override
    public int getSumPropertiesForFacult(){
        return hardworking + loyaltyToIdeals + honesty;
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

            case "hardworking" -> String.valueOf(hardworking);
            case "loyaltytoideals" -> String.valueOf(loyaltyToIdeals);
            case "honesty" -> String.valueOf(honesty);
            default -> throw new Exception("Параметр не определен ("+ value + ")");
        };

        return res;

    }


    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyaltyToIdeals(int loyaltyToIdeals) {
        this.loyaltyToIdeals = loyaltyToIdeals;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
