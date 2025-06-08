package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Tier band set details
 */

@Schema(description = "Tier band set details")
@Getter
@Setter
public class OverdraftOverdraftTierBandSet implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The methodology of how overdraft is charged. It can be: 'Whole' Where the same charge/rate is applied to the entirety
	 * of the overdraft balance (where charges are applicable). 'Tiered' Where different charges/rates are applied dependent
	 * on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where
	 * different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a
	 * government organisation.
	 */
	public enum TierBandMethodEnum {
		BANDED("Banded"),

		TIERED("Tiered"),

		WHOLE("Whole");

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

	/**
	 * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable
	 * notification before it's agreed end date, or 'on demand' which means that the financial institution can demand
	 * repayment at any point in time.
	 */
	public enum OverdraftTypeEnum {
		COMMITTED("Committed"),

		ONDEMAND("OnDemand");

		private String value;

		OverdraftTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static OverdraftTypeEnum fromValue(String text) {
			for (OverdraftTypeEnum b : OverdraftTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
