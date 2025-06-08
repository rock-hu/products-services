package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other fee rate type which is not available in the standard code set
 */

@Schema(description = "Other fee rate type which is not available in the standard code set")
@Getter
@Setter
public class OBOtherCodeType18 implements Serializable {
	private static final long serialVersionUID = 1L;

}
