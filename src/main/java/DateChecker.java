public class DateChecker {
    public boolean has31Days(Month month) {
        if (month == Month.JANUARY || month == Month.MARCH || month == Month.MAY
                || month == Month.JULY || month == Month.AUGUST || month == Month.OCTOBER
                || month == Month.DECEMBER) {
            return true;
        }

        return false;
    }
}
