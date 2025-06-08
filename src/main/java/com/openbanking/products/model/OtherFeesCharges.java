package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 */

@Schema(description = "Contains details of fees and charges which are not associated with either borrowing or features/benefits")
@Getter
@Setter
public class OtherFeesCharges implements Serializable {
	private static final long serialVersionUID = 1L;

}
