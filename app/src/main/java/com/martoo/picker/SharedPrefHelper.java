package com.martoo.picker;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefHelper {

    private SharedPrefHelper() {
    }

    private static final int MODE = Context.MODE_PRIVATE;

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences("cache", MODE);
    }

    private static SharedPreferences.Editor getEditor(Context context) {
        return getPreferences(context).edit();
    }

    public static void writeInteger(Context context, String key, int value) {
        getEditor(context).putInt(key, value).commit();
    }

    public static float readFloat(Context context, String key) {
        return getPreferences(context).getFloat(key, 0);
    }


    public static void writeFloat(Context context, String key, float value) {
        getEditor(context).putFloat(key, value).commit();
    }

    public static int readInteger(Context context, String key) {
        return getPreferences(context).getInt(key, 0);
    }

    public static void writeString(Context context, String key, String value) {
        getEditor(context).putString(key, value).commit();
    }

    public static String readString(Context context, String key) {
        return getPreferences(context).getString(key, null);
    }

    public static void clearAll(Context context) {
        getEditor(context).clear().commit();
    }


    public static void remove(Context context, String key) {
        getEditor(context).remove(key).commit();
    }


    public static void writeBoolean(Context context, String key, boolean value) {
        getPreferences(context).edit().putBoolean(key, value).apply();
    }

    public static boolean readBoolean(Context context, String key) {
        return getPreferences(context).getBoolean(key, false);
    }

}