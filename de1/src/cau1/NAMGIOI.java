/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cau1;
import java.util.Scanner;

/**
 *
 * @author ThisorQ
 */
public class NAMGIOI {
    private String hoten;
    private int tuoi;
    private String cccd;

    public NAMGIOI(String hoten, int tuoi, String cccd) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.cccd = cccd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: "); this.hoten = sc.nextLine();     
        System.out.print("nhap tuoi: "); this.tuoi = sc.nextInt();sc.nextLine();
        System.out.print("nhap cccd: "); this.cccd = sc.nextLine();
    }
   public void xuat() {
        System.out.println("\n-----------------------------");
        System.out.printf("Tên: %s | Tuổi: %d | CCCD: %s%n", this.hoten, this.tuoi, this.cccd);
    }
    
    
}
