/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1107;

import java.util.Scanner;

/**
 *
 * @author Linh
 * btvn nhập vào danh sách họ tên người
 * nhập tên ng cần tìm kiếm
 * in ra họ tên đây đủ của ng đó 
 * đếm số lần xuất hiện của kí tự a trong danh sách
 * 
 * kiểm tra chuỗi nhập vào có tnhs đảo ngược hay k 
 * in ra kí tự đầu tiên không bị trùng 
 */
public class Homework1107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("nhập vào số người ");
        Scanner sc = new Scanner(System.in);
        int songuoi;
        songuoi = sc.nextInt();
        String arrayTen[];
        
        arrayTen = new String[songuoi];
        System.out.println("Tên mọi người là");
        for (int i=0; i<arrayTen.length; i++){
        
        arrayTen[i]= sc.next();
        
        }
        
        //Tìm kiếm 
        System.out.println("Tên cần tìm là");
                
        String key;
        key =sc.next();
        for(int i=0; i<arrayTen.length;i++){
        if(arrayTen[i].equals(key)){
        System.out.println(arrayTen[i]);}
        else{
        System.out.println("không tìm thấy");}
        }
        char []Arr= arrayTen.toCharArray();
        char kitu= 'a';// sc.nextInt()
        int dem=0;
        //in ra số lần xuất hiện chữ a
        //vi tri ''tên mảng.indexof('kí tụ cần tìm')
        for (int i = 0; i   < Arr.length; i++) {
            if (Arr.charArt[i] == kitu) {
                
                dem++;
                System.out.println("tìm thấy" + dem + "chữ a");
            }
        }

      
        }
    }
    

