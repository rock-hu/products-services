package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other Fee/charge type which is not available in the standard code set
 */

@Schema(description = "Other Fee/charge type which is not available in the standard code set")
@Getter
@Setter
public class OtherFeeType1 implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Categorisation of fees and charges into standard categories.
	 */
	public enum FeeCategoryEnum {
		OTHER("Other"),

		SERVICING("Servicing");

		private String value;

		FeeCategoryEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static FeeCategoryEnum fromValue(String text) {
			for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
