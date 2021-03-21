/*
package com.homework.task30;

import java.io.Console;
import java.util.*;

public class Program
{
	public static void main(String[] args)
	{
		ATM atm = new ATM();
		atm.Add(7, 10);
		atm.Add(5, 10);
		atm.Add(3, 10);
		int amount;
		String val;
		do
		{
			System.out.print("Введите требуемую сумму: ");
			val = new Scanner(System.in).nextLine();
			if (val.length() == 0)
			{
				return;
			}

		} while (!tangible.TryParseHelper.tryParseInt(val, amount));
		try
		{
			HashMap<Integer, Integer> result = atm.Withdraw(amount);
			System.out.printf("%1$s = ", amount);
			for (Map.Entry<Integer, Integer> kvp : result.entrySet())
			{
				System.out.printf("%2$s купюр по %1$s, ", kvp.getKey(), kvp.getValue());
			}
		}
		catch (RuntimeException ex)
		{
			Console.ForegroundColor = ConsoleColor.Red;
			System.out.println(ex.getMessage());
			Console.ResetColor();
		}
		System.in.read();
	}
}*/
