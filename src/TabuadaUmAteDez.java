
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class TabuadaUmAteDez {
    public static void main(String[] args){
        int x;
        System.out.println("DIGITE UM NÚMERO [DE 1 A 10]: "); 
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("TABUADA DE "+x);
        for(int i=1; i<11; ++i){
            System.out.println(x*i);
        }
    }
}
