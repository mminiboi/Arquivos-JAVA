import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor:");
        int x = meuObj.nextInt();
        System.out.println("Entre com o segundo valor:");
        int z = meuObj.nextInt();        
        if (x > z) {
            System.out.println("X é maior que z");
        } else {
            System.out.println("Z é maior que X");
        }
        meuObj.close();
    }
}