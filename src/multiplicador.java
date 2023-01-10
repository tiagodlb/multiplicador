public class multiplicador {

    private int[] numerosTabela = {1,2,3,4,5,6,7,8,9,10};

    int multiplicar(int i, int j){
       return i * j;
    }
    void imprimir(int n){
        for(int i = 0; i < numerosTabela.length; i ++) {
            System.out.println(n +" x " + numerosTabela[i] + " = " + multiplicar(numerosTabela[i], n));
        }
    }
}
