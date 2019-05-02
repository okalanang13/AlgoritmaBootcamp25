/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmatask1;

/**
 *
 * @author Rahmad
 */
public class Display {

    public static void main(String[] args) {
        Functions functions = new Functions();

        System.out.println(functions.getRandom(10, true, true));
        System.out.println(functions.getRandom(10, true, false));
        System.out.println(functions.getRandom(10, false, true));
        System.out.println(functions.getRandom(10, false, false));
        System.out.println(functions.getRandom(11, true, true));

        System.out.println("================================");

        System.out.println("Jumlah uang yang ditampilkan: " + functions.money(1560050));

        System.out.println("=====================================");
        System.out.println(functions.acakChar(25, false, true));
        System.out.println(functions.acakChar(20, true, false));
    }
}
