package com.converter.feature.client.gin;

import com.converter.feature.client.presenter.IpConverterPresenter;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**
 * @author vijay
 *
 */
@GinModules({IpConverterGinModule.class})
public interface IpConverterGinInjector extends Ginjector{
	 public IpConverterPresenter getPresenter(); 
}
