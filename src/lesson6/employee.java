public class employee {

    private String name;
    private int type, hours;
    private double rate;

    public employee() {
        name = "";
        type = 0;
        hours = 0;
        rate = 0;
    }

    public String getTypeRules() {
        return "1 or 2";
    }

    public String getNameRules() {

        return "not blank";
    }

    public String getRateRules() {
        return "Between 6.75 and 30.50";
    }

    public String getHourRules() {
        return "between 1 and 60 hours";

    }

    public boolean setName(String n) {
        boolean blank = (n.equals(""));
        if (blank) {
            return false;
        } else {
            name = n;
            return true;
        }
    }

    public boolean setType(int tp) {
        boolean rightType = (tp == 1 || tp == 2);
        if (rightType) {
            type = tp;
            return true;
        } else {
            return false;
        }
    }
    public boolean setRate(double rt){
        boolean takeok = (rt >=6.75 && rt <=30.50);
        if(takeok){
            rate = rt;
            return true;
        }
        else
            return false;
    }
}
