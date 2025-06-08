package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other loan interest rate types which are not available in the standard code list
 */

@Schema(description = "Other loan interest rate types which are not available in the standard code list")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType implements Serializable {
	private static final long serialVersionUID = 1L;

}
