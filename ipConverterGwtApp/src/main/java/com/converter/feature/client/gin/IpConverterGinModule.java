package com.converter.feature.client.gin;

import com.converter.feature.client.presenter.IpConverterPresenter;
import com.converter.feature.client.presenter.IpConverterPresenterImpl;
import com.converter.feature.client.presenter.IpConverterPresenter.IpConverterView;
import com.converter.feature.client.view.IpConverterViewImpl;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

/**
 * @author vijay
 *
 */
public class IpConverterGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		//Configuration with GinModule to implement MVP
	    bind(IpConverterPresenter.class).to(IpConverterPresenterImpl.class);
	    bind(IpConverterView.class).to(IpConverterViewImpl.class).in(Singleton.class);		
	}
}
