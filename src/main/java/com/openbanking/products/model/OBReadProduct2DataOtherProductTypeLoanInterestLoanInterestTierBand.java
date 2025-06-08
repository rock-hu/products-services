package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Tier Band Details
 */

@Schema(description = "Tier Band Details")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The unit of period (days, weeks, months etc.) of the Minimum Term
	 */
	public enum MinTermPeriodEnum {
		PACT("PACT"),

		PDAY("PDAY"),

		PHYR("PHYR"),

		PMTH("PMTH"),

		PQTR("PQTR"),

		PWEK("PWEK"),

		PYER("PYER");

		private String value;

		MinTermPeriodEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static MinTermPeriodEnum fromValue(String text) {
			for (MinTermPeriodEnum b : MinTermPeriodEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * The unit of period (days, weeks, months etc.) of the Maximum Term
	 */
	public enum MaxTermPeriodEnum {
		PACT("PACT"),

		PDAY("PDAY"),

		PHYR("PHYR"),

		PMTH("PMTH"),

		PQTR("PQTR"),

		PWEK("PWEK"),

		PYER("PYER");

		private String value;

		MaxTermPeriodEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static MaxTermPeriodEnum fromValue(String text) {
			for (MaxTermPeriodEnum b : MaxTermPeriodEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate
	 * payable for the SME Loan.
	 */
	public enum LoanProviderInterestRateTypeEnum {
		INBB("INBB"),

		INFR("INFR"),

		INGR("INGR"),

		INLR("INLR"),

		INNE("INNE"),

		INOT("INOT");

		private String value;

		LoanProviderInterestRateTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static LoanProviderInterestRateTypeEnum fromValue(String text) {
			for (LoanProviderInterestRateTypeEnum b : LoanProviderInterestRateTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
