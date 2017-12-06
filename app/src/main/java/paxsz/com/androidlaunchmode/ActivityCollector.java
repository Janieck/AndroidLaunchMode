package paxsz.com.androidlaunchmode;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/*
 *  创建者:   tangjian
 *  创建时间:  2017/12/5 17:47
 *  描述：    TODO
 */
public class ActivityCollector {
    public static List<Activity> sActivities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        sActivities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        sActivities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : sActivities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
