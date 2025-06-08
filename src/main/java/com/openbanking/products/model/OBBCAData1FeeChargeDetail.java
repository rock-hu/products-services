package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other fees/charges details
 */

@Schema(description = "Other fees/charges details")
@Getter
@Setter
public class OBBCAData1FeeChargeDetail implements Serializable {
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

	/**
	 * Fee/Charge Type
	 */
	public enum FeeTypeEnum {
		OTHER("Other"),

		SERVICECACCOUNTFEE("ServiceCAccountFee"),

		SERVICECACCOUNTFEEMONTHLY("ServiceCAccountFeeMonthly"),

		SERVICECACCOUNTFEEQUARTERLY("ServiceCAccountFeeQuarterly"),

		SERVICECFIXEDTARIFF("ServiceCFixedTariff"),

		SERVICECBUSIDEPACCBREAKAGE("ServiceCBusiDepAccBreakage"),

		SERVICECMINIMUMMONTHLYFEE("ServiceCMinimumMonthlyFee"),

		SERVICECOTHER("ServiceCOther");

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

	/**
	 * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
	 */
	public enum FeeRateTypeEnum {
		GROSS("Gross"),

		OTHER("Other");

		private String value;

		FeeRateTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static FeeRateTypeEnum fromValue(String text) {
			for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * How frequently the fee/charge is applied to the account
	 */
	public enum ApplicationFrequencyEnum {
		ONCLOSING("OnClosing"),

		ONOPENING("OnOpening"),

		CHARGINGPERIOD("ChargingPeriod"),

		DAILY("Daily"),

		PERITEM("PerItem"),

		MONTHLY("Monthly"),

		ONANNIVERSARY("OnAnniversary"),

		OTHER("Other"),

		PERHUNDREDPOUNDS("PerHundredPounds"),

		PERHOUR("PerHour"),

		PEROCCURRENCE("PerOccurrence"),

		PERSHEET("PerSheet"),

		PERTRANSACTION("PerTransaction"),

		PERTRANSACTIONAMOUNT("PerTransactionAmount"),

		PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),

		QUARTERLY("Quarterly"),

		SIXMONTHLY("SixMonthly"),

		STATEMENTMONTHLY("StatementMonthly"),

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
	 * How frequently the fee/charge is calculated
	 */
	public enum CalculationFrequencyEnum {
		ONCLOSING("OnClosing"),

		ONOPENING("OnOpening"),

		CHARGINGPERIOD("ChargingPeriod"),

		DAILY("Daily"),

		PERITEM("PerItem"),

		MONTHLY("Monthly"),

		ONANNIVERSARY("OnAnniversary"),

		OTHER("Other"),

		PERHUNDREDPOUNDS("PerHundredPounds"),

		PERHOUR("PerHour"),

		PEROCCURRENCE("PerOccurrence"),

		PERSHEET("PerSheet"),

		PERTRANSACTION("PerTransaction"),

		PERTRANSACTIONAMOUNT("PerTransactionAmount"),

		PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),

		QUARTERLY("Quarterly"),

		SIXMONTHLY("SixMonthly"),

		STATEMENTMONTHLY("StatementMonthly"),

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

}
