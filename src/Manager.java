import java.util.ArrayList;

public class Manager extends Employee{
    ArrayList<Goal>goals = new ArrayList<>();
    public String cel;
    public String nazwa;
    public double wysokoscBonusu;

    public Manager(String name,String nazwisko,String adres, String email, int pesel, int rokZatrudnienia){
        super(name,nazwisko,adres,email,pesel,rokZatrudnienia);
    }
    public void addGoal(Goal goal){
        this.goals.add(goal);
    }
    @Override
    public int calculateSalary(){
        int salary = super.calculateSalary();
        for(Goal goal : goals){
            salary += goal.getBonus();
        }
        return salary;
    }
}
