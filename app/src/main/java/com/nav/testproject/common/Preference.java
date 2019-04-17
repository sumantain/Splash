package com.nav.testproject.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preference {

    private Context context = null;
    public final String prefName = "Preference_data";

    public Preference(Context context) {
        this.context = context;
    }

    public String getString(String key, String def) {
        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        String s = prefs.getString(key, def);
        return s;
    }

    public void setString(String key, String val) {
        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor e = prefs.edit();
        e.putString(key, val);
        e.commit();
    }

    public void setBoolean(String key, boolean val){
        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor e = prefs.edit();
        e.putBoolean(key, val);
        e.commit();
    }

    public boolean getBoolean(String key){
        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        boolean s = prefs.getBoolean(key, false);
        return s;
    }

    public void clearData(){
        SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor e = prefs.edit();
        e.clear();
        e.commit();
    }

    /*--ProviderState--*/
    public void setProviderState(String ProviderState) {
        setString("ProviderState", ProviderState);
    }

    public String getProviderState() {
        return getString("ProviderState", "");
    }


    /*--DeviceId--*/
    public void setDeviceId(String DeviceId) {
        setString("DeviceId", DeviceId);
    }

    public String getDeviceId() {
        return getString("DeviceId", "");
    }


    /*--Latitude--*/
    public void setLatitude(Double Latitude) {
        setString("Latitude", String.valueOf(Latitude));
    }

    public Double getLatitude() {
//        return Double.parseDouble(getString("Latitude", "0.0"));
        String latitude = getString("Latitude", null);
        if (latitude != null) {
            return Double.parseDouble(latitude);
        }else{
            return null;
        }
    }

    /*--Longitude--*/
    public void setLongitude(Double Longitude) {
        setString("Longitude", String.valueOf(Longitude));
    }

    public Double getLongitude() {
        String longitude = getString("Longitude", null);
        if (longitude != null) {
            return Double.parseDouble(longitude);
        }else{
            return null;
        }
    }

    /*--CustId--*/
    public void setUserId(String UserId) {
        setString("UserId", UserId);
    }

    public String getUserId() {
        return getString("UserId", null);
    }

    /*--SessionToken--*/
    public void setSessionToken(String SessionToken) {
        setString("SessionToken", SessionToken);
    }

    public String getSessionToken() {
        return getString("SessionToken", null);
    }

    /*--Email--*/
    public void setEmail(String Email) {
        setString("Email", Email);
    }

    public String getEmail() {
        return getString("Email", "");
    }


    /*--Name--*/
    public void setName(String Name) {
        setString("Name", Name);
    }

    public String getName() {
        return getString("Name", "");
    }
}
