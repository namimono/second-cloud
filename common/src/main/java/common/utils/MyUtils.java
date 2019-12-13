package common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by wuxiao on 2019/12/10 16:21.
 */
public class MyUtils {
    /**
     * 获得UUID
     *
     * @return UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 获得当前时间格式化后的时间
     *
     * @return yyyy-MM-dd格式的时间
     */
    public static String getNowFormat(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

}
