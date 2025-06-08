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
public class CreditInterestTierBand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * How often is credit interest calculated for the account.
	 */
	public enum CalculationFrequencyEnum {
		DAILY("Daily"),

		HALFYEARLY("HalfYearly"),

		MONTHLY("Monthly"),

		OTHER("Other"),

		QUARTERLY("Quarterly"),

		PERSTATEMENTDATE("PerStatementDate"),

		WEEKLY("Weekly"),

		YEARLY("Yearly");

		private String value;

		CalculationFrequencyEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static CalculationFrequencyEnum fromValue(String text) {
			for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated
	 * interest to the customer's BCA.
	 */
	public enum ApplicationFrequencyEnum {
		DAILY("Daily"),

		HALFYEARLY("HalfYearly"),

		MONTHLY("Monthly"),

		OTHER("Other"),

		QUARTERLY("Quarterly"),

		PERSTATEMENTDATE("PerStatementDate"),

		WEEKLY("Weekly"),

		YEARLY("Yearly");

		private String value;

		ApplicationFrequencyEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ApplicationFrequencyEnum fromValue(String text) {
			for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * Amount on which Interest applied.
	 */
	public enum DepositInterestAppliedCoverageEnum {
		BANDED("Banded"),

		TIERED("Tiered"),

		WHOLE("Whole");

		private String value;

		DepositInterestAppliedCoverageEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static DepositInterestAppliedCoverageEnum fromValue(String text) {
			for (DepositInterestAppliedCoverageEnum b : DepositInterestAppliedCoverageEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * Type of interest rate, Fixed or Variable
	 */
	public enum FixedVariableInterestRateTypeEnum {
		FIXED("Fixed"),

		VARIABLE("Variable");

		private String value;

		FixedVariableInterestRateTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static FixedVariableInterestRateTypeEnum fromValue(String text) {
			for (FixedVariableInterestRateTypeEnum b : FixedVariableInterestRateTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate
	 * payable to the BCA.
	 */
	public enum BankInterestRateTypeEnum {
		GROSS("Gross"),

		OTHER("Other");

		private String value;

		BankInterestRateTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static BankInterestRateTypeEnum fromValue(String text) {
			for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
