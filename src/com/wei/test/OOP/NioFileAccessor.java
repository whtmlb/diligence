package com.wei.test.OOP;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioFileAccessor {

	public static void main(String e[]) throws IOException {
		System.out.println(readFile("D:/Projects/github/diligence/src/com/wei/test/OOP/test.xml"));
	}
	
	private static String readFile(String fileName) throws IOException {
		FileInputStream fin = new FileInputStream(fileName);
		FileChannel fc = fin.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(256);
		StringBuffer strBuffer = new StringBuffer();
		while(fc.read(buffer) != -1) {
			buffer.flip();
			strBuffer.append(new String(buffer.array(),"utf-8"));
			buffer.clear();
		}
		return strBuffer.toString();
	}
}
