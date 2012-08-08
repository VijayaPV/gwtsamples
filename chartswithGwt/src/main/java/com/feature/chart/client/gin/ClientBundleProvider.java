package com.feature.chart.client.gin;

import com.feature.chart.client.styles.Resources;
import com.google.gwt.core.client.GWT;
import com.google.inject.Provider;

public class ClientBundleProvider  implements Provider<Resources>{

	private static Resources chartSyles;
	@Override
	public Resources get() {
		// TODO Auto-generated method stub
		if(chartSyles == null)
		{
			chartSyles = GWT.create(Resources.class);
			chartSyles.styleCss().ensureInjected();
		}
		return chartSyles;
	}

}
