package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
 */

@Schema(description = "RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap implements Serializable {
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
