package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        ListVatPham listVatPham = new ListVatPham();
        while(true){
            System.out.println("Menu");
            System.out.println("1.Nhập 5 vật phẩm");
            System.out.println("2.Thông tin và sức mạnh");
            System.out.println("3.Vật phẩm nhiều vàng nhất");
            System.out.println("4.Nhập số xu vàng");
            System.out.println("5.Thoát");
            int choice = sc.nextInt();
            if(choice == 1){
                listVatPham.cau1();
            }else if(choice == 2){
                listVatPham.cau2();
            }else if(choice == 3){
                listVatPham.cau3();
            }else if(choice == 4) {
                listVatPham.cau4();
            }else{
                break;
            }
        }


    }
}