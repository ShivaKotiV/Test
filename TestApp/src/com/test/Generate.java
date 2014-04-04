package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Generate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(1);
		String s = "1,2,3,4,6,7,8,10";

		String[] arr = s.split(",");
		int[] intArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			list.add(Integer.parseInt(arr[i]));

		Collections.sort(list);
		System.out.println(list);
		Object[] intArrObj = (Object[]) list.toArray();
		int temp, temp2;
		temp2 = (Integer) intArrObj[0];
		temp = (Integer) intArrObj[0];
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 1; i <= intArrObj.length - 1; i++) {
			if (((Integer) intArrObj[i]) - 1 == temp2) {
				temp2 = (Integer) intArrObj[i];
				map.put(temp, temp2);
			} else if (i == 1) {
				map.put(temp, temp2);
				temp2 = (Integer) intArrObj[i];
				map.put(temp2, temp2);
			} else {
				temp2 = (Integer) intArrObj[i];
				temp = temp2;
				map.put(temp, temp2);
			}
		}
		System.out.println(map);

	}

}
