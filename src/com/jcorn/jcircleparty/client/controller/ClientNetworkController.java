package com.jcorn.jcircleparty.client.controller;

import com.jcorn.jcircleparty.client.model.Circle;
import com.jcorn.jcircleparty.client.model.User;
import com.jcorn.jcircleparty.helper.Settings;

/**
 * jCircleParty
 *
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.com
 */
public class ClientNetworkController implements Runnable {

    private static ClientNetworkController instance = new ClientNetworkController();
    private final String host;
    private final int port;
    
    private ClientNetworkController() {
        host = Settings.getHost();
        port = Settings.getPort();
    }

    public static ClientNetworkController getInstance() {
        return instance;
    }

    @Override
    public void run() {
        System.out.println("Methode: run");
    }
    
    public boolean login(String username, String password) {
        return true;
    }

    public User getUser(String username, String password) throws Exception {
        return new User("Yolo Man", "yolo@me.com", "yolo", new Circle());
    }
}
