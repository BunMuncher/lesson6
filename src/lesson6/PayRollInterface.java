package lesson6;

import TerminalIO.*;

public class PayRollInterface {

    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        employee emp;
        String name, prompt;
        int type, hours;
        double rate;
        emp = new employee();
        while (true) {
            System.out.println("Enter employee data: ");
            name = r.readLine("Name (or blank to quit)");
            if (!(emp.setName(name))) {
                break;
            }

            while (true) {
                prompt = " Type (" + emp.getTypeRules() + "):";
                type = r.readInt(prompt);
                if (emp.setType(type)) {
                    break;
                }
            }
            while (true) {
                prompt = " Hourly rate(" + emp.getRateRules() + "):";
                rate = r.readDouble(prompt);
                if (emp.setRate(rate)) {
                    break;
                }
            }
            while (true) {
                prompt = " Hours(" + emp.getHourRules() + "):";
                hours = r.readInt(prompt);
                if (emp.setHours(hours)) {
                    break;
                }
            }
            System.out.println(" The weekly pay for ");
            System.out.print(emp.getName());
            System.out.println(" is " + emp.getPay());
        }
    }
}
