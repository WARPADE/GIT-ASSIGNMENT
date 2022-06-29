package com.cg.string;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		String l="StringBuffer";
        String m="is a peer class of String";
        String n="that provides much of";
        String o="the functionality of strings";
        
		StringBuilder q=new StringBuilder();
        q.append(l);
        q.append(" "+m);
        q.append(" "+n);
        q.append(" "+o);
        System.out.println(q);
        
        
    }
}
