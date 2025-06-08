package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Other product type details associated with the account.
 */

@Schema(description = "Other product type details associated with the account.")
@Getter
@Setter
public class OBReadProduct2DataOtherProductType implements Serializable {
	private static final long serialVersionUID = 1L;

}
