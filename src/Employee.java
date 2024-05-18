import java.util.Calendar;

public class Employee {

    private static int rok = 2024;
    private static int PremiaZaRok = 1000;
    public int zarobek = 3000;
    public String imie;
    public String nazwisko;
    public String adres;
    public String email;
    public long pesel;
    public int rokZatrudnienia;


    public Employee(String name,String nazwisko,String adres, String email, int pesel, int rokZatrudnienia){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.adres=adres;
        this.email=email;
        this.pesel=pesel;
        this.rokZatrudnienia=rokZatrudnienia;
    }
    public int calculateSalary() {
        int obecnyrok = Calendar.getInstance().get(Calendar.YEAR);
        int latapracy = obecnyrok - rokZatrudnienia;
        return zarobek + (latapracy * PremiaZaRok);
    }

}
