public class metodos {
    public static void main (String [] args) {
        String primeiroNome = "Eduardo";
        String segundoNome = "Vitor";
        String espaço = " 25 anos";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome, espaço);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome, String espaço) {
        return primeiroNome + (segundoNome) + espaço;


    }
}