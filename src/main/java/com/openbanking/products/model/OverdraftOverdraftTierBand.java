package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Provides overdraft details for a specific tier or band
 */

@Schema(description = "Provides overdraft details for a specific tier or band")
@Getter
@Setter
public class OverdraftOverdraftTierBand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Specifies the period of a fixed length overdraft agreement
	 */
	public enum AgreementPeriodEnum {
		DAY("Day"),

		HALF_YEAR("Half Year"),

		MONTH("Month"),

		QUARTER("Quarter"),

		WEEK("Week"),

		YEAR("Year");

		private String value;

		AgreementPeriodEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AgreementPeriodEnum fromValue(String text) {
			for (AgreementPeriodEnum b : AgreementPeriodEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is £2k and
	 * the interest tiers are:- 0-£500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either
	 * be 0.5% of the entire balance (since the account balance sits in the top interest tier) or
	 * (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the ‘Whole’ of the account
	 * balance, and in the 2nd that it is ‘Tiered’.
	 */
	public enum OverdraftInterestChargingCoverageEnum {
		BANDED("Banded"),

		TIERED("Tiered"),

		WHOLE("Whole");

		private String value;

		OverdraftInterestChargingCoverageEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static OverdraftInterestChargingCoverageEnum fromValue(String text) {
			for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
