import java.util.Scanner;

import entidades.triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
            triangulo x,y;
            x = new triangulo();
            y = new triangulo();
            
            System.out.println("Entre com os valores do triangulo X: ");
            x.a=sc.nextDouble();
            x.b=sc.nextDouble();
            x.c=sc.nextDouble();

            System.out.println("Entre com os valores do triangulo X: ");
            y.a=sc.nextDouble();
            y.b=sc.nextDouble();
            y.c=sc.nextDouble();
            
            double areaX = x.area();
            double areaY = y.area();

            System.out.println("A area do triangulo X é: "+ areaX);
            System.out.println("A area do triangulo Y é: "+areaY);

            if(areaX >= areaY){
                System.out.println("Área X é maior!");
            }else if(areaY >= areaX){
                System.out.println("Área Y é maior!");
            }else{
                System.out.println("Áreas iguais!");
            }

        }
    }
