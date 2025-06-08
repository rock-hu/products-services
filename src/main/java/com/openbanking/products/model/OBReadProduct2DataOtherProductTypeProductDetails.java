package com.openbanking.products.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * OBReadProduct2DataOtherProductTypeProductDetails
 */
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeProductDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments,
	 * that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target
	 * different categories of consumers who perceive the full value of certain products and services differently from one
	 * another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd
	 */
	public enum SegmentEnum {
		GEAS("GEAS"),

		GEBA("GEBA"),

		GEBR("GEBR"),

		GEBU("GEBU"),

		GECI("GECI"),

		GECS("GECS"),

		GEFB("GEFB"),

		GEFG("GEFG"),

		GEG("GEG"),

		GEGR("GEGR"),

		GEGS("GEGS"),

		GEOT("GEOT"),

		GEOV("GEOV"),

		GEPA("GEPA"),

		GEPR("GEPR"),

		GERE("GERE"),

		GEST("GEST"),

		GEYA("GEYA"),

		GEYO("GEYO"),

		PSCA("PSCA"),

		PSES("PSES"),

		PSNC("PSNC"),

		PSNP("PSNP"),

		PSRG("PSRG"),

		PSSS("PSSS"),

		PSST("PSST"),

		PSSW("PSSW");

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
		PACT("PACT"),

		PDAY("PDAY"),

		PHYR("PHYR"),

		PMTH("PMTH"),

		PQTR("PQTR"),

		PWEK("PWEK"),

		PYER("PYER");

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
