package com.evergent.coreJAVA.Collections.Array;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add(100);
		myList.add("Hello");
		myList.add(4.5);
		myList.add(100);
		System.out.println(myList);
		Iterator i = myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}