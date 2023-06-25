package pages;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class SplitKeysAndValues {
	
    public static void getReverseWord(){
    	String str = "kodandaram";
    	for(int i=str.length()-1; i>=0; i--) {
    		System.out.print(str.charAt(i));
    	}
    }
    
    public static void getCountOfCharOccurance() {
    	String str = "kodandaramkumardonthala";
    	int beforeCount = str.length();
    	int afterCount = str.replaceAll("a", "").length();
    	int count = beforeCount - afterCount;
    	System.out.println(count);
    }
    
    public static void getMaxVal() {
    	int[] a = {4,6,8,1,3,9,2,7};
    	Arrays.sort(a);
    	System.out.println(a[a.length-2]);
    }
    
    public static void removeDupFromString() {
    	String str = "kodanda ramkumar donthala";
    	char[] w = str.toCharArray();
    	Set<Character> lhs = new LinkedHashSet<>();
    	for(Character ch : w) {
    		lhs.add(ch);
    	}
    	for(Character c : lhs) {
    		System.out.print(c);
    	}
    }
    
    public static void removeDupFromInteger() {
    	int[] a = {5,1,4,6,3,7,2,4,3,1,8,3,9};
    	Set<Integer> ss = new LinkedHashSet<>();
    	for(Integer in : a) {
    		ss.add(in);
    	}
    	for(Integer val : ss) {
    		System.out.print(val);
    	}
    }
    
    public static void getPalindrome() {
    	int num = 1234321;
    	int original = num;
    	int reverse = 0, rem = 0;
    	while(num!=0) {
    		rem = num%10;
    		reverse = reverse * 10 + rem;
    		num = num/10;
    	}
    	if(original==reverse) {
    		System.out.println("Palindrome");
    	}else {
    		System.out.println("Not Palindrome");
    	}
    }
    
    public static void getRandomString() {
    	String str = "abcdefghijklmnopqrstuvwxyz";
    	int len = 8;
    	SecureRandom sr = new SecureRandom();
    	StringBuffer sb = new StringBuffer();
    	for(int i=0; i<len; i++) {
    		sb.append(str.charAt(sr.nextInt(str.length())));
    	}
    	System.out.println(sb);
    }
    
    public static void getFebonasiSeries() {
    	int a,b,c,num = 10, i = 1;
    	a = b = 1;
    	System.out.print(a+ " " +b);
    	while(num>i) {
    		c = a + b;
    		System.out.print(" " +c);
    		a = b;
    		b = c;
    		i++;
    	}
    }
    
    public static void reverseEachWord() {
    	String str = "kodanda ram kumar donthala";
    	String reverseString = "";
    	String[] word = str.split(" ");
    	for(String w : word) {
    		String reverseWord = "";
    		for(int i=w.length()-1; i>=0; i--) {
    			reverseWord = reverseWord + w.charAt(i);
    		}
    		reverseString = reverseString + reverseWord+" ";
    	}
    	System.out.print(reverseString);
    }
    
    public static void getMaxValInDupArray() {
    	int[] a = {2,6,8,5,4,3,1};
    	int temp = 0;
    	for(int i=0; i<a.length; i++) {
    		for(int j=i; j<a.length; j++) {
    			if(a[i]>a[j]) {
    				temp = a[i];
    				a[i] = a[j];
    				a[j] = temp;
    			}
    		}
    	}
    	System.out.println(a[a.length-1]);
    }
    
    public static void main(String[] args) {
        SplitKeysAndValues.getMaxValInDupArray();
    }

}
