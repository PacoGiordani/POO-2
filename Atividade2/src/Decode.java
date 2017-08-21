
public class Decode {
	
	int conversor(String code){
		String decode = code.substring(0, 2);
		int cont = Integer.parseInt(code.substring(3));

		for (int i = 0; i < cont; i++) {
			  decode += 0;
		}
		
		return Integer.parseInt(decode);
	}

}
