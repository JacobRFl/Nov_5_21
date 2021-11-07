package com.ss.a2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
	
		for(int i =1;i<100;i+=3) {
			list.add(i);
		}
		System.out.println(getString(list));
	}
	
	public static String getString(List<Integer> list) {
		return list.stream().map(i -> {
			if (i % 2 == 0) {
				return "e" + i;
			} else {
				return "o" + i;
			}
		}).collect(Collectors.joining(","));
	}
}