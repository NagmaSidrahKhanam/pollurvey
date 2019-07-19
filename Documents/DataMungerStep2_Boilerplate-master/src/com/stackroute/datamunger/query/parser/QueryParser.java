package com.stackroute.datamunger.query.parser;

/*There are total 4 DataMungerTest file:
 * 
 * 1)DataMungerTestTask1.java file is for testing following 4 methods
 * a)getBaseQuery()  b)getFileName()  c)getOrderByClause()  d)getGroupByFields()
 * 
 * Once you implement the above 4 methods,run DataMungerTestTask1.java
 * 
 * 2)DataMungerTestTask2.java file is for testing following 2 methods
 * a)getFields() b) getAggregateFunctions()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask2.java
 * 
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getRestrictions()  b)getLogicalOperators()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 * 
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

public class QueryParser {

	private QueryParameter queryParameter = new QueryParameter();

	/*
	 * This method will parse the queryString and will return the object of
	 * QueryParameter class
	 */

	public QueryParameter parseQuery(String queryString) {

		queryParameter.setFile(getFileName(queryString));
		queryParameter.setBaseQuery(getBaseQuery(queryString));
		queryParameter.setOrderByFields(getOrderByFields(queryString));
		queryParameter.setGroupByFields(getGroupByFields(queryString));
		queryParameter.setFields(getFields(queryString));
		queryParameter.setLogicalOperators(getLogicalOperators(queryString));
		queryParameter.setAggregateFunctions(getAggregateFunctions(queryString));
		queryParameter.setRestrictions(getRestrictions(queryString));
		return queryParameter;
	}

	public String[] getSplitStrings(String queryString) {
		queryString = queryString.toLowerCase();
		String [] arrofStr = queryString.split(" ",-1);

		return arrofStr;
	}

	public String getFileName(String queryString) {

		int pos1 = queryString.indexOf("from") +5;
		int pos2 = queryString.indexOf("csv") +3;
		queryString= queryString.substring(pos1,pos2);
		return queryString;
	}


	public String getBaseQuery(String queryString) {

		int pos1 = queryString.indexOf("from") + 5;
		int pos2 = queryString.indexOf(" ",pos1);
		if(pos2 == -1)
			pos2 = queryString.length();
		queryString = queryString.substring(0,pos2);
		return queryString;
	}





	public List<String> getFields(String queryString) {

		List<String> requiredfields = Arrays.asList(queryString.split("select")[1].trim().split("from")[0].split("[\\s,]+"));

		for(String field : requiredfields)
		{
//			System.out.println(field);
		}
		return requiredfields;

	}



	public List<String> getOrderByFields(String queryString) {
		if (queryString.contains("order by")) {

		String [] arrofStr = queryString.split("order by")[1].trim().split(" ");
//			List<String> arrofStr = Arrays.asList(queryString.split("order by")[1].trim().split(" "));

			List<String> arrofStr1 = new ArrayList<>(arrofStr.length);
		for(String arr : arrofStr)
		{
			arrofStr1.add(arr);
		}

		return arrofStr1;
		}
		else
		{
			return null;
		}
	}


	public List<String> getGroupByFields(String queryString) {

		String str;
		int len = queryString.length();
		List<String> demo = new ArrayList<>();
		if (queryString.contains("group by")) {
			int index = queryString.lastIndexOf("group by");
			if (queryString.contains("order by")) {
				int orderindex = queryString.indexOf("order by");
				str = queryString.substring(index + 9, orderindex);
			} else {
				str = queryString.substring(index + 9, len);
			}
			List<String> result = Arrays.asList(str.split(" "));
			return  result;

		} else {
			return null;
		}

	}


	public ArrayList<Restriction> getRestrictions(String queryString) {
		String query = queryString;
		String[] conditions = null;
		ArrayList<Restriction> restrictionList = null;
		if(query.contains("where")) {
			String conditionQuery = query.split("where|group by|order by")[1].trim();
			conditions = conditionQuery.split(" and | or ");

			restrictionList = new ArrayList<Restriction>();

			for(int i = 0; i < conditions.length; i++) {
				if(conditions[i].contains("'")) {
					String var = conditions[i].split(" ")[0];
					String restriction[] = conditions[i].split("'");
					Restriction r = new Restriction(var.trim(),restriction[1].trim(),restriction[0].trim().split(" ")[1]);
					restrictionList.add(r);
				}
				else {
					String restriction[] = conditions[i].split(" ");
					Restriction r = new Restriction(restriction[0].trim(),restriction[2].trim(),restriction[1].trim());
					restrictionList.add(r);
				}
			}
		}

		return restrictionList;
	}


	public ArrayList<String> getLogicalOperators(String queryString) {
		String str = queryString.toLowerCase();
		String[] strAndOr = null;
		ArrayList<String> list = new ArrayList<String>();
		if(str.contains("where")) {
			String strwhere = str.split("where")[1].trim();
			strAndOr = strwhere.split(" ");
			for(int i = 0;i < strAndOr.length;i++) {
				if(strAndOr[i].equals("and")||strAndOr[i].equals("or")) {
					list.add(strAndOr[i]);
				}
			}
			return list;
		}
		else {
			return null;
		}
	}



	public ArrayList<AggregateFunction> getAggregateFunctions(String queryString) {
//		System.out.println(queryString);
		String strFrom = queryString.toLowerCase().split("from")[0].trim();
		String strSelect = strFrom.split("select")[1].trim();
		String[] strFieldsAndAggrfunc = strSelect.split(",");
		ArrayList<String> myAggrFuncList = new  ArrayList<String>();
		ArrayList<AggregateFunction> list = new  ArrayList<AggregateFunction>();
		for(int i = 0;i < strFieldsAndAggrfunc.length;i++) {
			if(strFieldsAndAggrfunc[i].contains("(")) {
				myAggrFuncList.add(strFieldsAndAggrfunc[i].trim());
			}
		}
		int listSize = myAggrFuncList.size();
		if(listSize == 0) {
			return null;
		}else {
			for(int i=0;i<listSize;i++) {
				String[] aggrFuncArray = myAggrFuncList.get(i).split("\\(|\\)");
				AggregateFunction af = new AggregateFunction(aggrFuncArray[1], aggrFuncArray[0]);
				list.add(af);
			}
			return list;
		}
	}

	/*
	 * Extract the name of the file from the query. File name can be found after the
	 * "from" clause.
	 */

	/*
	 * 
	 * Extract the baseQuery from the query.This method is used to extract the
	 * baseQuery from the query string. BaseQuery contains from the beginning of the
	 * query till the where clause
	 */

	/*
	 * extract the order by fields from the query string. Please note that we will
	 * need to extract the field(s) after "order by" clause in the query, if at all
	 * the order by clause exists. For eg: select city,winner,team1,team2 from
	 * data/ipl.csv order by city from the query mentioned above, we need to extract
	 * "city". Please note that we can have more than one order by fields.
	 */

	/*
	 * Extract the group by fields from the query string. Please note that we will
	 * need to extract the field(s) after "group by" clause in the query, if at all
	 * the group by clause exists. For eg: select city,max(win_by_runs) from
	 * data/ipl.csv group by city from the query mentioned above, we need to extract
	 * "city". Please note that we can have more than one group by fields.
	 */

	/*
	 * Extract the selected fields from the query string. Please note that we will
	 * need to extract the field(s) after "select" clause followed by a space from
	 * the query string. For eg: select city,win_by_runs from data/ipl.csv from the
	 * query mentioned above, we need to extract "city" and "win_by_runs". Please
	 * note that we might have a field containing name "from_date" or "from_hrs".
	 * Hence, consider this while parsing.
	 */

	/*
	 * Extract the conditions from the query string(if exists). for each condition,
	 * we need to capture the following: 1. Name of field 2. condition 3. value
	 * 
	 * For eg: select city,winner,team1,team2,player_of_match from data/ipl.csv
	 * where season >= 2008 or toss_decision != bat
	 * 
	 * here, for the first condition, "season>=2008" we need to capture: 1. Name of
	 * field: season 2. condition: >= 3. value: 2008
	 * 
	 * the query might contain multiple conditions separated by OR/AND operators.
	 * Please consider this while parsing the conditions.
	 * 
	 */

	/*
	 * Extract the logical operators(AND/OR) from the query, if at all it is
	 * present. For eg: select city,winner,team1,team2,player_of_match from
	 * data/ipl.csv where season >= 2008 or toss_decision != bat and city =
	 * bangalore
	 * 
	 * The query mentioned above in the example should return a List of Strings
	 * containing [or,and]
	 */

	/*
	 * Extract the aggregate functions from the query. The presence of the aggregate
	 * functions can determined if we have either "min" or "max" or "sum" or "count"
	 * or "avg" followed by opening braces"(" after "select" clause in the query
	 * string. in case it is present, then we will have to extract the same. For
	 * each aggregate functions, we need to know the following: 1. type of aggregate
	 * function(min/max/count/sum/avg) 2. field on which the aggregate function is
	 * being applied.
	 * 
	 * Please note that more than one aggregate function can be present in a query.
	 * 
	 * 
	 */

}