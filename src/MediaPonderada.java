import java.util.Scanner;

public class MediaPonderada {
    String nomeDoAluno;
    double primeiraNotaDoAluno;
    double segundaNotaDoAluno;
    double terceiraNotaDoAluno;
    int pesoDaPrimeiraNota;
    int pesoDaSegundaNota;
    int pesoDaTerceiraNota;
    double resultado;


    public void coletarDadosDoAluno(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome:");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Agora digite a nota da primeira atividade:");
        primeiraNotaDoAluno = leitor.nextDouble();

        System.out.print("Qual é o peso dessa atividade?");
        pesoDaPrimeiraNota = leitor.nextInt();

        System.out.print("Digite a nota da segunda atividade:");
        segundaNotaDoAluno = leitor.nextDouble();

        System.out.print("Qual o peso da segunda atividade?");
        pesoDaSegundaNota = leitor.nextInt();

        System.out.print("Agora digite a nota da ultima atividade:");
        terceiraNotaDoAluno = leitor.nextDouble();

        System.out.print("Por fim, digite o peso desta atividade:");
        pesoDaTerceiraNota = leitor.nextInt();

        calcularMediaPonderada();

    }

    public void calcularMediaPonderada(){

        resultado = ((primeiraNotaDoAluno * pesoDaPrimeiraNota) + (segundaNotaDoAluno * pesoDaSegundaNota) + (terceiraNotaDoAluno * pesoDaTerceiraNota)) / (pesoDaPrimeiraNota + pesoDaSegundaNota + pesoDaTerceiraNota);

        exibirResultadoDaMediaPonderada();
    }

    public void exibirResultadoDaMediaPonderada(){
        String resultadoEmDecimais = String.format("%.2f", resultado);
        System.out.println("A média ponderada do aluno " + nomeDoAluno + " é: " + resultadoEmDecimais);
    }
}
