package BT1;

public class NextDayCalculator {
    public static int findNextDay(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (checkYear(year))
                    return 29;
                else
                    return 28;
        }
        return 31;
    }

    private static boolean checkYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public static String findNextYear(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        if (day == findNextDay(month, year)) {
            nextDay = 1;
            if (month == 12) {
                nextMonth = 1;
                nextYear++;
            } else {
                nextMonth++;
            }
        } else {
            nextDay++;
        }
        return nextDay + "/" + nextMonth + "/" + nextYear;
    }
}
