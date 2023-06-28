package com.stringdemos;
import java.util.*;

public class Arraylists1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>a1=new ArrayList<>();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add(0,"infinity");
		a1.set(0, "zero");
		a1.add("infinity");
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		a1.remove(0);
		a1.remove("infinity");
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add("red");
		a2.add("black");
		a2.add("blue");
		
		ListIterator<String> itr1=a1.listIterator(a1.size());
		ListIterator<String> itr2=a2.listIterator();
		
		while(itr1.hasPrevious())
		{
			System.out.print(itr1.previous()+" ");
		}
		System.out.println();
		while(itr2.hasNext())
		{
			System.out.print(itr2.next()+" ");
		}
		while(itr2.hasPrevious())
		{
			itr2.previous();
		}
		a2.addAll(0,a1);
		System.out.println();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next()+" ");
		}
		
		
		
		
		
	}

}
