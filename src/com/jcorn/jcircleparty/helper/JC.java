package com.jcorn.jcircleparty.helper;

/**
 * jCircleParty
 *
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class JC {

    public static void debug(Exception ex) {
        if (Settings.isDebug) {
            System.err.println("Message: " + ex.getMessage());
            System.err.println("Exception: " + ex.toString());
            ex.printStackTrace();
        }
    }

    public static void debug(String text) {
        if (Settings.isDebug) {
            System.out.println(text);
        }
    }
}
