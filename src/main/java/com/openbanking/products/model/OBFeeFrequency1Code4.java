package com.openbanking.products.model;

/**
 * Period e.g. day, week, month etc. for which the fee/charge is capped
 */
public enum OBFeeFrequency1Code4 {
	FEAC("FEAC"), FEAO("FEAO"), FECP("FECP"), FEDA("FEDA"), FEHO("FEHO"), FEI("FEI"), FEMO("FEMO"), FEOA("FEOA"), FEOT("FEOT"), FEPC("FEPC"), FEPH("FEPH"),
	FEPO("FEPO"), FEPS("FEPS"), FEPT("FEPT"), FEPTA("FEPTA"), FEPTP("FEPTP"), FEQU("FEQU"), FESM("FESM"), FEST("FEST"), FEWE("FEWE"), FEYE("FEYE");

	private String value;

	OBFeeFrequency1Code4(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OBFeeFrequency1Code4 fromValue(String text) {
		for (OBFeeFrequency1Code4 b : OBFeeFrequency1Code4.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
