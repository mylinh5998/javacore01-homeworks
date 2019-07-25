/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktictoctoe;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Homeworktictoctoe {

    static Scanner sc = new Scanner(System.in);
    static int[][] board = new int[3][3];
    static int count = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // nhập vào các số 0 1 2 
        //gười chs 1 tương ứng 1 người 2 tương ứng 2
        //kế thúc khi có người thắng or hết nước đi 
        int x;
        int y;
        while (true) {
            while (true) {
                System.out.print("p1:");
                x = sc.nextInt();
                y = sc.nextInt();
                if (move(x, y, 1)) {
                    break;
                } else {
                    System.out.println("đánh lại");
                }
                ;}
                printBoard();
                checkWin(x, y, 1);
                count++;
                if (count == 9) {
                    System.out.println("đánh ván mới");
                    break;
                }

            
            while (true) {
                System.out.println("p2:");
                x = sc.nextInt();
                y = sc.nextInt();
                if (move(x, y, 2)) {
                    break;
                } else {
                    System.out.println("Đánh lại");
                }

            }
            printBoard();
            checkWin(x, y, 2);
            count++;
            if (count == 9) {
                System.out.println("Đánh ván mới");
                break;
            }

        }

    }

    private static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.println(board[i][j] + "");
            }
        }
        System.out.println();
    }

    private static void checkWin(int x, int y, int i) {
        //Ngang
        if (board[x][0] == board[x][1] && board[x][0] == board[x][2] && board[x][0] == i && board[x][0] != 0) {
            System.out.println("Người" + i + "thắng");
            System.exit(i);
        }
        //dọc
        if (board[0][y] == board[1][y] && board[0][y] == board[2][y] && board[0][y] == i && board[0][y] != 0) {
            System.out.println("Nguoi" + i + "thang");
            System.exit(i);
        }
        //cheos
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == i && board[0][0] != 0
                || board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] == i && board[2][0] != 0) {
            System.out.println("Nguoi " + i + " thang");
        }
    }

    private static boolean move(int x, int y, int p) {
        if (board[x][y] == 0) {
            board[x][y] = p;
            return true;
        }
        return false;
    
    }

}
