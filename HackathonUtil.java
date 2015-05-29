package com.verizon.hachathon;

import java.util.ArrayList;
import java.util.List;

public class HackathonUtil {
	
	public List<String> addNegativeWord(){
		
		List<String> list=new ArrayList<String>();
		list.add("[0-9][0-9]*\\stimes"); // reg ex to add in list
		list.add("[0-9][0-9]*\\sagents");
		list.add("time out");
		list.add("no response");
		list.add("no longer");
		list.add("forever");
		list.add("donot");
		list.add("don't");
		list.add("dont");
		list.add("do not");
		list.add("did not");
		list.add("dint");
		list.add("didnt");
		list.add("doesnot");
		list.add("does not");
		list.add("doesn't");
		list.add("does nothing");
		list.add("do nothing");
		list.add("unable to");
		list.add("slow");
		list.add("poor");
		list.add("error");
		list.add("concern");
		list.add("not good");
		list.add("not work");
		list.add("not fast");
		list.add("slow");
		list.add("problem");
		list.add("awful");
		list.add("cancel");
		list.add("can't");
		list.add("can not");
		list.add("cannot");
		list.add("could not");
		list.add("couldn't");list.add("unavailable");list.add("never");list.add("empty");list.add("not proceed");
		list.add("couldn't proceed");list.add("pain");list.add("waste of time");list.add("impossible");
		list.add("taking over");list.add("keep trying");list.add("keep loading");list.add("ridiculous");
		list.add("froze");list.add("frozen");list.add("freeze");
		list.add("horrible");
		return list;
	}
	
	public List<String> addBusinessWord(){
		List<String> list = new ArrayList<String>();
		list.add("network");
		list.add("fit");
		list.add("battery");
		list.add("terminal");
		list.add("internet");
		list.add("service");
		list.add("fios");
		list.add("mobile");
		list.add("product");
		list.add("circuit");
		list.add("money");
		list.add("bill");
		list.add("payment");
		list.add("phone");
		list.add("invoice");
		list.add("price");
		list.add("ordering");
		list.add("order");
		list.add("hd");
		list.add("tv");
		list.add("fios");
		list.add("speed"); 	
		list.add("technician");
		list.add("work");
		list.add("product");
		list.add("box");
		list.add("beep");
		list.add("deliver");
		list.add("replace");
		list.add("operate");
		list.add("battery");
		list.add("install");
		return list;
	}
	
	public List<String> addNeutralTerms(){
		List<String> list=new ArrayList<String>();
		list.add("ok");
		list.add("good with");
		list.add("not bad");
		list.add("not slow");		
		return list;
	}

}
