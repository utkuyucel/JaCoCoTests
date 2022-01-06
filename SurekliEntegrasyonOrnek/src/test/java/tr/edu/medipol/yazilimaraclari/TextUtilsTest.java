package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextUtilsTest {

	@Test
	public void birlestirNormalDegerlerIcin() {
		
		// Ön koþullar (Given)
		String cumle1 = "Medipol Universitesi";
		String cumle2 = "Bilgisayar Programciligi";
		
		// When -> Test edilmek istenen asýl kodun çaðýrýlmasý
		String sonuc = TextUtils.birlestir(cumle1, cumle2);
				
		// Then -> Kontrol
		assertEquals("Medipol Universitesi Bilgisayar Programciligi", sonuc);
		
	}

}
