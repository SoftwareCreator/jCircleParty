package com.jcorn.jcircleparty.client.model;

import com.jcorn.jcircleparty.helper.Settings;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * jCircleParty
 * 
 * @author Markus Petritz
 * @author Julian Maierl
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class User {

    private String name;
    private String email;
    private String username;

    //Color --> Circle
    private Color color;

    private long highscore;
    private int playtime;

    public User(String name, String email, String username, Color color) throws Exception {
        Pattern patternName = Pattern.compile("\\s");
        Matcher matcherName = patternName.matcher(name);
        boolean nameHasSpace = matcherName.find();

        if (!nameHasSpace) {
            throw new Exception("The name must look like this: <First Name> <Last Name>. There must be an space between!");
        }

        Pattern patternEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcherEmail = patternEmail.matcher(email);
        boolean emailIsValid = matcherEmail.find();

        if (!emailIsValid) {
            throw new Exception("The email you intered is not valid.");
        }

//        Not good! Use Regex instead.
//        System.out.println(email.contains("."));
//        if (!email.contains("@") || !email.contains(".")) {
//            throw new Exception("The email is invalid");
//        }
        
        if (username.startsWith("@")) {
            throw new Exception("The username must not start with an @ sign");
        }

        this.name = name;
        this.email = email;
        this.username = username;
        this.color = color;
        this.highscore = 0;
        this.playtime = 0;
    }

    public static boolean login(String username, String password) {
        Settings.setIsLogin(true);
        return true;
    }

    public static User getUserFromServer(String username, String password) throws Exception {
        //Get User from Server
        return new User("Unknown Man", "test@mail.com", username, Color.yellow);
    }

    public User(String name, String email, String username, Color color, long highscore, int playtime) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.color = color;
        this.highscore = highscore;
        this.playtime = playtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getHighscore() {
        return highscore;
    }

    public void setHighscore(long highscore) {
        this.highscore = highscore;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }
}
