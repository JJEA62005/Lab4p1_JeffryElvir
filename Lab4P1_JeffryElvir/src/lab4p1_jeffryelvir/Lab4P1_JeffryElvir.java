/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_jeffryelvir;
import java.util.Scanner;
/**
 *
 * @author jjea6
 */
public class Lab4P1_JeffryElvir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leeri=new Scanner(System.in);
        Scanner leers=new Scanner(System.in);
         boolean seguir=true;
         while (seguir){
             System.out.println("Menu");
             System.out.println("1.Ejercicio");
             System.out.println("2.Ejercicio");
             System.out.println("3.Salir");
             int opcion=leeri.nextInt();
             switch (opcion){
                 case 1:
                     String union,secuenciaA,secuenciaB;
                     System.out.println("Ingrese la secuencia A: ");
                     secuenciaA=leers.next().toLowerCase();
                     System.out.println("Ingrse la secuencia B:");
                     secuenciaB=leers.next().toLowerCase();
                     if(secuenciaA.equals(secuenciaB)){
                         System.out.println("La secuencia es igual");
                     }else{
                     
                     
                     }
                     
                     break;
                 case 2:
                     int contador=1;
                     boolean longitud=false;
                     boolean letras=false;
                     boolean numeros=false;
                     String password;
                     String acum = "";
                     System.out.println("Ingrese su contraseña");
                     password=leers.next().toLowerCase();
                     System.out.println("Ingrse un numero");
                     int n=leeri.nextInt();
                     if(password.length()>=8){
                     longitud=true;
                     }
                     else{System.out.println("Su contraseña tiene menos de 8 caracteres");}
                      
                    for (int i = 0; i < password.length(); i++) {
                        int codigol = password.charAt(i);
                        acum += codigol;
                        if (codigol>64 && codigol<123 ){
                        letras=true;
                                break;
                        }
                    } 
                    for (int i = 0; i < password.length(); i++) {
                        int codigol = password.charAt(i);
                        acum += codigol;
                        if (codigol>47 && codigol<58 ){
                        numeros=true;
                                break;
                        }
                    } 
                    if (numeros==false){
                        System.out.println("su contraseña debe de tener al menos un numero");
                    }
                    if (letras==false){
                        System.out.println("su contraseña debe de tener al menos una letra");
                    }
             
                    if(letras==true && numeros==true && longitud==true){
                        System.out.println("La contraseña  es segura");
                        for (int i = 0; i < password.length(); i++) {
                            char letra = password.charAt(i);
                            System.out.print(letra);
                            if(i==contador){
                            System.out.print(n);
                            n++;
                            contador=contador+2;
                            }
                        }
                    }
                     if(letras==false || numeros==false || longitud==false){
                        System.out.println("La contraseña no es segura");
                        
                    }
                     System.out.println("");

                     break;
                 case 3:
                     seguir=false;
                     break;
                 default:
                     System.out.println("numero incorrecto");
                     break;
             }
         
         }



// TODO code application logic here
    }
    
}
