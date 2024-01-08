package logikaioop;

import java.util.Scanner;

public class Bekeres {

    private Scanner src;

    public Bekeres() {
        this.src = new Scanner(System.in);
    }

   public String kiir(){
       System.out.print("Melyik: ");
       return src.next();
   }
}
