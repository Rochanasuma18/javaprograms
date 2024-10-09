package Java;

import java.util.Scanner;

public class Moviemain {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the language Count:");
	int lang=sc.nextInt();
	System.out.println("Enter the Category Count:");
	int cat=sc.nextInt();
	System.out.println("Enter the Movie Count:");
	int mov=sc.nextInt();
	System.out.println("Enter the overall Investment:");
	long invested_amt=sc.nextLong();
	
	MovieOps mo=new MovieOps();
	mo.createArrays(lang,cat,mov);
	mo.collectAllData(lang,cat,mov);
	mo.displayAllData(lang,cat,mov);
	mo.totalRevenue();
	mo.totalRevenueBasedOnLanguage(lang);
	mo.checkProfit(invested_amt);
	
}
}
