package com.oracle.learning.creational.builder;

import com.oracle.learning.creational.builder.Expense.ExpenseBuilder;

public class Client {
	public static void main(String[] args) {
		//Expense e = new Expense(expense_id, person_id, currency_code, country_code, receipt_amount, expense_cateory)
		Expense.ExpenseBuilder builder = new Expense.ExpenseBuilder();
		
		
		Expense e = builder.PersonId(1234)
							.ExpenseId(15234)
							.expenseCategory("")
							.build();
		
		StringBuilder sb = new StringBuilder();
		
		String str = sb.append("My First Text")
			.append("My second text")
			.toString();
		
		
		
		Expense e1 = GenericBuilder.of(Expense::new)
									.build();
	}
}
