package com.openbanking.products.model;

/**
 * How often is the overdraft fee/charge calculated for the account.
 */
public enum OBFeeFrequency1Code1 {
	FEAC("FEAC"), FEAO("FEAO"), FECP("FECP"), FEDA("FEDA"), FEHO("FEHO"), FEI("FEI"), FEMO("FEMO"), FEOA("FEOA"), FEOT("FEOT"), FEPC("FEPC"), FEPH("FEPH"),
	FEPO("FEPO"), FEPS("FEPS"), FEPT("FEPT"), FEPTA("FEPTA"), FEPTP("FEPTP"), FEQU("FEQU"), FESM("FESM"), FEST("FEST"), FEWE("FEWE"), FEYE("FEYE");

	private String value;

	OBFeeFrequency1Code1(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OBFeeFrequency1Code1 fromValue(String text) {
		for (OBFeeFrequency1Code1 b : OBFeeFrequency1Code1.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
