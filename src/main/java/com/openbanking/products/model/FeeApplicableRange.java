package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Range or amounts or rates for which the fee/charge applies
 */

@Schema(description = "Range or amounts or rates for which the fee/charge applies")
@Getter
@Setter
public class FeeApplicableRange implements Serializable {
	private static final long serialVersionUID = 1L;

}
