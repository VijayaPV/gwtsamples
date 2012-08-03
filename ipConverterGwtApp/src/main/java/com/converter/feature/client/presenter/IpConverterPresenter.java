package com.converter.feature.client.presenter;



import com.google.gwt.user.client.ui.IsWidget;


/**
 * @author vijay
 *
 */
public interface IpConverterPresenter {
	//Start of Sub Interface
	public interface IpConverterView extends IsWidget {
		/**
		 * Gives the view a reference to its current controlling presenter. At runtime the view will generally
		 * just be created once as views are expensive to create; however, the presenter may be thrown away,
		 * presenters are cheaper to (re)create.
		 * <p/>
		 * The view will overwrite its reference to any previous presenter and use the new presenter reference
		 * when performing delegation of UI events, etc.
		 *
		 * @param presenter The presenter to use for all new delegations.
		 */
		public void setPresenter(IpConverterPresenter presenter);
		/**
		 * UI receives update of the decimal from presenter
		 * <p/>
		 */
		public void updateUI(long decimal,String binaryOctet);
	} //End of Sub Interface
	/**
	 * The presenter may be asked to return its view so that its parent can add the view to its own view; this
	 * way the parent view's get to decide where their children should be added instead of the children adding
	 * themselves directly to the DOM.
	 * <p/>
	 * This is especially useful when GIN is used as the presenter will get the view automatically injected
	 * into it instead of having the parent presenter / controller creating it and then passing it to the
	 * presenter.
	 *
	 * @return The view.
	 */
	public IpConverterView getView();
	/**
	 * send update of the ipAddress from UI to the presenter
	 * <p/>
	 */
	public void updatePresenter(String ipAddress);

}
