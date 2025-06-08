package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * The group of tiers or bands for which debit interest can be applied.
 */

@Schema(description = "The group of tiers or bands for which debit interest can be applied.")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing
	 * rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier
	 * as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same
	 * interest rate is applied irrespective of the SME Loan balance
	 */
	public enum TierBandMethodEnum {
		INBA("INBA"),

		INTI("INTI"),

		INWH("INWH");

		private String value;

		TierBandMethodEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static TierBandMethodEnum fromValue(String text) {
			for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
