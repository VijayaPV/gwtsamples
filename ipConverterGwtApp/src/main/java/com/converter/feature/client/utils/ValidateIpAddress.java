package com.converter.feature.client.utils;

import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;

/**
 * @author vijay
 *
 */
public class ValidateIpAddress {
	private static final String IPADDRESS_PATTERN = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";


	/**
	 * Function to validate the IP address entered by the user
	 * @return boolean 
	 */
	public boolean validateAnIpAddressWithRegularExpression(String ipAddress) {  
		final RegExp IP_PATTERN = RegExp.compile(IPADDRESS_PATTERN);				  
		MatchResult matcher = IP_PATTERN.exec(ipAddress);
		boolean matchFound = (matcher !=null);
		return matchFound;
	}  
}
