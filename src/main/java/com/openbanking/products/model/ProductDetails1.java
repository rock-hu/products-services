package com.openbanking.products.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * ProductDetails1
 */
@Getter
@Setter
public class ProductDetails1 implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments,
	 * that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target
	 * different categories of consumers who perceive the full value of certain products and services differently from one
	 * another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd With
	 * respect to PCA products, they are segmented in relation to different markets that they wish to focus on.
	 */
	public enum SegmentEnum {
		BASIC("Basic"),

		BENEFITANDREWARD("BenefitAndReward"),

		CREDITINTEREST("CreditInterest"),

		CASHBACK("Cashback"),

		GENERAL("General"),

		GRADUATE("Graduate"),

		OTHER("Other"),

		OVERDRAFT("Overdraft"),

		PACKAGED("Packaged"),

		PREMIUM("Premium"),

		REWARD("Reward"),

		STUDENT("Student"),

		YOUNGADULT("YoungAdult"),

		YOUTH("Youth");

		private String value;

		SegmentEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static SegmentEnum fromValue(String text) {
			for (SegmentEnum b : SegmentEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
