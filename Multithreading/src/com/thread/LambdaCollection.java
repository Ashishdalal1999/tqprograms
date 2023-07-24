package com.thread;

import java.util.*;;

public class LambdaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(8);
		al.add(2);
		
		al.forEach(n->System.out.println(n*n));
		
		ArrayList<String> st=new ArrayList<>();
		st.add("Ashish");
		
		st.forEach(x->System.out.println("length is: "+x.length()));
		st.forEach(x->System.out.println(x.concat(" Dalal")));
		

	}

}
