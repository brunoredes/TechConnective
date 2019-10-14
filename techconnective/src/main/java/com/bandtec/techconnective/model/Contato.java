package com.bandtec.techconnective.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Contato {
	@Getter @Setter private int prefixo;
	@Getter @Setter private Integer tel;
	@Getter @Setter private Integer cel;
}
