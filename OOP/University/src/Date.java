public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (year % 400 == 0) {
            if (month == 2) {
                if (day <= 28 && day >= 1) {
                    this.day = day;
                    this.month = month;
                } else {
                    System.out.println("day >= 28");
                }
            }

        }
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("day >= 1 and day <= 31");
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Month >= 1 and Month <= 12");
            this.month = 1;
        }
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Year > 0");
            this.year = 1;
        }

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year + " ";
    }
}
