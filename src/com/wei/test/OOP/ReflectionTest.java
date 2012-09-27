package com.wei.test.OOP;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.topsoft.tmp.domain.entity.TaskType;

public class ReflectionTest {
	
	public static void main(String[]  e) {
	    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
		Object ob = getObjectFromDomElement();
	}
	public static Object getObjectFromDomElement() {
//		String test;
		try {
			TaskType ty = new TaskType();
			Field[] fields = TaskType.class.getDeclaredFields();
			for(Field f : fields) {
				int e =f.PUBLIC;
				String fieldName = f.getName();
				if(fieldName.equals("serialVersionUID")) continue;
				String nodeName;
				String setMethodName = "set" + fieldName.substring(0, 1).toUpperCase()
                        + fieldName.substring(1, fieldName.length());
				
				Method setMethod = TaskType.class.getMethod(setMethodName, new Class[]{f.getType()});
				Class o = f.getType();
				if(o == String.class) {
					setMethod.invoke(ty, "ee");
				} else if(o == Long.class) {
					setMethod.invoke(ty, 0l);
				} else if(o == Date.class) {
					setMethod.invoke(ty, new Date());
				} else if(o.getName().equals("boolean")) {
					setMethod.invoke(ty, false);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
