package logikaioop;

import java.util.Scanner;

public class Feladat {
    private int melyik;

    public Feladat() {
        this.melyik = melyik;
        melyikAz();
    }
    
    public int melyikAz(){
        System.out.println("Melyik: ");
        Scanner src = new Scanner(System.in);
        melyik = src.nextInt();
        return melyik;
    }
    
    public void eredmenyKonzolra(){
        System.out.println("A válasz ");
    }
}
