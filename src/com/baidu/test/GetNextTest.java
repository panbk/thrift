package com.baidu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class GetNextTest
{
	private static AtomicInteger index = new AtomicInteger(0);

	public static void main(String[] args)
	{
		List<String> sources = new ArrayList<String>();
		int count = 10;
		for (int index = 0; index < count; index++)
		{
			sources.add("Value : " + index);
		}

		while (true)
		{
			try
			{
				System.out.println("下一个...");
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("-----------------------------------------------------");
			System.out.println("顺序下一个 : " + getNextBySequence(sources));
			System.out.println("随机下一个 : " + getNextByRandom(sources));
			System.out.println("-----------------------------------------------------");
		}
	}

	private static String getNextByRandom(List<String> sources)
	{
		Random random = new Random(System.nanoTime());
		int nextIndex = random.nextInt(sources.size());
		return sources.get(nextIndex);
	}

	private static String getNextBySequence(List<String> sources)
	{
		int nextIndex = index.incrementAndGet() % sources.size();
		return sources.get(nextIndex);
	}

}


