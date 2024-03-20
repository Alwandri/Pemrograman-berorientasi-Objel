import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("Pilih Bangun Ruang:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        
        double volume = 0.0;
        switch (choice) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus: ");
                double side = scanner.nextDouble();
                volume = calculateCubeVolume(side);
                System.out.println("Volume Kubus: " + volume);
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double length = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double width = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double height = scanner.nextDouble();
                volume = calculateRectangularVolume(length, width, height);
                System.out.println("Volume Balok: " + volume);
                break;
            case 3:
                System.out.print("Masukkan jari-jari tabung: ");
                double radius = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double heightCylinder = scanner.nextDouble();
                volume = calculateCylinderVolume(radius, heightCylinder);
                System.out.println("Volume Tabung: " + volume);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
    }
    
    public static double calculateCubeVolume(double side) {
        return Math.pow(side, 3);
    }
    
    public static double calculateRectangularVolume(double length, double width, double height) {
        return length * width * height;
    }
    
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung_bidang;

/**
 *
 * @author User
 */
public class main {
    
}
