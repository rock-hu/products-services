package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Product details of Other Product which is not avaiable in the standard list
 */

@Schema(description = "Product details of Other Product which is not avaiable in the standard list")
@Getter
@Setter
public class OBReadProduct2 implements Serializable {
	private static final long serialVersionUID = 1L;

}
