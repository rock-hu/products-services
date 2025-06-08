package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an
 * amount (in gbp), an amount (in items) or a rate.
 */

@Schema(
		description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
@Getter
@Setter
public class OverdraftOverdraftFeeChargeCap implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Overdraft fee type
	 */
	public enum FeeTypeEnum {
		ARRANGEDOVERDRAFT("ArrangedOverdraft"),

		ANNUALREVIEW("AnnualReview"),

		EMERGENCYBORROWING("EmergencyBorrowing"),

		BORROWINGITEM("BorrowingItem"),

		OVERDRAFTRENEWAL("OverdraftRenewal"),

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
	 * Min Max type
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
