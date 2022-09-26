public class Main {
    public static  void main(String[] args){

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
        soma();
        mult();
        div();
    }
    //Criando funções
    public static void soma(){
        int x = 8;
        int y = 9;
        System.out.println(x+y);
    }
    static void mult(){
        System.out.println(3*4);
    }
    static void div(){
        System.out.println(4/2);
    }
}