public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no GooglePlus!");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }
    @Override
    public void postarVideo() {
        System.out.println(" postou um vídeo no GooglePlus!");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!");
    }
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no GooglePlus!");
    }
}
