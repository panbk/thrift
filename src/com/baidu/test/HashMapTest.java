package com.baidu.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Map<String, Long> map = new HashMap<String, Long>();
		for (Long index = 0L; index < 10L; index++)
		{
			map.put("1", index);
		}
		Iterator<Entry<String, Long>> it = map.entrySet().iterator();

		while (it.hasNext())
		{
			Entry<String, Long> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
