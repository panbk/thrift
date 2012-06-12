package com.baidu.test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashTableRead implements Runnable
{
	private Hashtable<String, String> hashtable;

	public HashTableRead(Hashtable<String, String> hashtable)
	{
		this.hashtable = hashtable;
	}

	@Override
	public void run()
	{
		synchronized(hashtable)
		{
			Iterator<Entry<String, String>> it = this.hashtable.entrySet().iterator();
			while (it.hasNext())
			{
				Entry<String, String> entry = it.next();
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

	}

}
