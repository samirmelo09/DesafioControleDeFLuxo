import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int numero2 = terminal.nextInt();

        terminal.close();
              
        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    
    static void contar(int numero1, int numero2 ) throws ParametrosInvalidosException {
        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException();
        }
        
        int cont = numero2 - numero1;
        for (int i = 1; i <= cont; i++) {
            System.out.println("Imprimindo o número " + i);
            
        }
        
    }
    
}


