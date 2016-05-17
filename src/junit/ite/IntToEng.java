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
	    	//1~19
	    	String[] eNum1 = {"", "one", "two", "three", "four",
	    			"five", "six", "seven", "eight", "nine",
	    			"ten", "eleven", "twelve", "thirteen", "fourteen",
	    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	    	//20,30,40,50,60,70,80,90
	    	String[] eNum2 = {"","","twenty", "thirty", "forty", "fifty", "sixty",
	    	"seventy", "eighty", "ninety"};
	    	String num = String.valueOf(n);
	    	int tenr=n/10;//十の位
	    	int oner=n%10;//一の位
	    	int handr=tenr/10;
	    	String h= "hundred";
	    	if(n==0){
	    		num="zero";
	    		return num;
	    	}
	    	else if(n>0&&n<20){
	    		num =eNum1[n];
	    		return num;
	    	}else if(n<100){
	    		num = eNum2[tenr]+" "+eNum1[oner];
	    		return num;
	    	}else if(n==100){
	    		num = h;
	    		return num;
	    		
	    	}else if(n<120){
	    		num = eNum1[handr]+" "+h+" "+eNum1[n%100];
	    		return num;
	    	}else if(n<1000){
	    		num= eNum1[handr]+" "+h+" "+eNum2[n%100/10]+" "+eNum1[n%100];
	    		return num;
	    	}else if(n==1000){
	    		num = "thousand";
	    		return num;
	    	}else {
	    		num = "範囲外です";
	    		return num;
	    	}
	    	
	    }
}
