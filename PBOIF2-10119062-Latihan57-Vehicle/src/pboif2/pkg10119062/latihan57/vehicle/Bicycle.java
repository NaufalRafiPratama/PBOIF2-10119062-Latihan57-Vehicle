/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * vehicle
 */
public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle() {
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}
