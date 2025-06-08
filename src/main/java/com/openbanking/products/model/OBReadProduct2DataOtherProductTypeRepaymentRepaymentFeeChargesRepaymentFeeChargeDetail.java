package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details about specific fees/charges that are applied for repayment
 */

@Schema(description = "Details about specific fees/charges that are applied for repayment")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail implements Serializable {
	private static final long serialVersionUID = 1L;

}
