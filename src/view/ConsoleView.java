package view;

import logikaioop.Lada;

public class ConsoleView {

    public ConsoleView() {
    }

    public void kiir(String kimeno) {
        System.out.println(kimeno);
    }

    public void kiir(String kimeno, int szam) {
        System.out.println(kimeno + szam);
    }

    public void kiir(String kimeno, boolean bool) {
        System.out.println(kimeno + bool);
    }

    public void ladakMegj(Lada[] ladak) {
        for (int i = 0; i < ladak.length; i++) {
            System.out.println(ladak[i].getAllitas());
        }
    }
}
