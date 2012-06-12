package com.baidu.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest
{
	public static void main(String[] args)
	{
		Set<String> sets = new HashSet<String>();
		for (int index = 0; index < 10; index++)
		{
			sets.add(String.valueOf(index));
		}

		System.out.println(Arrays.asList(sets));
	}

}
