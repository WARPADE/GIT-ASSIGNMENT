package com.cg.string;
//string buffer
public class StringBuffer1 {
	public static void main(String[] args) {
		String l="StringBuffer";
        String m="is a peer class of String";
        String n="that provides much of";
        String o="the functionality of strings";
        StringBuffer p=new StringBuffer();
        p.append(l);
        p.append(" "+m);
        p.append(" "+n);
        p.append(" "+o);
        System.out.println(p);
	}

}
