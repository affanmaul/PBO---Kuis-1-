package com.affanperpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa affan = new Mahasiswa("Affan", "2015061016", "Teknik Informatika");

        Buku buku1 = new Buku("Laskar Pelangi", "Andre Hirata", "515");
        Buku buku2 = new Buku("Kode Programmer", "Affan", "500");
        Buku buku3 = new Buku("C++", "Affan", "500");
        Buku buku4 = new Buku("Algoritma", "Affan", "500");
        Buku buku5 = new Buku("Agama Islam", "Affan", "500");
        Buku buku6 = new Buku("Kecerdasan Buatan", "Affan", "500");
        Buku buku7 = new Buku("Matematika", "Affan", "500");
        Buku buku8 = new Buku("Kalkulus", "Affan", "500");
        Buku buku9 = new Buku("Bahasa Inggris", "Affan", "500");
        Buku buku10 = new Buku("Pemrograman Berorientasi Objek", "Affan", "500");

        ArrayList<Buku> daftarBuku = new ArrayList<>();
        daftarBuku.add(buku1);
        daftarBuku.add(buku2);
        daftarBuku.add(buku3);
        daftarBuku.add(buku4);
        daftarBuku.add(buku5);
        daftarBuku.add(buku6);
        daftarBuku.add(buku7);
        daftarBuku.add(buku8);
        daftarBuku.add(buku9);
        daftarBuku.add(buku10);

        System.out.println("------------------------------------------");
        System.out.println("|  Tugas Pemrograman Berorientasi Objek  |");
        System.out.println("|  Nama : Affan Maulana                  |");
        System.out.println("|  NPM  : 2015061016                     |");
        System.out.println("------------------------------------------");
        System.out.println();
        affan.masukanData();

        while (true) {
            System.out.println();
            System.out.println("--------Menu Perpustakaan Affan-------");
            System.out.println("1. Meminjam Buku");
            System.out.println("2. Mengembalikan Buku");
            System.out.println("3. Tampilkan Status");
            System.out.println("4. Keluar");

            System.out.print("Silahkan masukkan pilihan : ");
            int pilihan = input.nextInt();
            System.out.println();
            if (pilihan == 1) {
                affan.pinjamBuku(daftarBuku);
            } else if (pilihan == 2) {
                affan.mengembalikanBuku();
            } else if (pilihan == 3) {
                affan.tampilData();
            }
            else if (pilihan == 4) {
                break;
            }
        }
    }
}

