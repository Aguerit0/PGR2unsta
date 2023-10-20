//1- Get into chain of char and show vocal of vocal in horizontal and vertical
public class p1 {
    public static void main(String[] args)
    {
        //insert chain of char
        String chain = "new chain";

        //show vocal of vocal a,e,i,o,u in horizontal
        for (int i=0; i<chain.length(); i++){
            char vocal = chain.charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' || vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U' ){
                System.out.print(vocal+" - ");
            }
        }
        //show vocal of vocal a,e,i,o,u in vertical
        for (int i=0; i<chain.length(); i++){
            char vocal = chain.charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' || vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U' ){
                System.out.println(vocal+" - ");
            }
        }
    }
}