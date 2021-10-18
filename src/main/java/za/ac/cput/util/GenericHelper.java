package za.ac.cput.util;
import za.ac.cput.entity.OrderDetails;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class GenericHelper {
    public static String generateAnId() {
        return UUID.randomUUID().toString(); }

    public static String generateDate() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        String dateString = dateFormat.format(date);
        return dateString; }

    public static String generateShippingDate() {
        Calendar date = Calendar.getInstance();
        date.add(Calendar.DAY_OF_MONTH,7); //shipping is delayed by 7 days from order date
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        String dateString = dateFormat.format(date.getTime());
        return dateString; }

}
