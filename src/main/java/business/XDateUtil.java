package business;

import java.util.Calendar;

/**
 * Created by xfhy on 2021/1/27 14:44
 * Description :
 */
public class XDateUtil {

    public static boolean isAddingTime(int targetHour, int targetStartMinute, int targetEndMinute) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        return hour == targetHour &&
                minute >= targetStartMinute &&
                minute <= targetEndMinute;
    }

}
