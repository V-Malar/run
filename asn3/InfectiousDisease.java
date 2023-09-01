package asn3;

import java.io.Serializable;

public class InfectiousDisease extends Disease  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -500067877761022286L;

	@Override
	public String[] getExamples() {
		return new String[] {"Corona", "Cold", "Cough", "Fever"};
	}

}
