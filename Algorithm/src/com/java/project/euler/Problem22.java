package com.java.project.euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

public class Problem22 {
	public static void main(String[] args) {
		
		String path = Problem22.class.getResource("").getPath();	//현재 패키지의 절대경로
		File file = new File(path + "names.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line;		
			
			String[] str = null;
			while((line = br.readLine()) != null){
				
				str = line.split(",");
				
				for (int i = 0; i < str.length; i++) {
					str[i] = str[i].trim();
				}
			}
			System.out.println(Arrays.toString(str));
			Arrays.sort(str);
			System.out.println(Arrays.toString(str));
			
			long[] num = new long[str.length];
			long sum;
			for (int i = 0; i < str.length; i++) {
				sum=0;
				for (int j = 1; j < str[i].length()-1; j++) {
					sum = sum + (Long.valueOf(str[i].charAt(j))-64);
//					System.out.print(Integer.valueOf(str[i].charAt(j)-64) + ",");
//					System.out.println(sum);
				}
				num[i]=sum;
			}
			
			System.out.println(Arrays.toString(num));
			
			sum=0;
			for (int i = num.length-1; i >= 0 ; i--) {
				sum = sum + ((i+1)*num[i]);
			}
			
			System.out.println(sum);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	} // end of main
} // end of class















