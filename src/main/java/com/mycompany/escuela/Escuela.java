package com.mycompany.escuela;
import java.sql.Connection;
import java.util.List;
public class Escuela {

    public static void main(String[] args) {
        openScreen();
    }
    
    private static void openScreen () {
        Screen screen = new Screen();
        screen.show();
    }
}
