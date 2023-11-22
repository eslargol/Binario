/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarydecimal;
import java.util.Scanner;

public class BinaryDecimal {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n=0;   
	int i=0;
        do {
        System.out.print("Introduzca un número que sea mayor que 0");                                                           
            n = sc.nextInt();
        } while (n <= 0);

        System.out.print("\nBinario: ");
        decBin(n);
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
        }
    }  
    }
    

