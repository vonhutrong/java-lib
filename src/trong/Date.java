package trong;

public class Date {

    public static java.sql.Date parse(java.util.Date utilDate) {
        return new java.sql.Date(utilDate.getTime());
    }
}
