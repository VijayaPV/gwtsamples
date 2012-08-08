package com.feature.chart.client.gin;

import com.feature.chart.client.presenter.IChartPresenter;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules({ChartGinModule.class})
public interface IChartInjector extends Ginjector {	
	public IChartPresenter getPresenter();
}
