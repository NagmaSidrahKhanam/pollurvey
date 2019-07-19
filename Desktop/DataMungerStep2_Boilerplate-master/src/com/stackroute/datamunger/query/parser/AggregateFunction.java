package com.stackroute.datamunger.query.parser;

/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * generate getter and setter for this class,
 * Also override toString method
 * */

public class AggregateFunction {
	String field;
	String function;
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}



	// Write logic for constructor
	public AggregateFunction(String field, String function) {

	}

	@java.lang.Override
	public java.lang.String toString() {
		return "AggregateFunction{" +
				"field='" + field + '\'' +
				", function='" + function + '\'' +
				'}';
	}
}