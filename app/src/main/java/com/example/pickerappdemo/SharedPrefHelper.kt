package com.example.pickerappdemo

import android.content.Context
import android.content.SharedPreferences

object SharedPrefHelper {
    private fun getPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(context.getString(R.string.prefs), MODE)
    }

    private fun getEditor(context: Context): SharedPreferences.Editor {
        return getPreferences(context).edit()
    }

    fun writeInteger(context: Context, key: String?, value: Int) {
        getEditor(context).putInt(key, value).commit()
    }

    fun readFloat(context: Context, key: String?): Float {
        return getPreferences(context).getFloat(key, 0f)
    }

    fun writeFloat(context: Context, key: String?, value: Float) {
        getEditor(context).putFloat(key, value).commit()
    }

    fun readInteger(context: Context, key: String?): Int {
        return getPreferences(context).getInt(key, 0)
    }

    fun writeString(context: Context, key: String?, value: String?) {
        getEditor(context).putString(key, value).commit()
    }

    fun readString(context: Context, key: String?): String? {
        return getPreferences(context).getString(key, null)
    }

    fun clearAll(context: Context): Boolean {
        return getEditor(context).clear().commit()
    }

    fun remove(context: Context, key: String?) {
        getEditor(context).remove(key).commit()
    }

    fun writeBoolean(context: Context, key: String?, value: Boolean) {
        getPreferences(context).edit().putBoolean(key, value).apply()
    }

    fun readBoolean(context: Context, key: String?): Boolean {
        return getPreferences(context).getBoolean(key, false)
    }

    fun setEmailRemember(context: Context, email: String?, key: String?) {
        val sharedPreferences =
            context.getSharedPreferences(context.getString(R.string.prefs_email), MODE)
        sharedPreferences.edit().putString(key, email).apply()
    }

    fun getEmailRemember(context: Context, key: String?): String? {
        val sharedPreferences =
            context.getSharedPreferences(context.getString(R.string.prefs_email), MODE)
        return sharedPreferences.getString(key, null)
    }

    fun setDefaultLanguage(context: Context, email: String?, key: String?) {
        val sharedPreferences =
            context.getSharedPreferences(context.getString(R.string.prefs_email), MODE)
        sharedPreferences.edit().putString(key, email).apply()
    }

    fun getDefaultLanguage(context: Context, key: String?): String? {
        val sharedPreferences =
            context.getSharedPreferences(context.getString(R.string.prefs_email), MODE)
        return sharedPreferences.getString(key, "en")
    }

    private const val MODE = Context.MODE_PRIVATE
}
