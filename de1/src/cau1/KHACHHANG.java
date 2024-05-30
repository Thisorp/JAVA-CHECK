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
public class KHACHHANG extends NAMGIOI{
    private String makh;
    private int soluong;

    public KHACHHANG(String makh, int soluong, String hoten, int tuoi, String cccd) {
        super(hoten, tuoi, cccd);
        this.makh = makh;
        this.soluong = soluong;
    }
    
    public String getmakh()
    {
        return makh;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public String phanloai(KHACHHANG a)
    {
        if(a.getTuoi()>60)
        {
            return "cao tuoi";
        }
        else if (a.getTuoi()>35)
        {
            return "trung nien";
        }
        else return "tre";
    }

    /**
     *
     */
    @Override
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma khach hang: "); this.makh = sc.nextLine();
        System.out.print("nhap so lan mua: "); this.soluong = sc.nextInt();
    }
   public void xuat() {
        super.xuat();
        System.out.printf("Mã khách hàng: %s | Số lần mua: %d | Loại khách hàng: %s%n", 
                          this.makh, this.soluong, this.phanloai(this));
    }
    
}
