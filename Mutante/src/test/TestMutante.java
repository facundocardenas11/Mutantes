package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigo.Mutante;

class TestMutante {
    
	@Test
	void testEsMutante() {
		String[] ADNHumanoPrimero= new String[6];
		String[] ADNHumanoSegundo= new String[6];
		ADNHumanoPrimero[0]= "ATGCGA";
		ADNHumanoPrimero[1]= "CAGGGC";
		ADNHumanoPrimero[2]= "TTATGT";
		ADNHumanoPrimero[3]= "AGAAGG";
		ADNHumanoPrimero[4]= "CCCCTA";
		ADNHumanoPrimero[5]= "TCACTG";
		
		ADNHumanoSegundo[0]= "ATGCGA";
		ADNHumanoSegundo[1]= "CAGGGC";
		ADNHumanoSegundo[2]= "TTATGT";
		ADNHumanoSegundo[3]= "AGAAGG";
		ADNHumanoSegundo[4]= "CCCCTA";
		ADNHumanoSegundo[5]= "TCACTG";
										
	
		
		Mutante Humano1= new Mutante(ADNHumanoPrimero);
		Mutante Humano2= new Mutante(ADNHumanoSegundo);
		
		assertTrue(Humano1.esMutante(ADNHumanoPrimero)==Humano2.esMutante(ADNHumanoSegundo));
	}

}
