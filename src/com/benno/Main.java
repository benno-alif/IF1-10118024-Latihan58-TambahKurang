package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung Tambah dan Kurang
     */


public class Main {

    public static void main(String[] args) {
        Bilangan tambah,kurang;
        tambah = new JumlahBilangan();
        kurang = new SelisihBilangan();

        ((JumlahBilangan)tambah).tampilHasilJumlah();
        ((SelisihBilangan)kurang).tampilSelisih();
    }
}
