package com.wei.test.OOP;

import com.topsoft.tmp.domain.entity.TaskAction;

public class common {

	public static void main(String e[]){
		TaskAction ta  = new TaskAction();
		ta.setId(1l);
		TaskAction ee  = ta;
		ta.setName("haha");
		System.out.println(ta.getName());
		System.out.println(ta.getId());
		ee.setName("tutu");
		ee.setId(2l);
		Long id = ta.getId();
		id = 3l;
		String te = ta.getName();
		te = "hehe";
		System.out.println(ta.getName());
		System.out.println(ta.getId());
	}
}
