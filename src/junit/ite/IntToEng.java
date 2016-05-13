package junit.ite;

import java.util.Scanner;

public class IntToEng {

	 // メインメソッド
	    public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	
	        System.out.println(translateEng(input));
	
	    }
	
	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	//0~19
	    	String[] eNum1 = {"zero", "one", "two", "three", "four",
	    			"five", "six", "seven", "eight", "nine",
	    			"ten", "eleven", "twelve", "thirteen", "fourteen",
	    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	    	//20,30,40,50,60,70,80,90
	    	String[] eNum2 = {"twenty", "thirty", "forty", "fifty", "sixty",
	    	"seventy", "eighty", "ninety"};
	    	
	    	
	    	
	        return "";
	    }

}
