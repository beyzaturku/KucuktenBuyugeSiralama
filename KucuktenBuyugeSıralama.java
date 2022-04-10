package kücüktenbüyügesıralama;
import java.util.*;
public class KücüktenBüyügeSıralama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz:");
        int sayı1 = input.nextInt();
        System.out.print("2.sayıyı giriniz:");
        int sayı2 = input.nextInt();
        System.out.print("3.sayıyı giriniz:");
        int sayı3 = input.nextInt();
        
        if(sayı1<sayı2 && sayı1<sayı3) {
            if(sayı2<sayı3){
                System.out.println(sayı1 + "<" + sayı2 + "<" + sayı3);
            }
            else if(sayı3<sayı2){
                System.out.println(sayı1 + "<" + sayı2 + "" + sayı3);
            }
        }
        else if(sayı2<sayı1 && sayı2<sayı3) {
            if(sayı1<sayı3){
                System.out.println(sayı2 + "< " + sayı1 + " <" + sayı3);
            }
            else if(sayı3<sayı1){
                System.out.println(sayı2 + "< " + sayı3 + " <" + sayı1);
            }
        }
        else if(sayı3<sayı1 && sayı3<sayı2){
            if(sayı1<sayı2){
                System.out.println(sayı3 + "<" + sayı1 + "<" + sayı2);
            }
            else if(sayı2<sayı1){
                System.out.println(sayı3 + "<"+ sayı2 + "<" + sayı1);
            }
        }
            
        
        
       
            
                
    }
    
}
