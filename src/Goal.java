import java.util.Calendar;

class Goal {
    private int year;
    private int month;
    private int day;
    private String name;
    private int bonus;

    public Goal(int year, int month, int day, String name, int bonus) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.bonus = bonus;
    }

    public boolean isAchievedThisMonth() {
        Calendar now = Calendar.getInstance();
        return this.year == now.get(Calendar.YEAR) && this.month == (now.get(Calendar.MONTH) + 1);
    }

    public int getBonus() {
        return this.bonus;
    }
}