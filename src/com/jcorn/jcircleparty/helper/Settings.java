package com.jcorn.jcircleparty.helper;

/**
 * jCircleParty
 *
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class Settings {

    public final static boolean isDebug = true;
    public static boolean isLogin = false;
    
    private final static String title = "jCircleParty";
    private final static String version = "1.0.0";
    private final static String copyright = "Copyright (c) jCorn Development";

    public static String getTitle() {
        return title;
    }

    public static String getVersion() {
        return version;
    }

    public static String getCopyright() {
        return copyright;
    }

    public static boolean isLogin() {
        return isLogin;
    }

    public static void setIsLogin(boolean isLogin) {
        Settings.isLogin = isLogin;
    }
}
