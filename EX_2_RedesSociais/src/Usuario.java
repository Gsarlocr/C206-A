public class Usuario {
    private String nome;
    private String email;
    RedeSocial[] list = new RedeSocial[6];

    public Usuario(RedeSocial[] redes) {
        this.list = redes;
    }

    public void addRede(RedeSocial a) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = a;
                break;
            }
        }
    }

    public void interacao(){

        for (int i = 0; i < list.length; i++) {
            if(list[i] != null){
                if (list[i] instanceof Instagram) {
                    Instagram insta = (Instagram) list[i];
                    insta.postarComentario();
                    insta.postarVideo();
                    insta.postarFoto();
                    insta.curtirPublicacao();
                    System.out.println( "Senha: "+ insta.getSenha());
                    System.out.println( "Número de amigos: "+ insta.getNumAmigos());
                }


            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}