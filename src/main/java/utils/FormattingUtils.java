package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FormattingUtils {

    public static String getTimestampToIsoDate(long timestamp) {
        Date d = new Date(timestamp*1000);
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        f.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
        return f.format(d);
    }


}
