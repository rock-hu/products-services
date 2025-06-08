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
public class Overdraft1OverdraftTierBand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Interest charged on whole amount or tiered/banded
	 */
	public enum OverdraftInterestChargingCoverageEnum {
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
