package com.feature.chart.client;

import com.feature.chart.client.gin.IChartInjector;
import com.feature.chart.client.presenter.IChartPresenter;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ChartOnEntry implements EntryPoint {
	@Override
	public void onModuleLoad() {
		RootLayoutPanel rootPanel = RootLayoutPanel.get();
		IChartInjector injector = GWT.create(IChartInjector.class);
		IChartPresenter ipChartPresenter = injector.getPresenter();
		rootPanel.add(ipChartPresenter.getView());
	}
}


