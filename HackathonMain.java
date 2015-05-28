package com.verizon.hachathon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class HachathonMain {

	private static List<String> negativeWordList = new ArrayList<String>();
	private static List<String> businessWordList = new ArrayList<String>();
	private static List<String> neutralWordList = new ArrayList<String>();

	public static void main(String[] args) {
		System.out.println("Hello Hachathon");
		HackathonUtil hackathonUtil = new HackathonUtil();
		negativeWordList = hackathonUtil.addNegativeWord();
		businessWordList = hackathonUtil.addBusinessWord();
		neutralWordList = hackathonUtil.addNeutralTerms();
		String lineStr = "";
		String outputFileName = "C:\\Users\\Administrator\\Desktop\\DataHackathon\\output_sample1.txt";
		String inputFileName = "C:\\Users\\Administrator\\Desktop\\DataHackathon\\inputsample.txt";
		try {

		    PrintWriter pw = new PrintWriter(new FileWriter(outputFileName));
			FileReader fr = new FileReader(inputFileName);
			BufferedReader br = new BufferedReader(fr);
			while ((lineStr = br.readLine()) != null){
				
			    String resultStr=new HachathonMain().parseLine(lineStr);
			    System.out.println( resultStr +" "+lineStr);
			    pw.println(resultStr);
			}
			pw.flush();
			pw.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public String parseLine(String lineStr) throws Exception {

		String resultStr = "Positive";
		if (lineStr.length() > 0) {
			// check for business pattern
			if (!checkForBusinessPattern(lineStr)) {
				return "Neutral";
			}

			if (checkForNegative(lineStr)) {
				resultStr = "Negative";
			} else if (checkForNeutral(lineStr)) {
				resultStr = "Neutral";
			}
		}
		return resultStr;
	}

	public boolean checkForBusinessPattern(String lineStr) {
		lineStr=lineStr.toLowerCase();
		for (String businessWord : businessWordList) {
			String regEx = "\\b" + businessWord + "\\b";
			Pattern p = Pattern.compile(regEx);
			Matcher m = p.matcher(lineStr); // get a matcher object
			if (m.find()) {
				return true;
			}
		}
		return false;
	}

	public boolean checkForNegative(String lineStr) {

		if (checkForQuestionAndCaps(lineStr)) {
			return true;
		}

		int count = 0;

		for (String str : negativeWordList) {

			String REGEX = "\\b" + str + "\\b";
			Pattern p = Pattern.compile(REGEX);
			Matcher m = p.matcher(lineStr); // get a matcher object
			if (m.find()) {
				return true;
			}
		}

		return false;
	}

	public boolean checkForQuestionAndCaps(String lineStr) {
		// check for three consecutive capital words
		String regExpression ="([A-Z]+ [A-Z]+ [A-Z]+)";
		Pattern pt = Pattern.compile(regExpression);
		Matcher matcher = pt.matcher(lineStr); // get a matcher object
		if (matcher.find()) {
			return true;
		}
		// convert all into small
		lineStr = lineStr.toLowerCase();
		if (lineStr.contains("why") || lineStr.contains("where")
				|| lineStr.contains("nothing")) {
			return true;
		}
		if (lineStr.contains("but")) {
			String[] tmpStr = lineStr.split("but");
			for (String negWord : negativeWordList) {
				String regEx = "\\b" + negWord + "\\b";
				Pattern p = Pattern.compile(regEx);
				Matcher m = p.matcher(lineStr); // get a matcher object
				if (m.find()) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkForNeutral(String lineStr) {
		return false;
	}

}
