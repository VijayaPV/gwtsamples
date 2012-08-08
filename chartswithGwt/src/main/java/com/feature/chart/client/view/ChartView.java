package com.feature.chart.client.view;

import com.feature.chart.client.presenter.IChartPresenter;
import com.feature.chart.client.presenter.IChartPresenter.IChartView;
import com.feature.chart.client.styles.Resources;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ChartView extends Composite implements IChartView{
	@UiTemplate("ChartView.ui.xml")
	interface Binder extends UiBinder<Widget, ChartView> {
	}
	
	private IChartPresenter presenter;
	@UiField
	SimpleLayoutPanel layoutPanel;
		
    
	private static final Binder binder = GWT.create(Binder.class);
	private final Resources resources;
	@Inject
	public ChartView(Resources resources) {
		this.resources = resources;
		initWidget(binder.createAndBindUi(this));		
	}
	
	@Override
	public SimpleLayoutPanel getSimpleLayoutPanel() {
		if (layoutPanel == null) {
			layoutPanel = new SimpleLayoutPanel();
		}
		return layoutPanel;
	}

	@UiHandler("pieBtn")
	public void onPieClick(ClickEvent event){
		presenter.createAPI("pieChart");
	}
	@UiHandler("barBtn")
	public void onBarClick(ClickEvent event){
		presenter.createAPI("barChart");
	}
	@UiHandler("bubbleBtn")
	public void onBubbleClick(ClickEvent event){
		presenter.createAPI("bubbleChart");
	}
	@UiHandler("clmBtn")
	public void onClmClick(ClickEvent event){
		presenter.createAPI("clmChart");
	}
	@UiHandler("scatterBtn")
	public void onScatterClick(ClickEvent event){
		presenter.createAPI("scatterChart");
	}
	
	@Override
	public void setPresenter(IChartPresenter presenter) {
		this.presenter = presenter;		
	}

	@UiFactory
	public Resources getResources() {
		return resources;
	}
}
