package com.bandtec.techconnective.controller

import static org.junit.Assert.*

import org.junit.Test

import spock.lang.Specification

class LoginControllertests extends Specification{

	def 'deve Ter Strings Iguais'(){
		given:
		def texto1 = 'bom dia, mano'


		when:
		def texto2 = 'bom dia, mano' //'boa tarde, mano'

		then:
		texto1 == texto2
	}
}
