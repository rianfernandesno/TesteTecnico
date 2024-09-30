public class Quantidade {
    public static void main(String[] args) {
        int indice = 12, soma = 0, k=1;
        while(k < indice){
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("K: " + k);
        System.out.println("Soma: "+ soma);
    }
}
