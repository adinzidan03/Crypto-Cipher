/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkripsi;

/**
 *
 * @author Lenovo
 */
public class Enkripsi {

    static int key = 7;
    
    public static void main(String[] args) {
        String msg = "Universitas Dian Nuswantoro";
        System.out.print("Plain Text\t: ");
        System.out.println(msg);
        
        String encryptedMsg = encrypt(msg);
        System.out.print("Cipher Text\t: ");
        System.out.println(encryptedMsg);
        
        String decryptedMsg = decrypt(encryptedMsg);
        System.out.print("Hasil decrypt\t: ");
        System.out.println(decryptedMsg);
    }
    
    static String encrypt(String message){
        String test = "";
        for(int i=0; i<message.length(); i++){
            test += (char)(message.charAt(i)+ key);
        }
        return test;
    }
    
    static String decrypt(String message){
        String test = "";
        for(int i=0; i<message.length(); i++){
            test += (char)(message.charAt(i)-key);
        }
        return test;
    }
    
}
