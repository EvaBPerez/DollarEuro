/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolareur;

import java.util.Scanner;

/**
 *
 * @author Eva
 */
public class DollarEuro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor en dólares que "
                + "quiera pasar a euro: ");
        String dolar = scanner.nextLine();
        double euro = 0.0;
        euro = dollarEuro(dolar);        
        
        System.out.println("Este es el valor que tiene en euros: " 
        + euro + " €");
          
    }

    private static double dollarEuro(String dolar) {

        double dol = Double.parseDouble(dolar);
        double euro = dol * 0.857290;
        return euro;
    }    
}
