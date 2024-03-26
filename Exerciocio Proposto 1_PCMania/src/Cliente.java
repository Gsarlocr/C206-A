public class Cliente {
    String nome;
    long cpf;

    Computador[] comput = new Computador[10];

    float calculaTotalCompra(){
        float soma = 0;
         for (int i = 0; i <comput.length; i++) {
            if (comput[i]!=null){
                soma = soma+ comput[i].preco;
            }
        }

        return soma;

    }
}
