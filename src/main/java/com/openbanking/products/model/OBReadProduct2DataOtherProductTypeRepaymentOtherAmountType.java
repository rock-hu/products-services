package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other amount type which is not in the standard code list
 */

@Schema(description = "Other amount type which is not in the standard code list")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType implements Serializable {
	private static final long serialVersionUID = 1L;

}
