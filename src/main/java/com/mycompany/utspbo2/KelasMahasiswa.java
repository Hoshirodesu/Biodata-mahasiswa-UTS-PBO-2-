/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo2;

/**
 *
 * @author R4FFI
 */
import java.util.ArrayList;
import java.util.List;

public class KelasMahasiswa {
    private String namaKelas;
    private List<Mahasiswa> listMahasiswa;

    public KelasMahasiswa(String namaKelas) {
        this.namaKelas = namaKelas;
        this.listMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        listMahasiswa.add(m);
    }

    public void tampilkanSemuaBiodata() {
        System.out.println("=== Biodata Mahasiswa Kelas " + namaKelas + " ===");
        for (Mahasiswa m : listMahasiswa) {
            m.tampilkanBiodata();
        }
    }
}
