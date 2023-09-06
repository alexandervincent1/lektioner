import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("ange tal1;");
        int tal1 = tangentbord.nextInt();
        System.out.print("ange tal2;");
        int tal2 = tangentbord.nextInt();
        int produkt = tal1*tal2;
        System.out.println(tal1+"*"+tal2+"="+produkt);

        System.out.print("ange decimaltal 1;");
        double decimaltal1 = tangentbord.nextInt();
        System.out.print("ange decimaltal 2;");
        double decimaltal2 = tangentbord.nextInt();
        double kvot = decimaltal1/decimaltal2;
        System.out.println(decimaltal1+"/"+decimaltal2+"="+kvot);
        
        System.out.print("ange tal3;");
        int tal3 = tangentbord.nextInt();
        System.out.print("ange tal4;");
        int tal4 = tangentbord.nextInt();
        int modulo = tal3%tal4;
        System.out.println(tal3+"%"+tal4+"="+modulo);

        


       
       
    }
}
