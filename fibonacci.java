import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDesejado;
        System.out.println("Entre com o número:");
        numDesejado = sc.nextInt();
        System.out.println(confereFibonacci(numDesejado));
        sc.close();
    }

    public static String confereFibonacci(int numDesejado){
        int numAnt = 0, numAtual = 1, aux = 0;
        if (numDesejado == 0 || numDesejado == 1) {
            return "o número " + numDesejado + " pertence a sequencia de Fibonnaci";
        }
        while (numDesejado >= numAtual) {
            aux = numAnt + numAtual;
            numAnt = numAtual;
            numAtual = aux;
            if (numAtual == numDesejado) {
                return "o número " + numDesejado + " pertence a sequencia de Fibonnaci";
            }
        }
        return "o número " + numDesejado + " NÃO pertence a sequencia de Fibonnaci";
    }
}