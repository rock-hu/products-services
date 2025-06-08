package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */

@Schema(description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@Getter
@Setter
public class OBBCAData1OtherFeesCharges implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * TariffType which defines the fee and charges.
	 */
	public enum TariffTypeEnum {
		ELECTRONIC("Electronic"),

		MIXED("Mixed"),

		OTHER("Other");

		private String value;

		TariffTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static TariffTypeEnum fromValue(String text) {
			for (TariffTypeEnum b : TariffTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
