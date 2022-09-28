public class Main {
    public static void main(String[] args){
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        if(args[0].equals("somar")){
            soma(x, y);
        }
    }
    static void soma(int x, int y){
        System.out.println(x+y);
    }
}
