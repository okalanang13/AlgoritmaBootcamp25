/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_28.pkg04;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Relion31
 */
public class Mainkan {
    public static void main(String[] args) {
        View view = new View();
        System.out.println("AutoIncrement : \n"+view.autoIncrementOut(3,10));
        System.out.println("AutoDecrement : \n"+view.autoDecrementOut(7, 19));
    }
}
