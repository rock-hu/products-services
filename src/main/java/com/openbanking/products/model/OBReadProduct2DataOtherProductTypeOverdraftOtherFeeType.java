package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other fee type code which is not available in the standard code set
 */

@Schema(description = "Other fee type code which is not available in the standard code set")
@Getter
@Setter
public class OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType implements Serializable {
	private static final long serialVersionUID = 1L;

}
