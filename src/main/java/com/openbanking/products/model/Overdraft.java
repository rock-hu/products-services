package com.openbanking.products.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Borrowing details
 */

@Schema(description = "Borrowing details")
@Getter
@Setter
public class Overdraft implements Serializable {
	private static final long serialVersionUID = 1L;

}
