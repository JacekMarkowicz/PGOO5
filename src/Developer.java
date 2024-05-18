import java.util.ArrayList;

public class Developer extends Employee{

    ArrayList<Technology> technologies =  new ArrayList<>();
    public Developer(String name,String nazwisko,String adres, String email, int pesel, int rokZatrudnienia){
        super(name,nazwisko,adres,email,pesel,rokZatrudnienia);
        this.technologies = new ArrayList<>();

    }
    public void addTechnology(Technology technology) {
        this.technologies.add(technology);
    }
    public int calculateSalary() {
        int salary = super.calculateSalary();
        for (Technology technology : technologies) {
            salary += technology.getBonus();
        }
        return salary;
    }
}
