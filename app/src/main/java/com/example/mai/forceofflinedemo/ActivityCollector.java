package com.example.mai.forceofflinedemo;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mai on 2016/12/29.
 */

public class ActivityCollector {
    public static List<Activity> ActivityList = new ArrayList<>();

    public static void addActivity(Activity activity) {
        ActivityList.add(activity);

    }

    public static void removeActivity(Activity activity) {
        ActivityList.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : ActivityList) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
