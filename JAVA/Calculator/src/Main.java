public class Main {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);

        if(args[1].equals("+")){
            soma(x, y);
        }
        if(args[1].equals("-")){
            sub(x, y);
        }
        if(args[1].equals("#")){
            mult(x, y);
        }
        if(args[1].equals("/")){
            divs(x, y);
        }
    }

    //Funções ou Métodos
    static void soma(int x, int y){
        System.out.println(x+y);
    }
    static void sub(int x, int y){
        System.out.println(x-y);
    }
    static void mult(int x, int y){
        System.out.println(x*y);
    }
    static void divs(int x, int y){
        System.out.println(x/y);
    }
}
