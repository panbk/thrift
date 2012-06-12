package com.baidu.test;

import java.util.Hashtable;

public class HashTableWrite implements Runnable {


	private Hashtable<String, String> hashtable;

	public HashTableWrite(Hashtable<String, String> hashtable)
	{
		this.hashtable = hashtable;
	}

	@Override
	public void run()
	{
		for (int index = 0; index < 10; index++)
		{
			this.hashtable.put(String.valueOf(index), String.valueOf(index * index));
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

	}

}
