package com.oracle.learning.creational.builder;

public class Expense {
	private long expense_id;
	private long person_id;
	private String currency_code;
	private String country_code;
	private Double receipt_amount;
	private String expense_cateory;
	private String business_unit;
	
	public Expense() {}
	
	public static class ExpenseBuilder {
		private long expense_id;
		private long person_id;
		private String currency_code;
		private String country_code;
		private Double receipt_amount;
		private String expense_cateory;
		private String business_unit;
		
		public ExpenseBuilder() {}
		public ExpenseBuilder ExpenseId(long expense_id) {
			this.expense_id = expense_id;
			return this;
		}
		
		public ExpenseBuilder PersonId(long person_id) {
			this.person_id = person_id;
			return this;
		}
		
		public ExpenseBuilder businessUnit(String bu) {
			this.business_unit = bu;
			return this;
		}
		
		public ExpenseBuilder expenseCategory(String category) {
			this.expense_cateory = category;
			return this;
		}
		
		public Expense build() {
			Expense e = new Expense();
			e.expense_id = this.expense_id;
			e.person_id = this.person_id;
			return e;
		}
		
	} 

	public Expense(long expense_id, long person_id, String currency_code, String country_code, Double receipt_amount,
			String expense_cateory, String bu) {
		super();
		this.expense_id = expense_id;
		this.person_id = person_id;
		this.currency_code = currency_code;
		this.country_code = country_code;
		this.receipt_amount = receipt_amount;
		this.expense_cateory = expense_cateory;
		this.business_unit = bu;
	}
	public String getInstance(String str) {
		return null;
	}
	
	public String getInstance() {
		return getInstance(null);
	}
	
	public Expense(long expense_id, long person_id, String currency_code, String country_code, Double receipt_amount,
			String expense_cateory) {
		this(expense_id, person_id, currency_code, country_code, receipt_amount, expense_cateory, "");
	}
}