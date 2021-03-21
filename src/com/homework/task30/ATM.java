/*
package com.homework.task30;

import java.util.*;

public class ATM
{
	public ATM()
	{
		setCash(new HashMap<Integer, Integer>());

	}

	private HashMap<Integer, Integer> Cash;
	public final HashMap<Integer, Integer> getCash()
	{
		return Cash;
	}
	private void setCash(HashMap<Integer, Integer> value)
	{
		Cash = value;
	}

	public final HashMap<Integer, Integer> Withdraw(int amount)
	{
		HashMap<Integer, Integer> r = new HashMap<Integer, Integer>();
		CashWithDraw(getCash(), r, amount);
		r = r.stream().filter(kvp -> kvp.Value != 0).collect(Collectors.toMap(kvp -> kvp.Key, kvp -> kvp.Value));
		return r;
	}

	public final void Add(int value, int count)
	{
		if (getCash().containsKey(value))
		{
			getCash().put(value, getCash().get(value) + count);
		}
		else
		{
			getCash().put(value, count);
		}
	}

	private void CashWithDraw(HashMap<Integer, Integer> source, HashMap<Integer, Integer> result, int amount)
	{

		int change;

		int k = 0;

		if (source.size() > result.size())
		{
			k = source.stream().filter(kvp -> !result.containsKey(kvp.Key)).collect(Collectors.toMap(kvp -> kvp.Key, kvp -> kvp.Value)).keySet().Max();
		}
		else
		{
			throw new RuntimeException("Требуемую сумму невозможно выдать");
		}

		Map.Entry<Integer, Integer> sel = new Map.Entry<Integer, Integer>(k, amount / k);

		if (sel.getValue() > source.get(sel.getKey()))
		{
			change = amount - sel.getKey() * source.get(sel.getKey());
			sel = new Map.Entry<Integer, Integer>(sel.getKey(), source.get(sel.getKey()));
		}
		else
		{
			change = amount - sel.getKey() * sel.getValue();
		}


		if (change == 0)
		{
			result.put(sel.getKey(), sel.getValue());
			return;
		}

		if (change < source.keySet().Min())
		{

			sel = new HashMap<Integer, Integer>()= (HashMap<Integer, Integer>) Map.of(sel.getKey(), sel.getValue() - 1);
			result.put(sel.getKey(), sel.getValue());
			CashWithDraw(source, result, amount - sel.getKey() * sel.getValue());
			return;
		}

		source.put(sel.getKey(), source.get(sel.getKey()) - sel.getValue());
		result.put(sel.getKey(), sel.getValue());

		CashWithDraw(source, result, change);
	}
}*/
