/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectquis_3089;
import java.util.Scanner;
/**
 *
 * @author Tectonia
 */
public class ProjectQuis_3089 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa_3089 mahasiswa_3089_1 = new Mahasiswa_3089();
        Mahasiswa_3089 mahasiswa_3089_2 = new Mahasiswa_3089();
        Dosen_3089 dosen_3089_1 = new Dosen_3089();
        Dosen_3089 dosen_3089_2 = new Dosen_3089();
   
        System.out.println("NIK                     :");
        mahasiswa_3089_1.nik_3089 = input.next();
        System.out.println("Nama                    :");
        mahasiswa_3089_1.nama_3089 = input.next();
        System.out.println("Umur                    :");
        mahasiswa_3089_1.umur_3089 = input.nextInt();
        System.out.println("Alamat                  :");
        mahasiswa_3089_1.alamat_3089 = input.next();
        System.out.println("NIM                     : ");
        mahasiswa_3089_1.nim_3089 = input.next();
        System.out.println("IPK                     : ");
        mahasiswa_3089_1.ipk_3089 = input.nextInt();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        mahasiswa_3089_2.nik_3089 = input.next();
        System.out.println("Nama                : ");
        mahasiswa_3089_2.nama_3089 = input.next();
        System.out.println("Umur                : ");
        mahasiswa_3089_2.umur_3089= input.nextInt();
        System.out.println("Alamat              : ");
        mahasiswa_3089_2.alamat_3089 = input.next();
        System.out.println("NIM                 : ");
        mahasiswa_3089_2.nim_3089 = input.next();
        System.out.println("IPK                 : ");
        mahasiswa_3089_2.ipk_3089 = input.nextInt();
        

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA MAHASISWA");
        mahasiswa_3089_1.tampilDataBeasiswa3089();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        mahasiswa_3089_2.tampilDataMahasiswa_3089_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3089_1.nik_3089 = input.next();
        System.out.println("Nama                : ");
        dosen_3089_1.nama_3089 = input.next();
        System.out.println("Umur                : ");
        dosen_3089_1.umur_3089 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3089_1.alamat_3089 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3089_1.nidn_3089 = input.next();
        System.out.println("Golongan                 : ");
        dosen_3089_1.gol_3089 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3089_1.gajiPokok_3089);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3089_1.nik_3089 = input.next();
        System.out.println("Nama                : ");
        dosen_3089_1.nama_3089 = input.next();
        System.out.println("Umur                : ");
        dosen_3089_1.umur_3089 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3089_1.alamat_3089 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3089_1.nidn_3089 = input.next();
        System.out.println("Golongan              : ");
        dosen_3089_1.gol_3089 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3089_2.gajiPokok_3089);
        // dosen_3071_1.gajiPokok_3071 = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA DOSEN");
        dosen_3089_1.tampilDataDosen_3089_1();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        dosen_3089_2.tampilDataDosen_3089_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
