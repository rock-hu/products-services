package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Product details associated with the Account
 */

@Schema(description = "Product details associated with the Account")
@Getter
@Setter
public class OBReadProduct2DataProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Product type : Personal Current Account, Business Current Account
	 */
	public enum ProductTypeEnum {
		BUSINESSCURRENTACCOUNT("BusinessCurrentAccount"),

		COMMERCIALCREDITCARD("CommercialCreditCard"),

		OTHER("Other"),

		PERSONALCURRENTACCOUNT("PersonalCurrentAccount"),

		SMELOAN("SMELoan");

		private String value;

		ProductTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ProductTypeEnum fromValue(String text) {
			for (ProductTypeEnum b : ProductTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
