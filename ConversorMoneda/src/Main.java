import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cantidad:");
        int pesos = Integer.parseInt(sc.nextLine());
        int trmDolar = 4173;
        float dolares = pesos / trmDolar;
        System.out.println("Cantidad de dolares: "+ dolares);
    }
}