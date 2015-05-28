package com.verizon.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String args[]){
		System.out.println("Hello world");
/*		try {
			  // File file = new File("");
		      FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\DataHackathon\\inputsample.txt");
		      BufferedReader br = new BufferedReader(fr);

		      String s;
		      while((s = br.readLine()) != null)
		        System.out.println(s);

		      fr.close();
		    }
		    catch(Exception e) {
		      System.out.println("Exception: " + e);
		    }
		  
	
	//
	String filename = "C:\\Users\\Administrator\\Desktop\\DataHackathon\\output_sample1.txt";
    String[] linesToWrite = new String[] { "a", "b" };
    boolean appendToFile = true;
try{
    PrintWriter pw = null;
    if (appendToFile) {
      pw = new PrintWriter(new FileWriter(filename, true));
    } else {
      pw = new PrintWriter(new FileWriter(filename));
      // pw = new PrintWriter(new FileWriter(filename, false));
    }
    for (int i = 0; i < linesToWrite.length; i++) {
      pw.println(linesToWrite[i]);
    }
    pw.flush();
    pw.close();
}catch(Exception ex){
	System.out.println("Ex "+ex);
}

	}
	
	
	*/
		String var="more annoying";
	//String REGEX = "\\b"+var+"\\b";
		//String regEx = "([A-Z]+ [A-Z]+ [A-Z]+)";
	    //Pattern pattern = Pattern.compile(regEx);
		//String regEx = "(\\sun[a-z]+)|(\\sdis[a-z]+)";
		String regEx ="\\b[0-9][0-9]*\\stimes\\b";
 	String INPUT ="Arrived in a TIMELY FADH YOUTO. Plugged 6 times unwanted and disclosed works like a charm! No more annoying beeping from the old battery. After doing some homework, we found this price extremely affordable. ";
	       Pattern p = Pattern.compile(regEx);
	       Matcher m = p.matcher(INPUT); // get a matcher object
	   
	       int count = 0;
	       while(m.find()) {
	         count++;
	         System.out.println("Match number "+count);
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());
	      }
	   

	}
}
