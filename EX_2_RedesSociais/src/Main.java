public class Main {
    public static void main(String[] args) {

        RedeSocial[] list1 = new RedeSocial[6];
        Facebook face1 = new Facebook();
        Twitter twitter1 = new Twitter();
        Instagram insta1 = new Instagram();
        GooglePlus google1 = new GooglePlus();

        face1.senha = "123";
        face1.numAmigos = 23;

        twitter1.senha = "1234";
        twitter1.numAmigos = 54;

        insta1.senha = "321";
        insta1.numAmigos = 33;

        Usuario usuario1 = new Usuario(list1);

        usuario1.setNome("Lineu");
        usuario1.setEmail("lineu@gmail.com");

        usuario1.addRede(face1);
        usuario1.addRede(insta1);

        System.out.println(usuario1.getNome());
        System.out.println(usuario1.getEmail());

        usuario1.interacao();
    }
}