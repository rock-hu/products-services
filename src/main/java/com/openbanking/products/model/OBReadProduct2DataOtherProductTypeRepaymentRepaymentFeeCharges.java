package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 */

@Schema(description = "Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges implements Serializable {
	private static final long serialVersionUID = 1L;

}
