/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_den_1000e_asal_sayı_bulma;

/**
 *
 * @author Enes
 */
public class Main {
    public static void main(String[] args) {
        
        for (int i = 2 ; i < 1000 ; i++) {
            
            if (asalMi(i)){
                System.out.println(i);
                
            }
        }
    }
    public static boolean asalMi(int sayi) {
        
        for (int i = 2 ; i < sayi;i++) {
            
            if (sayi % i == 0){
                return false;
                
            }
        }
        return true; 
    }
}

