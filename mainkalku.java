package pertemuan2;

import java.util.Scanner;

public class mainkalku{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka1,angka2,total,pil;
            
        System.out.println("===Kalkulator Sedehana===");
        System.out.println("===1.Penjumlahan===");
        System.out.println("===2.Pengurangan===");
        System.out.println("===3.Pembagian===");
        System.out.println("===4.Perkalian===");
        System.out.println("===5.Modulus===");
        System.out.print("===Masukkan Pilihan Anda = ");
        pil = input.nextInt();
        System.out.print("Masukkan Angka 1 = ");
        angka1 = input.nextInt();
        System.out.print("Masukkan Angka 2 = ");
        angka2 = input.nextInt();

        kalku kalkulator = new kalku();

        if (pil == 1){
            System.out.println(+ angka1 + " + "+ angka2);
            total = kalkulator.Penjumlahan(angka1, angka2);
            System.out.print("Hasilnya = "+total);
        }
        else if (pil == 2){
            System.out.println(+ angka1 + " - "+ angka2);
            total = kalkulator.Pengurangan(angka1, angka2);
            System.out.print("Hasilnya = "+total);
        }
        else if (pil == 3){
            System.out.println(+ angka1 + " / "+ angka2);
            total = kalkulator.Pembagian(angka1, angka2);
            System.out.print("Hasilnya = "+total);
        }
        else if (pil == 4){
            System.out.println(+ angka1 + " * "+ angka2);
            total = kalkulator.Perkalian(angka1, angka2);
            System.out.print("Hasilnya = "+total);
        }
        else if (pil == 5){
            System.out.println(+ angka1 + " % "+ angka2);
            total = kalkulator.Modulus(angka1, angka2);
            System.out.print("Hasilnya = "+total);
        }
        else{
            System.out.println("Masukan pilihan yang benar");
        }
        

        
    }
        
    }
