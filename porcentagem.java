public class porcentagem {
    public static void main(String[] args) {
        float [] estados = {67836.43f, 36678.66f, 29229.88f, 27165.48f, 19849.53f};
        float total = total(estados);
        System.out.printf("SP: %.2f \n" , porc(estados[0], total));
        System.out.printf("RJ: %.2f \n" , porc(estados[1], total));
        System.out.printf("MG: %.2f \n" , porc(estados[2], total));
        System.out.printf("ES: %.2f \n" , porc(estados[3], total));
        System.out.printf("OUTROS: %.2f \n" , porc(estados[4], total));
    }
    public static float total(float [] vet){
        float soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }
        return soma;
    }
    public static float porc(float value, float total){
        float porcentagem = (value*100)/total;
        return porcentagem;
    }
}
