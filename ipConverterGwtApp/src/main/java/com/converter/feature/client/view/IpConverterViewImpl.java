package com.converter.feature.client.view;

import com.converter.feature.client.presenter.IpConverterPresenter;
import com.converter.feature.client.presenter.IpConverterPresenter.IpConverterView;
import com.converter.feature.client.utils.NumbersDotOnly;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * View impl for IpConverter. It extends the Composite and implements IpConverterView
 *
 * @author Vijay
 * 
 */
public class IpConverterViewImpl extends Composite implements IpConverterView {

	// Annotation not needed as we use the default but this allows to change the path
	@UiTemplate("IpConverterViewImpl.ui.xml")
	interface Binder extends UiBinder<Widget, IpConverterViewImpl> {
	}
	@UiField
	TextBox input;
	@UiField
	TextBox result;

	/**
	 * A reference to the presenter that is currently controlling the view.
	 */
	private IpConverterPresenter presenter;
	private static final Binder binder = GWT.create(Binder.class);

	/**
	 * Default constructor. It sets the values on initialize
	 * 
	 */
	public IpConverterViewImpl() {
		initWidget(binder.createAndBindUi(this));
		input.addKeyPressHandler(new NumbersDotOnly());	         
	}

	/**
	 * Constructor to set the presenter.
	 */
	@Override
	public void setPresenter(IpConverterPresenter presenter) {
		this.presenter = presenter;		
	}

	/**
	 * Update the UI with value received from the presenter.
	 */
	@Override
	public void updateUI(long decimal) {
		result.setText("http://"+decimal);
	}

	/**
	 * UI handler.
	 * Send the value input by the user to the presenter
	 */
	@UiHandler("convert")
	public void onConvertClick(ClickEvent event){
		presenter.updatePresenter(input.getText());		
	}

	/**
	 * UI handler.
	 * Reset the textboxes
	 */
	@UiHandler("reset")
	public void onReset(ClickEvent event){
		input.setText("");
		result.setText("");			
	}	
}
