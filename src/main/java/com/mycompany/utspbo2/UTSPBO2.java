/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utspbo2;

import javax.swing.JLabel;

/**
 *
 * @author R4FFI
 */
public class UTSPBO2 {
    public static void main(String[] args) {

        KelasMahasiswa kelas = new KelasMahasiswa("TIF RP 23 CID B");
        kelas.tampilkanSemuaBiodata();

        javax.swing.SwingUtilities.invokeLater(() -> {
            new MahasiswaForm().setVisible(true);
        });
    }
}