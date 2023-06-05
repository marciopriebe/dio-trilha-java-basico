public class App {
    public static void main(String[] args) throws Exception {
        byte idade = 123; 
        short ano = 2021; //superior a 30000 bytes
        int cep = 2107333; 
        long cpf = 01345665434L; //deve ser encerrado com um L
        float pi = 3.14F; //sempre colocar um F do lado
        double salario = 1275.33;

        // cuidado com os tipos

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

       // short numeroCurto2 = numeroNormal; () não irá compilar pois o tipo short não comporta um int

       short numeroCurto2 = (short)numeroNormal; // devemos fazer um casting


    // CONSTANTES
    // Para utilizar uma constante devemos utilizar a palavra FINAL na declaração da variável
    // O nome da variavel deve ester em UPPERCASE e se necessário separar com ífem.

    final double VALOR_DE_PI = 3.14; // cria uma constante
    
    
    }
}
