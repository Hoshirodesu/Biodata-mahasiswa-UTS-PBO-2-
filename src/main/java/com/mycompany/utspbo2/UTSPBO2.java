/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utspbo2;

import javax.swing.JLabel;

/**
 *
 * @author R4FFI
 */
// UTSPBO2.java
public class UTSPBO2 {
    public static void main(String[] args) {
        // Buat objek Mahasiswa
//        Mahasiswa m1 = new Mahasiswa("Andi", "12345", "Teknik Informatika", "FTI", 2022);
//        Mahasiswa m2 = new Mahasiswa("Budi", "67890", "Sistem Informasi", "FTI", 2023);
//        Mahasiswa m3 = new Mahasiswa("Citra", "11223", "Teknik Informatika", "FTI", 2021);

        // Buat objek KelasMahasiswa
        KelasMahasiswa kelas = new KelasMahasiswa("TIF RP 23 CID B");
//        kelas.tambahMahasiswa(m1);
//        kelas.tambahMahasiswa(m2);
//        kelas.tambahMahasiswa(m3);

        // Tampilkan semua biodata
        kelas.tampilkanSemuaBiodata();

        // Tampilkan GUI
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MahasiswaForm().setVisible(true);
        });
    }
}