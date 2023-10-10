public class Utils {
    public static void check(int x, int y, int z) {
        int count = 0;
        if (x > 0) {
            count = 1;
        }
        if (y > 0) {
            count = count + 1;
        }
        if (z > 0) {
            count = count + 1;
        }

        switch (count) {
            case 3:
                System.out.println("excellent");
                break;
            case 2:
                System.out.println("good");
                break;
            case 1:
                System.out.println("fine");
                break;
            case 0:
                System.out.println("bad");
                break;
        }
    }

    public static void checkDayAndMonthIsHoliday(int day, int month) {
        final String errorDate = "Недопустимая дата";
        final String holiday = "Holiday";
        final String notHoliday = "Not Holiday";

        if ((month < 1 || month > 12) || (day < 1 || day > 31)) {
            System.out.println(errorDate);
        } else {
            switch (month) {
                case 1:
                    if (day == 1 || day == 7) {
                        System.out.println(holiday);
                    } else {
                        System.out.println(notHoliday);
                    }
                    break;
                case 2:
                    if (day > 29) {
                        System.out.println(errorDate);
                    } else {
                        System.out.println(notHoliday);
                    }
                    break;
                case 3:
                    if (day == 8) {
                        System.out.println(holiday);
                    } else {
                        System.out.println(notHoliday);
                    }
                    break;
                case 5:
                    if (day == 1 || day == 9) {
                        System.out.println(holiday);
                    } else {
                        System.out.println(notHoliday);
                    }
                    break;
                case 7:
                    if (day == 3) {
                        System.out.println(holiday);
                    } else {
                        System.out.println(notHoliday);
                    }
                    break;
                case 11:
                    if (day == 7) {
                        System.out.println(holiday);
                    } else {
                        System.out.println(notHoliday);
                    }
                    break;
                case 12:
                    if (day == 25) {
                        System.out.println(holiday);
                    } else {
                        System.out.println(notHoliday);
                    }
                    break;
                default:
                    System.out.println(notHoliday);
            }
        }
    }
}
