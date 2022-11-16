/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectquis_3089;

/**
 *
 * @author Tectonia
 */
public class Mahasiswa_3089 extends Penduduk_3089 {
    String nim_3089;
  float ipk_3089;
  boolean beasiswa_3089;
  
  public void tampilDataMahasiswa_3089_1() {
    super.tampilDataPenduduk3089();
    System.out.println("NIK                 : " + nik_3089);
    System.out.println("Nama                : " + nama_3089);
    System.out.println("Umur                : " + umur_3089);
    System.out.println("Alamat              : " + alamat_3089);
    System.out.println("NIM                 : " + nim_3089);
    System.out.println("IPK                 : " + ipk_3089);
    tampilDataBeasiswa3089();   
  }
  public void tampilDataMahasiswa_3089_2 () {
    super.tampilDataPenduduk3089();
    System.out.println("NIK                 : " + nik_3089);
    System.out.println("Nama                : " + nama_3089);
    System.out.println("Umur                : " + umur_3089);
    System.out.println("Alamat              : " + alamat_3089);
    System.out.println("NIM                 : " + nim_3089);
    System.out.println("IPK                 : " + ipk_3089);
    tampilDataBeasiswa3089();
  }
  
  public void tampilDataBeasiswa3089 () {
    if (ipk_3089 > 3.5) {
      beasiswa_3089 = true;
      System.out.println("Mahasiswa bernama " + nama_3089 + " berhak mendapatkan beasiswa");
    }
    else if (ipk_3089 < 3.5) {
      beasiswa_3089 = false;
      System.out.println("Mahasiswa bernama " + nama_3089 + " tidak berhak mendapatkan beasiswa");
    }
  }
}
