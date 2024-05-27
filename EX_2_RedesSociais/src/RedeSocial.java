public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao(){};

    public String getSenha() {
        return senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }
}
