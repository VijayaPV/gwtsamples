package com.converter.feature.client;

import com.converter.feature.client.gin.IpConverterGinInjector;
import com.converter.feature.client.presenter.IpConverterPresenter;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 * @author vijay
 *
 */
public class IpConverterOnLoad implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		// create injector
		IpConverterGinInjector injector = GWT.create(IpConverterGinInjector.class);
		IpConverterPresenter ipConverterPresenter = injector.getPresenter();	   
		//get view
		rootPanel.add(ipConverterPresenter.getView());
	}

}
