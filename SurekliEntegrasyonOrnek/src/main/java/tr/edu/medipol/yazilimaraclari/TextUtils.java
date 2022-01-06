package tr.edu.medipol.yazilimaraclari;

import org.apache.commons.lang3.StringUtils;

public class TextUtils {
	
	public static String birlestir(String cumle1, String cumle2) {
		String sonuc = "";
		
		if (!StringUtils.trim(cumle1).isEmpty()) {
			sonuc = cumle1 + " ";
		}
			
		if (!StringUtils.trim(cumle2).isEmpty()) {
			sonuc += cumle2;
		}
		
		return sonuc;
	}
}
