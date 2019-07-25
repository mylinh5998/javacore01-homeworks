/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1607;
//import static homework1607.main.Bai1;

import java.util.Scanner;


/**
 *
 * @author Linh
 */
//In ra tất cả các số nguyên tố nhỏ hơn 1000
//Nhập vào 2 số a,b kiểm tra xem ab có phải 2 số nguyên tố cùng nhau (nguyên tố cùng nhau là có ước chung lớn nhất là 1
//Tìm hiểu Merge sort
//Quick sort
//in ra các số nguyên tố nhỏ hơn 10000
/*Trong hàm main trước dấu; là dấu )*/
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Bài 1 : Các số nguyên tố nhỏ hơn 1000 là");
        //System.out.println(kiemtraNt(6));
        int soNT = kiemtraNt(1000);
        for (int i = 0; i < 1000; i++) {

            if (kiemtraNt(i) == 1) {
                System.out.println(i + ",");
            }
        }
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("nhập 2 số nguyên tố");
        
        a= sc.nextInt();
        b= sc.nextInt();
        
        if(kiemtraNtcn(a,b)==1){
        System.out.println("đó là 2 số nguyên tố cùng nhau");
        }
        else{
        System.out.println("không phải");}

    }

    static int kiemtraNt(int so) {
        int dem;
        dem = 0;

        for (int i = 1; i <= so; i++) {
            if (so % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {

            return 1;
        }

        return 0;

    }

    static int kiemtraNtcn(int a, int b) {
        int r;

        while (b != 0) {

            r = a % b;//số dư a:b=r 7:5=2
            a = b;//7=5
            b=r;//2=5
        }
        if (a == 1) {
            return 1;
        } else {
            return -1;
        }

    }
}
