package com.baidu.test;

import java.util.HashSet;
import java.util.Hashtable;

public class HashTableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("100001", "200001");
		table.put("100002", "200002");
		table.put("100003", "200001");

//		String[] values = new HashSet<String>(table.values()).toArray(new String[0]);
//		String[] keys = table.keySet().toArray(new String[0]);
//		System.out.println(values);
//		System.out.println(keys);



		for (int index = 0; index < 10; index++)
		{
			Thread readThread = new Thread(new HashTableRead(table));
			readThread.start();
			Thread writeThread = new Thread(new HashTableWrite(table));
			writeThread.start();

		}



	}

}
