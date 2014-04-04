package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		int i=1;
		Set set = null;
		for(set=new HashSet();set.size()<=10;set.add(i++),set.add(null))
		System.out.println(set);
		// repeated words count
		String s = "this is a string,this is a class";
		String[] s1=s.split(",");
		Map<String,Integer> map =new HashMap<String, Integer>();
		System.out.println(s1.length);
		for(int j=0;j<s1.length;j++){
			String[] s2=s1[j].split(" ");
			for(int k=0;k<s2.length;k++){
				
				if(map.containsKey(s2[k])){
					
					map.put(s2[k], map.get(s2[k])+1);
					System.out.println("map"+map.get(s2[k]));
				}
				else{
					map.put(s2[k], 1);
				}
			}
		}
		System.out.println(map);
		//Arrays remove duplicate values and sort the array
		int[] a = new int[]{1,4,3,1,7};
		Set<Integer> setArray = new HashSet<Integer>();
		for(int n=0;n<a.length;n++){
			setArray.add(a[n]);
		}
		System.out.println(setArray);
	}
}
