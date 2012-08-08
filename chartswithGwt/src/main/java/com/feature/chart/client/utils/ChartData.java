package com.feature.chart.client.utils;

import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataSource;
import com.googlecode.gwt.charts.client.DataTable;

public class ChartData {
	
	public DataSource writeData(String chartType) {
		// Prepare the data		
		if(chartType == "pieChart")
		{
			DataTable dataTable = DataTable.create();
			dataTable.addColumn(ColumnType.STRING, "Name");
			dataTable.addColumn(ColumnType.NUMBER, "Donuts eaten");
			dataTable.addRows(4);
			dataTable.setValue(0, 0, "Raghu");
			dataTable.setValue(1, 0, "Sudheer");
			dataTable.setValue(2, 0, "Velu");
			dataTable.setValue(3, 0, "Hari");
			dataTable.setValue(0, 1, 5);
			dataTable.setValue(1, 1, 7);
			dataTable.setValue(2, 1, 3);
			dataTable.setValue(3, 1, 2);
			return dataTable;
		}
		else if(chartType =="barChart")
		{
			String[] countries = new String[] { "India", "Nepal", "SriLanka", "China" };
			int[] years = new int[] { 2003, 2004, 2005, 2006, 2007, 2008 };
			int[][] values = new int[][] { { 1336060, 1538156, 1576579, 1600652, 1968113, 1901067 },
					{ 400361, 366849, 440514, 434552, 393032, 517206 },
					{ 1001582, 1119450, 993360, 1004163, 979198, 916965 },
					{ 997974, 941795, 930593, 897127, 1080887, 1056036 } };
			DataTable dataTable = DataTable.create();

			dataTable.addColumn(ColumnType.STRING, "Year");
			for (int i = 0; i < countries.length; i++) {
				dataTable.addColumn(ColumnType.NUMBER, countries[i]);
			}
			dataTable.addRows(years.length);
			for (int i = 0; i < years.length; i++) {
				dataTable.setValue(i, 0, String.valueOf(years[i]));
			}
			for (int col = 0; col < values.length; col++) {
				for (int row = 0; row < values[col].length; row++) {
					dataTable.setValue(row, col + 1, values[col][row]);
				}
			}
			return dataTable;
		}
		else if(chartType =="bubbleChart")
		{
			// Prepare the data
			DataTable dataTable = DataTable.create();
			dataTable.addColumn(ColumnType.STRING, "ID");
			dataTable.addColumn(ColumnType.NUMBER, "Life Expectancy");
			dataTable.addColumn(ColumnType.NUMBER, "Fertility Rate");
			dataTable.addColumn(ColumnType.STRING, "Region");
			dataTable.addColumn(ColumnType.NUMBER, "Population");
			dataTable.addRows(4);
			dataTable.setValue(0, 0, "MEX");
			dataTable.setValue(1, 3, "IND");
			dataTable.setValue(2, 0, "SL");
			dataTable.setValue(1, 0, "RSA");
			dataTable.setValue(0, 1, 80.66);
			dataTable.setValue(1, 1, 79.84);
			dataTable.setValue(2, 1, 78.6);
			dataTable.setValue(3, 1, 72.73);
			dataTable.setValue(0, 2, 1.67);
			dataTable.setValue(1, 2, 1.36);
			dataTable.setValue(2, 2, 1.84);
			dataTable.setValue(3, 2, 2.78);
			dataTable.setValue(0, 3, "Central America");
			dataTable.setValue(1, 3, "Asia");
			dataTable.setValue(2, 3, "Asia");
			dataTable.setValue(3, 3, "Africa");
			dataTable.setValue(0, 4, 33739900);
			dataTable.setValue(1, 4, 81902307);
			dataTable.setValue(2, 4, 5523095);
			dataTable.setValue(3, 4, 79716203);
			return dataTable;			
		}
		else if(chartType =="clmChart")
		{
			String[] countries = new String[] { "India", "Nepal", "SriLanka", "China" };
			int[] years = new int[] { 2003, 2004, 2005, 2006, 2007, 2008 };
			int[][] values = new int[][] { { 1336060, 1538156, 1576579, 1600652, 1968113, 1901067 },
					{ 400361, 366849, 440514, 434552, 393032, 517206 },
					{ 1001582, 1119450, 993360, 1004163, 979198, 916965 },
					{ 997974, 941795, 930593, 897127, 1080887, 1056036 } };

			// Prepare the data
			DataTable dataTable = DataTable.create();
			dataTable.addColumn(ColumnType.STRING, "Year");
			for (int i = 0; i < countries.length; i++) {
				dataTable.addColumn(ColumnType.NUMBER, countries[i]);
			}
			dataTable.addRows(years.length);
			for (int i = 0; i < years.length; i++) {
				dataTable.setValue(i, 0, String.valueOf(years[i]));
			}
			for (int col = 0; col < values.length; col++) {
				for (int row = 0; row < values[col].length; row++) {
					dataTable.setValue(row, col + 1, values[col][row]);
				}
			}
			return dataTable;
		}
		else if(chartType =="scatterChart")
		{
			DataTable dataTable = DataTable.create();
			dataTable.addColumn(ColumnType.NUMBER, "X");
			dataTable.addColumn(ColumnType.NUMBER, "Shape 1");
			dataTable.addColumn(ColumnType.NUMBER, "Shape 2");
			dataTable.addRows(1000);
			for (int i = 0; i < 500; ++i) {
				dataTable.setValue(i, 0, Math.sin(i / 5.0) * 0.25);
				dataTable.setValue(i, 1, Math.cos(i / 25.0));
			}
			for (int i = 0; i < 500; i++) {
				dataTable.setValue(i + 500, 0, Math.sin(i / 25.0));
				dataTable.setValue(i + 500, 2, Math.cos(i / 10.0) * 0.5);
			}
			return dataTable;
		}
		return null;			
	}

}
