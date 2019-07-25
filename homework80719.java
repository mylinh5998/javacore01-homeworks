/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework8;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class homework80719 {

    public static void main(String[] args) {

        int[] ArrayInt;
        Scanner scanner = new Scanner(System.in);
        int len;
        len = scanner.nextInt();
        System.out.println("độ dài mảng và các phần tử trong mảng là" + len);
        ArrayInt = new int[len];

        for (int i = 0; i < ArrayInt.length; i++) {
            ArrayInt[i] = scanner.nextInt();
        }

        int du = 0;
        int dem = 0;

        for (int i = 0; i < ArrayInt.length; i++) {
            du = ArrayInt[i] / 2;
        }
        {
            if (du == 0) {
                System.out.println("số chẵn là" + ArrayInt[i]);
            }
            dem = Array[i] / 7;
            if (dem == 0) {
                System.out.println("Số chia hết cho 7 là" + ArrayInt[i]);
            }
        }

    }
