package com.sena;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hamburguesa h = new Hamburguesa();
        String opQueso;
        System.out.print("Pan (Brioche o Ajonjoli): ");
        h.setPan(sc.nextLine());

        System.out.print("Carne 1: ");
        h.setCarne1(sc.nextLine());

        System.out.print("Desea segunda carne? (si/no): ");
        h.setCarne2(sc.nextLine());


       while (true) {
        System.out.print("Desea queso? (si/no): ");
        opQueso = sc.nextLine();
       if ((opQueso.equalsIgnoreCase("si")) || (opQueso.equalsIgnoreCase("no")))
        break;
        System.out.println("solo se puede escribir 'si' o 'no'");
       }
       h.setQueso(opQueso);
        System.out.print("Desea tomate? (si/no): ");
        h.setTomate(sc.nextLine());

        System.out.print("Desea lechuga? (si/no): ");
        h.setLechuga(sc.nextLine());

        System.out.print("Salsa: ");
        h.setSalsa(sc.nextLine());

        System.out.println("\nHAMBURGUESA CREADA:");
        System.out.println("Pan: " + h.getPan());
        System.out.println("Carne 1: " + h.getCarne1());
        System.out.println("Carne 2: " + h.getCarne2());
        System.out.println("Queso: " + h.getQueso());
        System.out.println("Tomate: " + h.getTomate());
        System.out.println("Lechuga: " + h.getLechuga());
        System.out.println("Salsa: " + h.getSalsa());

        sc.close();
    }
}