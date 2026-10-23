import java.util.Objects;

public class DateChecker {
    public boolean has31Days(Month month) {
        Objects.requireNonNull(month, "month must not be null");

        if (month == Month.JANUARY || month == Month.MARCH || month == Month.MAY
                || month == Month.JULY || month == Month.AUGUST || month == Month.OCTOBER
                || month == Month.DECEMBER) {
            return true;
        }

        return false;
    }
}
