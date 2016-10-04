
public class SwiftDate {

    int year;
    int month;
    int day;

    SwiftDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    int getDaysDifference(SwiftDate other) { // sums all years, months and days inbetween the first and the secound date

        int yearsDiff = 0;
        int copyThisYear = this.year;
        for (int i = this.year + 1; i < other.year; i++) {
            if (isLeapYear(copyThisYear) == true) {
                yearsDiff += 366;
            } else {
                yearsDiff += 365; // sums the full years passed
            }
            copyThisYear++;
        }

        int copyMonth = this.month + 1;
        int monthsDiff = 0;
        if (this.year == other.year) {
            for (int i = this.month + 1; i < other.month; i++) {
                monthsDiff += switchCase(copyMonth); // sums the full months passed

                copyMonth++;
            }

        } else {
            for (int i = this.month + 1; i <= 12; i++) {
                monthsDiff += switchCase(copyMonth);
                copyMonth++;
            }
            for (int i = 1; i < other.month; i++) {
                monthsDiff += switchCase(i);

            }

        }

        int daysDiff = 0;

        daysDiff += switchCase(this.month) - this.day; // sums the days passed 
        daysDiff += other.day;
        int daysDifference = yearsDiff + monthsDiff + daysDiff;

        return daysDifference;

    }

    boolean isLeapYear(int year) { // checks if the year is leap 
        boolean leapYear = false;

        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            leapYear = true;
        }

        return leapYear;
    }

    int getCentury(int year) { // returns the century
        int century = 0;
        century = year / 100 + 1;

        return century;
    }

    private int switchCase(int input) { // switch case for the days in the months
        int sumMonths = 0;
        switch (input) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                sumMonths += 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                sumMonths += 30;
                break;

            case 2:
                if (isLeapYear(this.year) == true) {
                    sumMonths += 29;
                } else {
                    sumMonths += 28;

                }
                break;

            default:
                break;
        }
        return sumMonths;
    }

    void printInfo() {
        if (isLeapYear(year) == true) {
            System.out.printf("%d %d %d - %d century. It's leap year", year, month, day, getCentury(year));
            System.out.println();
        } else {
            System.out.printf("%d %d %d - %d century.", year, month, day, getCentury(year));
            System.out.println();
        }
    }

}
