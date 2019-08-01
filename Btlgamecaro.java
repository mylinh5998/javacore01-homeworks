/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btlgamecaro;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Btlgamecaro {

    /**
     * @param args the command line arguments //nhap vi tri kiem tra vi tri im
     * ra bang kiem tra thang
     *
     */
    static int count = 0;
    static int player = 1;
    static int[][] board ;
    static int x, y;

    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
        //inputboard();
        input();
        
        while(check()==false){
            System.out.println("nhap lai");}
                    check();
        
        put(player);
        count++;
        printboard();
        if(checkWin(player))
            break;
        if(++count>n*n )
                System.out.println("hoa! danh tiep");
        break;
        }
        player=3-player;
    }

    private static void input() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        System.out.println("Nhap vi tri");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Bang danh");

    }

    private static boolean check() {

        if (x < 0 || x > n) {
            return false;
        }
        if (y < 0 || y > n) {
            return false;
        }
        if (board[x][y] == 0) {
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    static int n;

  /*  private static void inputboard() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc bang");
        n = sc.nextInt();
    }*/

    private static void put(int player) {
        //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        board[x][y] = player;
    }

    private static void printboard() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            
            System.out.println();
        }
    }

    private static boolean checkWin(int player) {
        //doc
        for (int i = 0; i < n; i++) {
            if (board[x][i] == board[x][i + 1] && board[x][i+1] == board[x][i + 2] && board[x][i+2] == board[x][i + 3]
                    && board[x][i+3] == board[x][i + 4]  && board[x][i] !=0&& board[x][i] == player) {
                System.out.println("Player " + player + " win!");
                return true;

            }
        }
        //ngang 
        for (int i = 0; i < n; i++) {
            if (board[i][y] == board[i + 1][y] && board[i+1][y] == board[i + 2][y] && board[i+2][y] == board[i + 3][y]
                    && board[i+3][y] == board[i + 4][y] && board[i][y] == player && board[i][y] != 0) {
                System.out.println("Player " + player + " win!");
                return true;

            }
        }
        //cheo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[j][i] == board[j + 1][i - 1] && board[j+1][i-1] == board[j + 2][i - 2] && board[j+2][i-2] == board[j + 3][i - 3] 
                        && board[j+3][i-3]== board[j + 4][i - 4]  && board[i][j] == player && board[i][j] != 0) {
                    System.out.println("Player " + player + " win!");
                    return true;
                }
            }
        }
        return false;

    }

}
