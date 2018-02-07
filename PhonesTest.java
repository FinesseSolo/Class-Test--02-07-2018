import java.util.Scanner;
public class PhonesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phones phone1 = new Phones ("Apple", "Iphone X", "November,7 2017",  1000);

Phones phone2 = new Phones ("Apple", "Iphone 8", "Semptember 2017", 700);

Phones phone3 = new Phones ("Apple","Iphone 8 plus", "September 2017", 800);

System.out.println ("Iphone X" + "Iphone 8" + "Iphone 8 Plus");
System.out.println ("Apple" + "Apple" + "Apple");
System.out.println("Nov, 7 2017" + "September 2017" + "September 2017");


Scanner scanner = new Scanner (System.in);

System.out.print ("Which phone would you like to buy");

int IphoneX = scanner.nextInt();


if (IphoneX == 1){
System.out.println("1000");
}
if  (IphoneX == 2){
System.out.println("700");
}
 if  (IphoneX == 3){
System.out.println("800");
 }

}
}