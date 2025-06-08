package com.openbanking.products.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * ProductDetails
 */
@Getter
@Setter
public class ProductDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments,
	 * that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target
	 * different categories of consumers who perceive the full value of certain products and services differently from one
	 * another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd With
	 * respect to BCA products, they are segmented in relation to different markets that they wish to focus on.
	 */
	public enum SegmentEnum {
		CLIENTACCOUNT("ClientAccount"),

		STANDARD("Standard"),

		NONCOMMERCIALCHAITIESCLBSOC("NonCommercialChaitiesClbSoc"),

		NONCOMMERCIALPUBLICAUTHGOVT("NonCommercialPublicAuthGovt"),

		RELIGIOUS("Religious"),

		SECTORSPECIFIC("SectorSpecific"),

		STARTUP("Startup"),

		SWITCHER("Switcher");

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

	/**
	 * The unit of period (days, weeks, months etc.) of the promotional length
	 */
	public enum FeeFreeLengthPeriodEnum {
		DAY("Day"),

		HALF_YEAR("Half Year"),

		MONTH("Month"),

		QUARTER("Quarter"),

		WEEK("Week"),

		YEAR("Year");

		private String value;

		FeeFreeLengthPeriodEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static FeeFreeLengthPeriodEnum fromValue(String text) {
			for (FeeFreeLengthPeriodEnum b : FeeFreeLengthPeriodEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
