/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metereolgia;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Metereologia metereologia = new Metereologia();
        int opcion;
        do {            
            System.out.println("=== Menú Metereología ===");
            System.out.println("1. Añadir medición");
            System.out.println("2. Obtener media de un día");
            System.out.println("3. Obtener máximo de un día");
            System.out.println("4. Obtener mínimo de un día");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el día");
                    int dia = sc.nextInt();
                    System.out.println("Introduce la temperatura");
                    double temperatura = sc.nextDouble();
                    metereologia.addMedicion(dia, temperatura);
                    System.out.println("Medición añadida correctamente");
                    break;
                case 2:
                    System.out.println("Introduce el día");
                    dia = sc.nextInt();
                    try {
                        double media = metereologia.getMedia(dia);
                        System.out.println("La media de temperatura del día " + dia + " es " + media);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Introduce el día");
                    dia = sc.nextInt();
                    try {
                        double maximo = metereologia.getMax(dia);
                        System.out.println("La temperatura máxima del día " + dia + " es " + maximo);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Introduce el día");
                    dia = sc.nextInt();
                    try {
                        double minimo = metereologia.getMin(dia);
                        System.out.println("La temperatura máxima del día " + dia + " es " + minimo);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 0);
        sc.close();
    }
}
