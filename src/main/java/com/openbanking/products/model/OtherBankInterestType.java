package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other interest rate types which are not available in the standard code list
 */

@Schema(description = "Other interest rate types which are not available in the standard code list")
@Getter
@Setter
public class OtherBankInterestType implements Serializable {
	private static final long serialVersionUID = 1L;

}
