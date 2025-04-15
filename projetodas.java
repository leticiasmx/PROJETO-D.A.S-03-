public class ParOuImpar{
    public static boolean 
    ehPar (int numero) {
        return numero % 2 == 0;
    }
    
    public static void
    verificarNum (int numero) {
        String mensagem = "O número " + numero + "é" + (ehPar(numero)? "par.": "ímpar");

        System.out.println(mensagem);
    }
    public static void
    main (String[] args) {
        verificarNum(7);
        verificarNum(10);
    }
}