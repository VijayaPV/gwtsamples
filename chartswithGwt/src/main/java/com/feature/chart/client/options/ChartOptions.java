package com.feature.chart.client.options;

import com.googlecode.gwt.charts.client.corechart.BarChartOptions;
import com.googlecode.gwt.charts.client.corechart.BubbleChartOptions;
import com.googlecode.gwt.charts.client.corechart.ColumnChartOptions;
import com.googlecode.gwt.charts.client.corechart.PieChartOptions;
import com.googlecode.gwt.charts.client.corechart.ScatterChartOptions;
import com.googlecode.gwt.charts.client.options.HAxis;
import com.googlecode.gwt.charts.client.options.VAxis;

public class ChartOptions {
	
	public PieChartOptions setPieChartOptions(){
		// Set options
		PieChartOptions options = PieChartOptions.create();
		// options.setColors(colors);
		options.setFontName("Tahoma");
		options.setIs3D(true);
		options.setPieResidueSliceColor("#000000");
		options.setPieResidueSliceLabel("Others");
		options.setSliceVisibilityThreshold(0.1);
		options.setTitle("How does pie chart look?");
		return options;
	}
	
	public BarChartOptions setBarChartOptions(){
		// Set options
		BarChartOptions options = BarChartOptions.create();
		options.setFontName("Tahoma");
		options.setTitle("Yearly Coffee Consumption by Country");
		options.setHAxis(HAxis.create("Cups"));
		options.setVAxis(VAxis.create("Year"));
		return options;
	}
	
	public BubbleChartOptions setBubbleChartOptions(){
		// Set options
		BubbleChartOptions options = BubbleChartOptions.create();
		options.setTitle("Correlation between life expectancy, fertility rate and population of some world countries (2010)");
		options.setHAxis(HAxis.create("Life Expectancy"));
		options.setVAxis(VAxis.create("Fertility Rate"));
		return options;
	}	
	public ColumnChartOptions setColumnChartOptions(){
		// Set options
		ColumnChartOptions options = ColumnChartOptions.create();
		options.setFontName("Tahoma");
		options.setTitle("Yearly Coffee Consumption by Country");
		options.setHAxis(HAxis.create("Cups"));
		options.setVAxis(VAxis.create("Year"));
		return options;
	}
	
	public ScatterChartOptions setScatterChartOptions(){
		// Set options
		ScatterChartOptions options = ScatterChartOptions.create();
		options.setBackgroundColor("#f0f0f0");
		options.setFontName("Tahoma");
		options.setTitle("Cool shapes");
		options.setHAxis(HAxis.create("X"));
		options.setVAxis(VAxis.create("Y"));
		return options;
	}	

}
