package com.benno;

public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        System.out.println("Hasil Pengurangan " + getX() + " - " + getY() + " = " + (getX() - getY()));
    }
}
