package com.converter.feature.client.presenter;


import com.converter.feature.client.utils.ValidateIpAddress;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;

/**
 * @author vijay
 *
 */
public class IpConverterPresenterImpl implements IpConverterPresenter{

	/**
	 * The view implementation wrapped by the view contract.
	 *  @author Vijay
	 */
	private final IpConverterView view;

	/**
	 * Default constructor. It creates a view and initializes it
	 */
	@Inject
	public IpConverterPresenterImpl(IpConverterView view) {
		this.view = view;
		// Tell the view that we are now the controlling presenter; note that we can't just inject the
		// presenter into the view as well as injecting the view into the presenter as GIN is not able to
		// handle the cyclic / recursive relationship correctly.
		this.view.setPresenter(this);
	}

	/**
	 * Returns the view
	 */
	@Override
	public IpConverterView getView() {
		return view;
	}

	/**
	 * Function to receive ipAddress from the UI check if it is legitimate 
	 * and then convert it to decimal form and return it back to UI
	 *
	 * @return void
	 */
	@Override
	public void updatePresenter(String ipAddress) {
		ValidateIpAddress validateIpAddress = new ValidateIpAddress();
		if(validateIpAddress.validateAnIpAddressWithRegularExpression(ipAddress))
		{
			String[] addrArray = ipAddress.split("\\.");
			long decimal = 0;
			for (int i = 0; i < addrArray.length; i++)
			{
				int power = 3 - i;
				decimal += ((Integer.parseInt(addrArray[i]) % 256 * Math.pow(256, power)));
			}
			String binaryOctet = "";
			for(String string:addrArray){
				int octet = Integer.parseInt(string);
				binaryOctet += Integer.toBinaryString(octet);
				binaryOctet += ".";
			}
			view.updateUI(decimal,binaryOctet);
		}
		else
			Window.alert("IP Address is invalid");		
	}

}
