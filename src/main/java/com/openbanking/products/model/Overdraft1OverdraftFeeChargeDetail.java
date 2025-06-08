package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details about the fees/charges
 */

@Schema(description = "Details about the fees/charges")
@Getter
@Setter
public class Overdraft1OverdraftFeeChargeDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Overdraft fee type
	 */
	public enum FeeTypeEnum {
		ARRANGEDOVERDRAFT("ArrangedOverdraft"),

		EMERGENCYBORROWING("EmergencyBorrowing"),

		BORROWINGITEM("BorrowingItem"),

		OVERDRAFTRENEWAL("OverdraftRenewal"),

		ANNUALREVIEW("AnnualReview"),

		OVERDRAFTSETUP("OverdraftSetup"),

		SURCHARGE("Surcharge"),

		TEMPOVERDRAFT("TempOverdraft"),

		UNAUTHORISEDBORROWING("UnauthorisedBorrowing"),

		UNAUTHORISEDPAIDTRANS("UnauthorisedPaidTrans"),

		OTHER("Other"),

		UNAUTHORISEDUNPAIDTRANS("UnauthorisedUnpaidTrans");

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
	 * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
	 */
	public enum FeeRateTypeEnum {
		LINKEDBASERATE("LinkedBaseRate"),

		GROSS("Gross"),

		NET("Net"),

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
	 * Frequency at which the overdraft charge is applied to the account
	 */
	public enum ApplicationFrequencyEnum {
		ACCOUNTCLOSING("AccountClosing"),

		ACCOUNTOPENING("AccountOpening"),

		ACADEMICTERM("AcademicTerm"),

		CHARGINGPERIOD("ChargingPeriod"),

		DAILY("Daily"),

		PERITEM("PerItem"),

		MONTHLY("Monthly"),

		ONACCOUNTANNIVERSARY("OnAccountAnniversary"),

		OTHER("Other"),

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
	 * How often is the overdraft fee/charge calculated for the account.
	 */
	public enum CalculationFrequencyEnum {
		ACCOUNTCLOSING("AccountClosing"),

		ACCOUNTOPENING("AccountOpening"),

		ACADEMICTERM("AcademicTerm"),

		CHARGINGPERIOD("ChargingPeriod"),

		DAILY("Daily"),

		PERITEM("PerItem"),

		MONTHLY("Monthly"),

		ONACCOUNTANNIVERSARY("OnAccountAnniversary"),

		OTHER("Other"),

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
