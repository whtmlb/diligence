package com.wei.test.OOP;

import com.topsoft.tmp.domain.entity.TaskAction;

public class common {

	public static void main(String e[]){
		String d = "test01_01.xml";
		String[] ds= d.split("_");
		System.out.println(ds.length);
		TaskAction ta  = new TaskAction();
		ta.setId(1l);
		TaskAction ee  = ta;
		ta.setName("haha");
		System.out.println(ta.getName());
		System.out.println(ta.getId());
		ee.setName("tutu");
		ee.setId(2l);
		System.out.println(ta.getName());
		System.out.println(ta.getId());
	}
}
