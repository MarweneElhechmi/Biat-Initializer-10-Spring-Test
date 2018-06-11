package tn.biat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;
import tn.biat.services.ICalcul;
import tn.biat.services.ICompteService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private ICalcul calcul;

	
	@Autowired
	private ICompteService icompte;
	
	
//	@Test
//	public void additionTest() {
//		//arrange
//		int a=5;
//		int b=5;
//		int expected=10;
//		//act
//		int actual = calcul.additionner(a, b);
//		//assert
//		Assert.assertEquals(expected, actual);
//	}
	
	@Test
	public final void testFinAll() {
		//arrange
				int expected=1;
				//act
				int actual = icompte.findAll().size();
				//assert
				Assert.assertEquals(expected, actual);
	}
	
//	@Test
//	public void contextLoads() {
//	}

}
