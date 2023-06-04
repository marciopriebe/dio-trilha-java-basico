package edu.marcio.primeirasemana;

public class Metodos {

    public static void main(String[] args) {

        // MÉTODOS

        // tipoRetorno nomeNoInfinitivo parâmetro (s)

        // Exemplo .: String formatarCpf (Long cpg);

        int result = somar(19, 11);

        System.err.println(result);

        String nomeCompleto = nomeCompleto("Márcio", "Machado Priebe");

        String nome = "Márcio";
        String sobrenome = "Machado priebe";

        String nomeCompleto2 = nomeCompleto(nome, sobrenome);
        System.err.println(nomeCompleto2);

        System.err.println(nomeCompleto);

    }

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static String nomeCompleto(String primeiroNome, String sobrenome) {
        return primeiroNome.concat(" ").concat(sobrenome);
    }
}
