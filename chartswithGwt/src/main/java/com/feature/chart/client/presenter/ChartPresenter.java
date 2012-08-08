package com.feature.chart.client.presenter;

import com.feature.chart.client.loadChart.LoadChart;
import com.google.inject.Inject;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;

public class ChartPresenter implements IChartPresenter {
	private final IChartView view;

	@Inject
	public ChartPresenter(IChartView view){
		this.view = view;
		this.view.setPresenter(this);		
	}

	@Override
	public IChartView getView() {
		return view;
	}

	@Override
	public void createAPI(final String chartType) {		
		// Create the API Loader
			ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
			chartLoader.loadApi(new Runnable() {	
				@Override
				public void run() {
					LoadChart loadChart = new LoadChart();
					view.getSimpleLayoutPanel().setWidget(loadChart.getPieChart(chartType));
					loadChart.drawPieChart(chartType);
				}
			});
				
	}
}

