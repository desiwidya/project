/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAWABAN2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class KategoriUmur {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println();
        if (age < 5) {
            System.out.printf("%s is a balita.\n", name);
        } else if (age >= 5 && age < 12) {
            System.out.printf("%s is an anak.\n", name);
        } else if (age >= 12 && age < 18) {
            System.out.printf("%s is a remaja.\n", name);
        } else if (age >= 18 && age < 40) {
            System.out.printf("%s is a dewasa.\n", name);
        } else if (age >= 40 && age < 60) {
            System.out.printf("%s is a paruhbaya.\n", name);
        } else {
            System.out.printf("%s is a lanjut usia.\n", name);
        }

        
        System.out.println();
        String[] names = {"Miroku", "Kafka Hibino", "Saitama"};
        int[] ages = {12, 39, 20};

        for (int i = 0; i < names.length; i++) {
            if (ages[i] < 5) {
                System.out.printf("%s is a balita.\n", names[i]);
            } else if (ages[i] >= 5 && ages[i] < 12) {
                System.out.printf("%s is an anak.\n", names[i]);
            } else if (ages[i] >= 12 && ages[i] < 18) {
                System.out.printf("%s is a remaja.\n", names[i]);
            }
        }
    }
}
