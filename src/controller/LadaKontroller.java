package controller;

import logikaioop.Lada;
import view.ConsoleView;

public class LadaKontroller {
    //Adattagok létrehozása model(logikaioop) és view(ConsoleView)
    private Lada model;
    private ConsoleView consoleView;

    public LadaKontroller() {
        this.model = new Lada();
        //"Minden láda 1-1 állítást tartalmaz, csak az egyik az igaz." ez megy a consoleview-ba
        String leiras = "Minden láda 1-1 állítást tartalmaz, csak az egyik az igaz.";
        this.consoleView = new ConsoleView();
    }
    
}
