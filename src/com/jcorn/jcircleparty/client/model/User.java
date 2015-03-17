package com.jcorn.jcircleparty.client.model;

import com.jcorn.jcircleparty.helper.Settings;
import java.awt.Color;

/**
 * jCircleParty
 * 
 * @author Markus Petritz
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
    
    public static boolean login(String username, String password) {
        Settings.setIsLogin(true);
        return true;
    }
    
    public static User getUser(String username, String password) {
        //Get User from Server
        return new User("Unknown", "test@mail.com", username, Color.yellow);
    }

    public User(String name, String email, String username, Color color) {
        /*
        TODO:
        Plausiprüfung
        
        name --> <First name> <Last name> (Space is important!)
        email --> min. 1x "@", .com/.net/.at/usw 
        username --> no @ at beginning, usw...
        
        */
        this.name = name;
        this.email = email;
        this.username = username;
        this.color = color;
        this.highscore = 0;
        this.playtime = 0;
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
