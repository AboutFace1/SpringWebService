package app;

import app.controllers.Controller;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Controller::new);
    }
}
