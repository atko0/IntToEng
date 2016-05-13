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
	    	String num = String.valueOf(n);
	    	if(n>=0&&n<20){
	    		num=eNum1[n];
	    		return num;
	    	}
	    	else if(n<=20&&n>100){
	    		String num10 = num.substring(0,1); //10の位
	    		String num1  = num.substring(1,2);//1の位
	    		
	    		int num10a = Integer.parseInt(num10);
	    		int num1a = Integer.parseInt(num1);
	    		
	    		num=eNum2[num10a-2]+eNum1[num1a+1];
	    		
	    	}
	    	else{
	    		num = "範囲外です";
	    		return num;    		
	    	}
	    	
	        return "";
	    }

}
