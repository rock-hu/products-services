package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */

@Schema(description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
@Getter
@Setter
public class Overdraft1OverdraftFeeChargeCap implements Serializable {
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
	 * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
	 */
	public enum MinMaxTypeEnum {
		MINIMUM("Minimum"),

		MAXIMUM("Maximum");

		private String value;

		MinMaxTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static MinMaxTypeEnum fromValue(String text) {
			for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * Period e.g. day, week, month etc. for which the fee/charge is capped
	 */
	public enum CappingPeriodEnum {
		ACADEMICTERM("AcademicTerm"),

		DAY("Day"),

		HALF_YEAR("Half Year"),

		MONTH("Month"),

		QUARTER("Quarter"),

		WEEK("Week"),

		YEAR("Year");

		private String value;

		CappingPeriodEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static CappingPeriodEnum fromValue(String text) {
			for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
