/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectquis_3089;

/**
 *
 * @author Tectonia
 */
public class Dosen_3089 extends Penduduk_3089{
   String nidn_3089;
  String gol_3089;
  int gajiPokok_3089 = 5500000;
  double totalGaji;
  int tunjangan;
  
  public double totalPendapatan3089 () {
    if (gol_3089 == "IIIA") {
      tunjangan = 300000;
    }
    else if (gol_3089 == "IIIB") {
      tunjangan = 500000;
    }
    else if (gol_3089 == "IIIC") {
      tunjangan = 700000;
    }
    return totalGaji = gajiPokok_3089 + tunjangan;
  }
  
  public void tampilDataDosen_3089_1() {
    super.tampilDataPenduduk3089();
    System.out.println("NIK                   : " + nik_3089);
    System.out.println("Nama                  : " + nama_3089);
    System.out.println("Umur                  : " + umur_3089);
    System.out.println("Alamat                : " + alamat_3089);
    System.out.println("NIDN                  : " + nidn_3089);
    System.out.println("Golongan              : " + gol_3089);
    System.out.println("Gaji Pokok            : " + gajiPokok_3089);
  }
  
   public void tampilDataDosen_3089_2() {
    super.tampilDataPenduduk3089();
    System.out.println("NIK                   : " + nik_3089);
    System.out.println("Nama                  : " + nama_3089);
    System.out.println("Umur                  : " + umur_3089);
    System.out.println("Alamat                : " + alamat_3089);
    System.out.println("NIDN                  : " + nidn_3089);
    System.out.println("Golongan              : " + gol_3089);
    System.out.println("Gaji Pokok            : " + gajiPokok_3089);
  } 
}
