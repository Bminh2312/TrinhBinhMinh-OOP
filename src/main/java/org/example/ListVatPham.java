package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListVatPham {
    private List<VatPham> arr;

    public ListVatPham() {
        this.arr = new ArrayList<>();
    }

    public void cau1() {

        ChiecBuaThan chiecBuaThan = new ChiecBuaThan();
        this.arr.add(chiecBuaThan);

        BaoTaySamSet baoTaySamSet = new BaoTaySamSet();
        this.arr.add(baoTaySamSet);

        HonDaKicHNo honDaKicHNo = new HonDaKicHNo();
        this.arr.add(honDaKicHNo);

        CayRiuPhepThuat cayRiuPhepThuat = new CayRiuPhepThuat();
        this.arr.add(cayRiuPhepThuat);

        CayGayChienThan cayGayChienThan = new CayGayChienThan();
        this.arr.add(cayGayChienThan);


    }

    public void cau2() {
        for (VatPham v : this.arr) {
            System.out.println(v.toString());
            System.out.println("Sức công phá: " + v.SucCongPha());
        }
    }

    public void cau3() {
        int max = this.arr.stream().mapToInt(VatPham::getVang).max().orElse(0);
        this.arr.stream().filter(v -> v.getVang() == max).forEach(System.out::println);
    }

    public void cau4() {
        System.out.println("Số vàng thu được: ");
        Scanner sc = new Scanner(System.in);
        int vang = sc.nextInt();
        int sum = this.arr.stream().mapToInt(VatPham::getVang).sum();
        if (vang > sum) {
            System.out.println("Giải cứu thành công:");
        } else {
            System.out.println("Giải cứu không thành công:");
        }
    }

}
