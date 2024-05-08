/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAWABAN1;

/**
 *
 * @author HP
 */

    import java.util.Scanner;

class Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    // Constructor to initialize the object's attributes
    public Pajak(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Getter methods to access encapsulated attributes
    public String getVendor() {
        return vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }

    // Setter methods to modify encapsulated attributes (if needed)
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method to calculate PPN based on the encapsulated harga
    public double calculatePPN() {
        double ppnRate;
        if (harga <= 4000000) {
            ppnRate = 0.01;
        } else if (harga <= 4500000) {
            ppnRate = 0.02;
        } else {
            ppnRate = 0.05;
        }
        return harga * ppnRate;
    }

    // Method to calculate the total price including PPN
    public double calculateTotalHarga() {
        return harga + calculatePPN();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Tipe Smartphone: ");
        String tipe = scanner.nextLine();

        System.out.print("Harga Smartphone: ");
        double harga = scanner.nextDouble();

        Pajak pajak = new Pajak(vendor, tipe, harga); // Encapsulating data

        double ppn = pajak.calculatePPN();
        double hargaTotal = pajak.calculateTotalHarga();

        System.out.println("=============================================");
        System.out.println("Rincian Harga Smartphone:");
        System.out.println("Vendor: " + pajak.getVendor()); // Accessing encapsulated data
        System.out.println("Tipe: " + pajak.getTipe());
        System.out.println("Harga Dasar: Rp" + pajak.getHarga());
        System.out.println("PPN: Rp" + ppn);
        System.out.println("Harga Total: Rp" + hargaTotal);
        System.out.println("=============================================");
    }
}

