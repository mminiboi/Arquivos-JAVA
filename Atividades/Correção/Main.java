import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        // área retângulo
        System.out.println("Programa lados de um retângulo");
        System.out.println("Entre com o valor do primeiro lado:");
        Double lado1 = meuObj.nextDouble();
        System.out.println("Entre com o valor do segundo lado:");
        Double lado2 = meuObj.nextDouble();
        Double areaRetangulo = lado1 * lado2;
        System.out.println("A área do retângulo é:" + areaRetangulo);
        // área triângulo

        System.out.println("******");
        System.out.println("Programa área de um triângulo");
        System.out.println("Entre com o valor da base:");
        Double base1 = meuObj.nextDouble();
        System.out.println("Entre com o valor da altura:");
        Double altura1 = meuObj.nextDouble();
        Double areaTriangulo = (base1 * altura1) / 2;
        System.out.println("Área do triângulo é: " + areaTriangulo);

        // temperatura
        System.out.println("******");
        System.out.println("Programa em Temperatura");
        System.out.println("Entre com a temperatura em Celsius");
        Double celsius = meuObj.nextDouble();
        Double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em fahrenheit é:" + fahrenheit);

        meuObj.close();

    }
}