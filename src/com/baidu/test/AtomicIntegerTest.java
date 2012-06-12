package com.baidu.test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest
{
	public static void main(String[] args)
	{
		AtomicInteger currentIndex = new AtomicInteger(Integer.MAX_VALUE - 1);

		for (int i = 0; i < 100; i++)
		{
			Thread thread = new Thread(new ChangeAtomicInteger(currentIndex));
			thread.start();
		}




	}

}
