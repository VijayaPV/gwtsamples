package com.feature.chart.client.presenter;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;

public interface IChartPresenter {
	public interface IChartView extends IsWidget  {
		public void setPresenter(IChartPresenter presenter);
		public SimpleLayoutPanel getSimpleLayoutPanel();		
	}

	public IChartView getView();
	public void createAPI(String chartType);
}
