package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other fee rate type which is not in the standard rate type list
 */

@Schema(description = "Other fee rate type which is not in the standard rate type list")
@Getter
@Setter
public class OBOtherCodeType15 implements Serializable {
	private static final long serialVersionUID = 1L;

}
