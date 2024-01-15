package logikaioop;

import java.util.Scanner;
import view.ConsoleView;

public class Feladat {

    private String leiras;
    private int melyik;
    private Lada[] ladak;
    ConsoleView view = new ConsoleView();

    public Feladat(String leiras) {
        view.kiir(leiras + "\n");
        ladak = new Lada[3];
        ladak[0] = new Lada("Én rejtem a kincset!", "Arany", false);
        ladak[1] = new Lada("Nem én rejtem a kincset!", "Ezüst", true);
        ladak[2] = new Lada("Az arany hazudik!", "Bronz", false);

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
