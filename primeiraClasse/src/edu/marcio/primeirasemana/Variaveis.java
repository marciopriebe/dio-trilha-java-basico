package edu.marcio.primeirasemana;

public class Variaveis {
    public static void main(String[] args) {
        
        // As variáveis devem se inicializar preferencialmente com letra minúscula e utilizar o padrão camel case
        // não pode palavras chaves e sem espaço
        // Único dentro do escopo
        // podem inicilar com underline _ ou cifrão
        // não podem inicializar com número




        final String BR = "Brasil";
       // BR = "Canadá"; não irá compilar devido q a variável BR é uma constante
        System.out.println(BR);


        // a palavra final quer dizer que o valor da variável não pode ser mudado será CONSTANTE
        // quando a variável constante tiver suas palavras deverá ser separada pelo ífen ex: ESTADOS_BRASILEIROS

        final int ESTADOS_BRASILEIRO = 27;
        final int ANO_2000 = 2000;

        // int %numero =1; ñ compilará
        // int 1numero =1; ñ compilará

        int $n1 = 14;

        String nome;


        int anoFrabricacao = 2000;

        boolean verdadeira = true;

    }
}
