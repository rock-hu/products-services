package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 */

@Schema(description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeFeeChargeCap implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Fee/charge type which is being capped
	 */
	public enum FeeTypeEnum {
		FEPF("FEPF"),

		FTOT("FTOT"),

		FYAF("FYAF"),

		FYAM("FYAM"),

		FYAQ("FYAQ"),

		FYCP("FYCP"),

		FYDB("FYDB"),

		FYMI("FYMI"),

		FYXX("FYXX");

		private String value;

		FeeTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static FeeTypeEnum fromValue(String text) {
			for (FeeTypeEnum b : FeeTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
