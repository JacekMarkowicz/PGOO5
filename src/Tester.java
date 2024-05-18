import java.util.ArrayList;

public class Tester extends Employee{
    ArrayList<Testtype> testtypes = new ArrayList<>();
    public Tester(String name,String nazwisko,String adres, String email, int pesel, int rokZatrudnienia){
        super(name,nazwisko,adres,email,pesel,rokZatrudnienia);
    }
    public void addTestTypes(Testtype testtype){
        this.testtypes.add(testtype);
    }
    @Override
    public int calculateSalary(){
        int salary = super.calculateSalary();
        for(Testtype testtype: testtypes){
            salary += testtype.getBonus();
    }return salary;
}
}
