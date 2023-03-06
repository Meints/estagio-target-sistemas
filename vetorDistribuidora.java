import java.util.Random;
public class vetorDistribuidora {
    public static void main(String[] args) {
        float [] faturamento = new float [30];
        preencheVeor(faturamento);
        System.out.println("MENOR faturamento: " + menorFaturamento(faturamento));
        System.out.println("MAIOR faturamento: " + maiorFaturamento(faturamento));
        float media = mediaMensal(faturamento);
        System.out.println("Média Mensal: " + media);
        System.out.println("Tiveram " + numDiasSuperiores(media, faturamento) + " superiores a média mensal");
        
    }

    public static void preencheVeor(float [] vet){
        Random rd = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rd.nextInt(1500,8000);
            System.out.println(vet[i]);
        }
    }
    public static float menorFaturamento(float [] vet){
        float menor = Integer.MAX_VALUE;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }
    public static float maiorFaturamento(float [] vet){
        float maior = Integer.MIN_VALUE;
        for (int i = 0; i < vet.length; i++) {
            if (maior < vet[i]) {
                maior = vet[i];
            }
        }
        return maior;
    }
    public static float mediaMensal(float [] vet){
        float soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }
        return soma/30;
    }
    public static int numDiasSuperiores(float media, float [] vet){
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > media) {
                cont++;
            }
        }
        return cont;
    }
}
