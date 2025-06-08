package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details about the interest that may be payable to the PCA account holders
 */

@Schema(description = "Details about the interest that may be payable to the PCA account holders")
@Getter
@Setter
public class CreditInterest1 implements Serializable {
	private static final long serialVersionUID = 1L;

}
