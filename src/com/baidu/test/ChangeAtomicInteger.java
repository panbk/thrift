package com.baidu.test;

import java.util.concurrent.atomic.AtomicInteger;

public class ChangeAtomicInteger implements Runnable
{
	private AtomicInteger index;
	public ChangeAtomicInteger(AtomicInteger index)
	{
		this.index =  index;
	}

	@Override
	public void run()
	{
		// boolean status = index.compareAndSet(Integer.MAX_VALUE, 0);
		// System.out.println("ÉèÖÃ 0 ×´Ì¬ £º" + status);

		for (int i = 0; i < 10; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			int nextIndex = index.getAndIncrement();
			System.out.println(Math.abs(nextIndex % 50));
		}
	}

}
