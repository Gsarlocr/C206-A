public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoriaUSB = null;

    SistemaOperacional sop = new SistemaOperacional();

    HardwareBasico[] hardwareBasicos = new HardwareBasico[10];

    public Computador(HardwareBasico[] hards, SistemaOperacional jorege){
         sop= jorege;
         hardwareBasicos = hards;
    }


    void mostraPCConfigs(){
        System.out.println("Marca " + this.marca);
        System.out.println("Preço " + this.preco);
        System.out.println("Sistema OP " + sop.nome + " " + sop.tipo);

        if(memoriaUSB!=null){
            System.out.println("Capacidade memoria: " +memoriaUSB.capacidade);
            System.out.println("Nome memoria: " +memoriaUSB.nome);
        }

        for (int i = 0; i <hardwareBasicos.length; i++) {
            if (hardwareBasicos[i]!=null){
                System.out.println("Nome Hardware Basico: " +hardwareBasicos[i].nome);
                System.out.println("Capacidade Hardware Basico: " + hardwareBasicos[i].capacidade);
            }

        }

    }

    void addMemoriaUSB(MemoriaUSB MUSB){
    memoriaUSB = MUSB;
    }

}
