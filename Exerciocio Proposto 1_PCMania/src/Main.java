import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int resposta;
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Faça seu cadastro");
        System.out.print( "Digite seu nome: ");
        cliente.nome = entrada.nextLine();
        System.out.print( "Digite seu CPF: ");
        cliente.cpf = entrada.nextLong();
        System.out.println("\n");

        System.out.println("Qual PC deseja comprar?");
        System.out.println("1 - Promoção 1");
        System.out.println("2 - Promoção 2");
        System.out.println("3 - Promoção 3");
        System.out.println("Digite 0 ao terminar");


        do {

            resposta = entrada.nextInt();

            if (resposta == 1){

                HardwareBasico[] hardwares = new HardwareBasico[3];
                hardwares[0] = new HardwareBasico("Pentium Core i3",2200 );
                hardwares[1] = new HardwareBasico("Memória RAM",8 );
                hardwares[2] = new HardwareBasico("HD",500 );

                SistemaOperacional sp1 = new SistemaOperacional("Linux", 32 );

                Computador comp1 = new Computador(hardwares,sp1);

                MemoriaUSB m1 = new MemoriaUSB("Pen drive", 16);

                comp1.marca = "Positivo";
                comp1.preco = 3300;
                comp1.addMemoriaUSB(m1);

                for (int i = 0; i < cliente.comput.length; i++) {
                    if (cliente.comput[i]==null){
                        cliente.comput[i]=comp1;
                        break;
                    }
                }

            } else if (resposta == 2) {

                HardwareBasico[] hardwares = new HardwareBasico[3];
                hardwares[0] = new HardwareBasico("Pentium Core i5",3370 );
                hardwares[1] = new HardwareBasico("Memória RAM",16 );
                hardwares[2] = new HardwareBasico("HD",1 );

                SistemaOperacional sp1 = new SistemaOperacional("Windows 8", 64 );

                Computador comp1 = new Computador(hardwares,sp1);

                MemoriaUSB m1 = new MemoriaUSB("Pen drive", 32);

                comp1.marca = "Acer";
                comp1.preco = 8800;
                comp1.addMemoriaUSB(m1);

                for (int i = 0; i < cliente.comput.length; i++) {
                    if (cliente.comput[i]==null){
                        cliente.comput[i]=comp1;
                        break;
                    }
                }

            } else if (resposta == 3) {

                HardwareBasico[] hardwares = new HardwareBasico[3];
                hardwares[0] = new HardwareBasico("Pentium Core i7",4500 );
                hardwares[1] = new HardwareBasico("Memória RAM",32 );
                hardwares[2] = new HardwareBasico("HD",2 );

                SistemaOperacional sp1 = new SistemaOperacional("Windows 10", 64 );

                Computador comp1 = new Computador(hardwares,sp1);

                MemoriaUSB m1 = new MemoriaUSB("HD", 1);

                comp1.marca = "Vaio";
                comp1.preco = 4800;
                comp1.addMemoriaUSB(m1);

                for (int i = 0; i < cliente.comput.length; i++) {
                    if (cliente.comput[i]==null){
                        cliente.comput[i]=comp1;
                        break;
                    }
                }
            }


        }while(resposta!= 0);


        System.out.println(cliente.nome);
        System.out.println(cliente.cpf);

        for (int i = 0; i < cliente.comput.length; i++) {
            if(cliente.comput[i]!=null){
                cliente.comput[i].mostraPCConfigs();
            }

        }
        System.out.println(cliente.calculaTotalCompra());



        entrada.close();
    }
}
