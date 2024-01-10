package logikaioop;

import java.util.Scanner;

public class Feladat {

    private String leiras;
    private int melyik;
    private Lada[] ladak;

    public Feladat(String leiras) {
        ladak = new Lada[3];
        ladak[0] = new Lada("Én rejtem a kincset!", "Arany", false);
        ladak[1] = new Lada("Nem én rejtem a kincset!", "Ezüst", true);
        ladak[2] = new Lada("Az arany hazudik!", "Bronz", false);
        System.out.println(leiras);
        ladakMegj(ladak[0], ladak[1], ladak[2]);
        this.melyik = melyikAz();
        System.out.println("Az válsztott ládába van kincs:" + isHelyes(ladak[this.melyik - 1].isKincs()));

    }

    public int melyikAz() {
        System.out.println("Melyik: ");
        Scanner src = new Scanner(System.in);
        melyik = src.nextInt();
        return melyik;
    }

    public void eredmenyKonzolra() {
        System.out.println("A válasz ");
    }

    private void ladakMegj(Lada lada1, Lada lada2, Lada lada3) {
        System.out.println(lada1.getAllitas() + "\n" + lada2.getAllitas() + "\n" + lada3.getAllitas());
    }

    private boolean isHelyes(boolean kincs) {
        return kincs == true;
    }
}
