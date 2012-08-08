package com.feature.chart.client.gin;

import com.feature.chart.client.presenter.ChartPresenter;
import com.feature.chart.client.presenter.IChartPresenter;
import com.feature.chart.client.presenter.IChartPresenter.IChartView;
import com.feature.chart.client.styles.Resources;
import com.feature.chart.client.view.ChartView;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class ChartGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(IChartPresenter.class).to(ChartPresenter.class);
		bind(IChartView.class).to(ChartView.class).in(Singleton.class);
		//CSS
	      bind(Resources.class).toProvider(ClientBundleProvider.class).in(Singleton.class);

	 }

}
