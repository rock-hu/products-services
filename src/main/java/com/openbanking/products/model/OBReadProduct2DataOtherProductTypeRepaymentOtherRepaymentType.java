package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other repayment type which is not in the standard code list
 */

@Schema(description = "Other repayment type which is not in the standard code list")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType implements Serializable {
	private static final long serialVersionUID = 1L;

}
