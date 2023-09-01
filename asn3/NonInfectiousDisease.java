package asn3;

import java.io.Serializable;

public class NonInfectiousDisease extends Disease  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 714397575429177708L;

	@Override
	public String[] getExamples() {
		return new String[] {"Cancer", "BP", "Back Pain", "Head Pain"};
	}

}
