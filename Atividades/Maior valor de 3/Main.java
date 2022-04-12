import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        System.out.println("Entre com o valor de A:");
        int valorA = meuObj.nextInt();
        System.out.println("Entre com o valor de B:");
        int valorB = meuObj.nextInt();
        System.out.println("Entre com o valor de C:");
        int valorC = meuObj.nextInt();
        
        if ((valorA>valorB) && (valorA>valorC)){
            System.out.println("O maior valor é A");
        }
        
        if ((valorB>valorA) && (valorB>valorC)){
            System.out.println("O maior valor é B");
        }

        if ((valorC>valorA) && (valorC>valorB)){
            System.out.println("O maior valor é C");
        }
       
        meuObj.close();
    }
}