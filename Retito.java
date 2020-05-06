
import java.util.Scanner;
public class Retito {
	
	static int  n1, n2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner scanner=new Scanner(System.in);
          System.out.print("ingrese el primer numero : ");
        n1=scanner.nextInt();
        System.out.print("ingrese el sugundo numero : ");
        n2=scanner.nextInt();
        if(n1>n2){
            System.out.print("el orden correcto es : "+n1+","+n2);
        }
        else
            System.out.print("el orden de mayor a menor es : "+n2+" , "+n1);
		
		
		
		
		
		
	}

}
