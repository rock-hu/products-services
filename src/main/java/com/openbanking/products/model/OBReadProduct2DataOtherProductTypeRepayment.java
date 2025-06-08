package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Repayment details of the Loan product
 */

@Schema(description = "Repayment details of the Loan product")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeRepayment implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Repayment type
	 */
	public enum RepaymentTypeEnum {
		USBA("USBA"),

		USBU("USBU"),

		USCI("USCI"),

		USCS("USCS"),

		USER("USER"),

		USFA("USFA"),

		USFB("USFB"),

		USFI("USFI"),

		USIO("USIO"),

		USOT("USOT"),

		USPF("USPF"),

		USRW("USRW"),

		USSL("USSL");

		private String value;

		RepaymentTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static RepaymentTypeEnum fromValue(String text) {
			for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * Repayment frequency
	 */
	public enum RepaymentFrequencyEnum {
		SMDA("SMDA"),

		SMFL("SMFL"),

		SMFO("SMFO"),

		SMHY("SMHY"),

		SMMO("SMMO"),

		SMOT("SMOT"),

		SMQU("SMQU"),

		SMWE("SMWE"),

		SMYE("SMYE");

		private String value;

		RepaymentFrequencyEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static RepaymentFrequencyEnum fromValue(String text) {
			for (RepaymentFrequencyEnum b : RepaymentFrequencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date
	 * etc
	 */
	public enum AmountTypeEnum {
		RABD("RABD"),

		RABL("RABL"),

		RACI("RACI"),

		RAFC("RAFC"),

		RAIO("RAIO"),

		RALT("RALT"),

		USOT("USOT");

		private String value;

		AmountTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AmountTypeEnum fromValue(String text) {
			for (AmountTypeEnum b : AmountTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
