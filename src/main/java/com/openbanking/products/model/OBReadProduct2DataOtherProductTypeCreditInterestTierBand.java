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
public class OBReadProduct2DataOtherProductTypeCreditInterestTierBand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * How often is credit interest calculated for the account.
	 */
	public enum CalculationFrequencyEnum {
		FQAT("FQAT"),

		FQDY("FQDY"),

		FQHY("FQHY"),

		FQMY("FQMY"),

		FQOT("FQOT"),

		FQQY("FQQY"),

		FQSD("FQSD"),

		FQWY("FQWY"),

		FQYY("FQYY");

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
	 * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays
	 * accumulated interest to the customer's account.
	 */
	public enum ApplicationFrequencyEnum {
		FQAT("FQAT"),

		FQDY("FQDY"),

		FQHY("FQHY"),

		FQMY("FQMY"),

		FQOT("FQOT"),

		FQQY("FQQY"),

		FQSD("FQSD"),

		FQWY("FQWY"),

		FQYY("FQYY");

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
		INBA("INBA"),

		INTI("INTI"),

		INWH("INWH");

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
	 * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate
	 * payable to the account holder's account.
	 */
	public enum BankInterestRateTypeEnum {
		INBB("INBB"),

		INFR("INFR"),

		INGR("INGR"),

		INLR("INLR"),

		INNE("INNE"),

		INOT("INOT");

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
