package javaapplication20;
import java.util.Scanner;

public class JavaApplication20 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    
        int qtHomens = 0;
        int qtMulheres = 0;
        double maior = 0;
        double menor = 1000;
        double somaH = 0;
        for (int i=0;i<5;i++){
            System.out.println("Digite o seu sexo, sendo 1 para Masculino e 2 para Feminino:");
            int sexo = teclado.nextInt();
            System.out.println("Digite agora sua altura em CM:");
            double altura = teclado.nextDouble();
            switch (sexo) {
            case 1 -> {
                qtHomens = qtHomens+ 1;
                somaH = somaH + altura;
            }
            case 2 -> qtMulheres = qtMulheres+ 1;
            default -> System.out.println("Opção de sexo inválida.");
        }
            if(altura > maior){
                maior = altura;
            } if(altura < menor){
                menor = altura;
            }
        }
        
        
        double mediaH = somaH/qtHomens;
        System.out.println("A maior altura do grupo é a de "+maior +" CM");
        System.out.println("A média de altura entre os homens do grupo é de "+mediaH+ " CM");
        System.out.println("A menor altura do grupo é de " +menor+" CM");
        System.out.println("O npúmero de mulheres é de "+qtMulheres+" pessoas");
        
        
    }
    
}
