/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejiménezr.a09;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJiménezRA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solicitaMatrices();
    }
    public static int pedirDimensiones(String x, String y){
        int dim;
        Scanner kb=new Scanner(System.in);
        System.out.println("Introducir la dimensión "+x+" de la mátriz "+y);
        dim=kb.nextInt();
        return dim;
    }
    public static int solicitarDatos(int a, int b){
        int dato;
        Scanner kb=new Scanner(System.in);
        System.out.println("Introducir el dato en la posición "+a+", "+b);
        dato=kb.nextInt();
        return dato;
    }
    public static void solicitaMatrices(){
        int n1, m1, n2, m2;
        int suma1=0;
        int suma2=0;
        int sumaT=0;
        n1= pedirDimensiones("1","1");
        m1= pedirDimensiones("2","1");
        n2= pedirDimensiones("1","2");
        m2= pedirDimensiones("2","2");
        int [][] matriz1= new int[n1][m1];
        int [][] matriz2= new int[n2][m2];
        for(int i=0;i<2;i++){
            for(int j=0;j<m1;j++){
                System.out.println("Matriz 1");
                matriz1[i][j]=solicitarDatos(i,j);
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                System.out.println("Matriz 2");
                matriz2[i][j]= solicitarDatos(i,j);
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                suma1=suma1+matriz1[i][j];
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                suma2=suma2+matriz2[i][j];
            }
        }
        sumaT=suma1+suma2;
        System.out.println("La suma total es de "+sumaT);
    }
    
}
