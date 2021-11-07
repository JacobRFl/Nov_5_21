/**
 * 
 */
package com.ss.a3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Jacob
 *
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List<String> str = new ArrayList<>();
		 str.add("heo");
		 str.add("add");
		 str.add("all");
		 str.add("ahello");
		 str.add("hell");
		 str.add("hel");
		 str.add("hello");
		 str.add("helo");
		 
		 str = filter3a(str);
		 for(String s: str)
			 System.out.println(s);
		 
	}

	public static List<String> filter3a(List<String> list) {
		return list.stream().filter(i -> (i.length()  == 3&&i.charAt(0)=='a')).collect(Collectors.toList());
	}
}
