package com.bandtec.techconnective.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Contato {
	@Getter @Setter private byte prefixo;
	@Getter @Setter private long tel;
	@Getter @Setter private long cel;
}
