import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Developer dev = new Developer("Maciek", "Waszkiewicz", "Łopuszańska 24", "MWASZ@gmail.com", 023453457, 2023);
        Technology t = new Technology("programowanie", 250);
        employees.add(dev);
        dev.addTechnology(t);


        Tester tes = new Tester("Maciek", "Waszkiewicz", "Łopuszańska 24", "MWASZ@gmail.com", 023453457, 2023);
        Testtype te = new Testtype("UI/UX", 300);
        employees.add(tes);
        tes.addTestTypes(te);


        Manager man = new Manager("Maciek", "Waszkiewicz", "Łopuszańska 24", "MWASZ@gmail.com", 023453457, 2023);
        Goal g = new Goal(2022, 12, 13, "projekt brand", 1500);
        employees.add(man);
        man.addGoal(g);

        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();

            System.out.println("Total amount to be paid this month: "
                    + totalAmount + " USD");
        }
    }
}


