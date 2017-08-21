import java.awt.List;
import java.util.ArrayList;

public class Calculator {

	ArrayList<Integer> list = new ArrayList<Integer>();
	void fillList(int num) {
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
	}

	void remove(int num) {
		int cont = 0;
		while ((cont + num) < (list.size())) {
			list.remove(cont + num);
			cont++;
		}
	}

	
	int calculateLastAlive(String code) {
		Decode d = new Decode();
		int num = d.conversor(code);
		int[] lastNumber = new int[num];
		int cont = 0;
		fillList(num);
		lastNumber[cont] = list.get(list.size() - 1);
		remove(1);
		lastNumber[cont + 1] = list.get(list.size() - 1);
		while (list.size() != 1) {
			if (lastNumber[cont] == lastNumber[cont + 1]) {
				remove(0);
			} else {
				remove(1);
			}
			cont++;
			lastNumber[cont + 1] = list.get(list.size() - 1);
		}

		return list.get(0);
	}

}
