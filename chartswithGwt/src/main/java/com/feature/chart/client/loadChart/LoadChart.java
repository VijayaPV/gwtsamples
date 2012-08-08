package com.feature.chart.client.loadChart;

import com.feature.chart.client.options.ChartOptions;
import com.feature.chart.client.utils.ChartData;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.corechart.BarChart;
import com.googlecode.gwt.charts.client.corechart.BubbleChart;
import com.googlecode.gwt.charts.client.corechart.ColumnChart;
import com.googlecode.gwt.charts.client.corechart.PieChart;
import com.googlecode.gwt.charts.client.corechart.ScatterChart;

public class LoadChart {	
	private PieChart pieChart;
	private BarChart barChart;
	private BubbleChart bubbleChart;
	private ColumnChart columnChart;
	private ScatterChart scatterChart;

	public Widget getPieChart(String chartType) {
		if(chartType == "pieChart"){
			if (pieChart == null) {
				pieChart = new PieChart();
			}
			return pieChart;
		}
		if(chartType =="barChart"){
			if (barChart == null) {
				barChart = new BarChart();
			}
			return barChart;
		}
		if(chartType == "clmChart"){
			if (columnChart == null) {
				columnChart = new ColumnChart();
			}
			return columnChart;
		}
		if(chartType =="bubbleChart"){
			if (bubbleChart == null) {
				bubbleChart = new BubbleChart();
			}
			return bubbleChart;
		}
		if(chartType =="scatterChart"){
			if (scatterChart == null) {
				scatterChart = new ScatterChart();
			}
			return scatterChart;
		}
		return null;
	}


	public void drawPieChart(String chartType) {
		ChartData chartData = new ChartData();
		ChartOptions chartOptions = new ChartOptions();
		// Draw the chart
		if(chartType == "pieChart")
			pieChart.draw(chartData.writeData(chartType),chartOptions.setPieChartOptions());
		else if(chartType =="barChart")
			barChart.draw(chartData.writeData(chartType),chartOptions.setBarChartOptions());
	
		else if(chartType =="bubbleChart")
			bubbleChart.draw(chartData.writeData(chartType),chartOptions.setBubbleChartOptions());
	
		else if(chartType =="clmChart")
			columnChart.draw(chartData.writeData(chartType),chartOptions.setColumnChartOptions());
	
		else if(chartType =="scatterChart")
			scatterChart.draw(chartData.writeData(chartType),chartOptions.setScatterChartOptions());
	
	}

}
