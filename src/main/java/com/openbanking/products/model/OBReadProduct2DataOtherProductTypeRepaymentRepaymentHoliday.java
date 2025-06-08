package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details of capital repayment holiday if any
 */

@Schema(description = "Details of capital repayment holiday if any")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The unit of period (days, weeks, months etc.) of the repayment holiday
	 */
	public enum MaxHolidayPeriodEnum {
		PACT("PACT"),

		PDAY("PDAY"),

		PHYR("PHYR"),

		PMTH("PMTH"),

		PQTR("PQTR"),

		PWEK("PWEK"),

		PYER("PYER");

		private String value;

		MaxHolidayPeriodEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static MaxHolidayPeriodEnum fromValue(String text) {
			for (MaxHolidayPeriodEnum b : MaxHolidayPeriodEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
