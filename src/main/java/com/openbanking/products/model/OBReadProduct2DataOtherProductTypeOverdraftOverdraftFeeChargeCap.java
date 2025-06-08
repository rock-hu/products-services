package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an
 * amount (in gbp), an amount (in items) or a rate.
 */

@Schema(
		description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Fee/charge type which is being capped
	 */
	public enum FeeTypeEnum {
		FBAO("FBAO"),

		FBAR("FBAR"),

		FBEB("FBEB"),

		FBIT("FBIT"),

		FBOR("FBOR"),

		FBOS("FBOS"),

		FBSC("FBSC"),

		FBTO("FBTO"),

		FBUB("FBUB"),

		FBUT("FBUT"),

		FTOT("FTOT"),

		FTUT("FTUT");

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
