package com.affanperpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    // Atribut
    String nama;
    String npm;
    String prodi;

    ArrayList<Buku> daftarPinjaman = new ArrayList<>();

    // Contructor
    public Mahasiswa(String nama, String npm, String prodi) {
        this.nama = nama;
        this.npm = npm;
        this.prodi = prodi;
    }

    // Method
    public void masukanData(){
        Scanner a = new Scanner(System. in );
        System.out.println("Silahkan isi data dibawah ini");
        System.out.print("Nama          : " );
        this.nama = a.nextLine();
        System.out.print("NPM           : " );
        this.npm = a.nextLine();
        System.out.print("Program Studi : " );
        this.prodi = a.nextLine();
    }

    public void pinjamBuku(ArrayList<Buku> daftarBuku) {
        Scanner a = new Scanner(System. in );

        System.out.println("-----Daftar Buku Perpustakaan Affan-----");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println((i+1)+"."+daftarBuku.get(i).judulBuku);
        }
        while (true) {
            System.out.println("........................................");
            System.out.print("Silahkan Pilih Nomor Buku : ");
            int pilihan = a.nextInt();
            a.nextLine();
            daftarPinjaman.add(daftarBuku.get(pilihan-1));
            System.out.print("Apakah ingin meminjam buku lagi (y/n): ");
            String lagi = a.nextLine();
            if (lagi.equals("n")){
                break;
            }
        }
    }

    public void mengembalikanBuku() {
        if (daftarPinjaman.size() == 0) {
            System.out.println("|  Tidak ada Buku yang dipinjam  |");
            System.out.println("----------------------------------");
        } else {
            daftarPinjaman.clear();
            System.out.println("|     Buku telah dikembalikan    |");
            System.out.println("----------------------------------");
        }
    }

    void tampilData() {
        System.out.println("--------------------------------------");
        System.out.println("|Status Peminjaman Perpustakaan Affan|");
        System.out.println("--------------------------------------");
        System.out.println("Nama Mahasiswa            : "+this.nama);
        System.out.println("NPM Mahasiswa             : "+this.npm);
        System.out.println("Program Studi             : "+this.prodi);
        System.out.println("Daftar Buku yang Dipinjam : ");
        if (daftarPinjaman.size() == 0){
            System.out.println("Tidak ada buku yang dipinjam");
        } else {
            for (int i = 0; i < daftarPinjaman.size(); i++) {
                System.out.println((i + 1) + "." + daftarPinjaman.get(i).judulBuku);
            }
        }
        System.out.println("--------------------------------------");
    }
}

