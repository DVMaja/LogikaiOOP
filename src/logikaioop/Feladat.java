package logikaioop;

public class Feladat {

    private String leiras;
    private int melyik;

    public Feladat(String leiras) {
        Lada lada1 = new Lada("Az 1. állítás!", "", true);
        Lada lada2 = new Lada("Az 2. állítás!", "", true);
        Lada lada3 = new Lada("Az 3. állítás!", "", true);
        ladakMegj(lada1, lada2, lada3);
        isHelyes(lada1.isKincs());
    }

    private void ladakMegj(Lada lada1, Lada lada2, Lada lada3) {

        System.out.println("Leírás\n" + lada1.getAllitas() + "\n" + lada2.getAllitas() + "\n" + lada3.getAllitas());
    }

    private boolean isHelyes(boolean kincs) {
        return kincs == true;
    }

}
