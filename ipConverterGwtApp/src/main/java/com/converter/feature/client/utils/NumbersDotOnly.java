package com.converter.feature.client.utils;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author vijay
 *
 */
public class NumbersDotOnly implements KeyPressHandler {

	/**
	 * Function to check only numbers and dot are permitted in the TextBox
	 * on key press we check for the charcode from 48 to 57 which represents numbers(0-9) and 46 which is a dot 
	 * and only allow them to get entered in the textbox
	 * firefox for some reason considers non character keys as KeyPressEvent so i am checking specifically for keys
	 * like DELETE, BACKSPACE, LEFT and RIGHT arrows and allow the event associated with these keys to propagate in the textbox
	 */

	@Override
	public void onKeyPress(KeyPressEvent event) {
		int keyCode = event.getUnicodeCharCode();
		if(keyCode==0)//firefox
			keyCode = event.getNativeEvent().getKeyCode();		
		if (!((event.getCharCode() >= 48 && event.getCharCode() <= 57) || event.getCharCode() == 46||
				keyCode == KeyCodes.KEY_DELETE||keyCode==KeyCodes.KEY_BACKSPACE||keyCode==KeyCodes.KEY_LEFT||keyCode==KeyCodes.KEY_RIGHT))
			((TextBox)event.getSource()).cancelKey();		  
	}


}
