//Nesse projeto vamos estudar um pouco sobre parametros e argumentos, foi visto no projeto passado
//Porém esse vai ser dedicado somente  a esses assuntos.

public class Main {
    public static void main(String[] args){ //Esse "String[]" serve como uma coleção ou lista, posso armazenar valores dentro dele e o "args" é serve como uma variavel o string é o tipo primitivo
        System.out.println("Primeiro nome: "+args[0]); //Para colocar algum valor dentro dos indices eu informo naa hora de compilar o projeto pelo CMD
        System.out.println("Segundo nome: "+args[1]);
        System.out.println("Terceiro nome: "+args[2]);
    }//Para compilar aqui pela IDE, tem que colocar os argumentos nas propriedades do projeto (não sei como faz isso)
}