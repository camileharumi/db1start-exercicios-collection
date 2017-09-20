package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.colecoes.model.Carro;
import br.com.db1.colecoes.model.MarcaComparator;
import br.com.db1.colecoes.model.PlacaComparator;

public class CarroTest {
	
	@Test
	public void test(){
		List<Carro> carros = new ArrayList<>();
		carros.add(new Carro(1972, "Fusca", "VW", "DAD-1234"));
		carros.add(new Carro(2017, "Ecosport", "Ford", "ABC-9999"));
		carros.add(new Carro(2016, "Uno", "Fiat", "ABC-1890"));

		Assert.assertTrue(carros.size() == 3);
		Assert.assertTrue(carros.get(0).getAno() == 1972);
		Assert.assertTrue(carros.get(1).getAno() == 2017);
		Assert.assertTrue(carros.get(2).getAno() == 2016);
		
		Collections.sort(carros);

		Assert.assertTrue(carros.get(0).getAno() == 1972);
		Assert.assertTrue(carros.get(1).getAno() == 2016);
		Assert.assertTrue(carros.get(2).getAno() == 2017);

		Collections.sort(carros, new MarcaComparator());

		Assert.assertEquals("Fiat",carros.get(0).getMarca());
		Assert.assertEquals("Ford",carros.get(1).getMarca());
		Assert.assertEquals("VW",carros.get(2).getMarca());


		Collections.sort(carros, new PlacaComparator());

		Assert.assertEquals("ABC-1890",carros.get(0).getPlaca());
		Assert.assertEquals("ABC-9999",carros.get(1).getPlaca());
		Assert.assertEquals("DAD-1234",carros.get(2).getPlaca());
	}
}
