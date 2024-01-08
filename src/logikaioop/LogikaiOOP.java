package logikaioop;

import java.util.Scanner;

public class LogikaiOOP {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Allitas allitas1 = new Allitas("Az 1. állítás!");
        Allitas allitas2 = new Allitas("Az 2. állítás!");
        Allitas allitas3 = new Allitas("Az 3. állítás!");
        //System.out.println("Leírás");
        //System.out.println();
        System.out.println(allitas1.toString());
        System.out.println(allitas2.toString());
        System.out.println(allitas3.toString());
        //System.out.println("Melyik:");
        //sc.nextInt();
        //System.out.println("A válasz jó|rossz");
    }

}
