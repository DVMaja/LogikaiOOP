package controller;

import java.util.Scanner;
import logikaioop.Lada;
import view.ConsoleView;

public class LadaKontroller {
    //Adattagok létrehozása model(logikaioop) és view(ConsoleView)
    private Lada model;
    private ConsoleView consoleView;
    private Lada[] ladak;
     private int melyik;
     ConsoleView view = new ConsoleView();

    public LadaKontroller() {
        this.model = new Lada();
        //"Minden láda 1-1 állítást tartalmaz, csak az egyik az igaz." ez megy a consoleview-ba
        String leiras = "Minden láda 1-1 állítást tartalmaz, csak az egyik az igaz.";
        this.consoleView = new ConsoleView();
        consoleView.kiir(leiras);
        
        ladak = new Lada[3];
        ladak[0] = new Lada("Én rejtem a kincset!", "Arany", false);
        ladak[1] = new Lada("Nem én rejtem a kincset!", "Ezüst", true);
        ladak[2] = new Lada("Az arany hazudik!", "Bronz", false);
        
        consoleView.ladakMegj(ladak);
        
        view.ladakMegj(ladak);
        this.melyik = melyikAz();
        view.kiir("Az válsztott ládába van kincs:", isHelyes(ladak[this.melyik - 1].isKincs()));
    }
    
    public int melyikAz() {
        view.kiir("Melyik ládába van a kincs?");
        Scanner src = new Scanner(System.in);
        melyik = src.nextInt();
        return melyik;
    }

    private boolean isHelyes(boolean kincs) {
        return kincs == true;
    }
}
