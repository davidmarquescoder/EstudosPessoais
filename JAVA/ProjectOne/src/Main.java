public class Main {
    public static  void main(String[] args){ //Argumentos - esses parametros passados dentro da Main da pra utilizar como uma lista

        //Variaveis
        var login= "Olá mundo"; //Para criar uma variável em JAVA deve-se utilizar "var" antes do nome da variável ou o tipo primitivo
        int num = 10;          //Definindo o tipo primitivo da variável
        double num1 = 10.5;   //No java não se usa Float, mas usa-se o Double
        boolean num2  = true;

        System.out.println(login); //print em java
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);

        //Chamando as funções criadas abaixo
        soma(10, 8); //Informo apenas os valores que vai entrar em cada variavei criada no meu metodo, chamamos isso de argumentos
        mult();
        div();

        System.out.println("Olá, "+args[0]);
    }
    //Criando funções
    public static void soma(int x, int y){ //Você pode criar variaveis nos parenteses e informar seu tipo primitivo, isso a gente chama de parametro
        System.out.println(x+y);
    }
    static void mult(){
        System.out.println(3*4);
    }
    static void div(){
        System.out.println(4/2);
    }
}