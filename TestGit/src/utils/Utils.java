package utils;

import java.util.List;

public class Utils {

	public static <T> boolean esListaVacia(List<T> lista) {

		if (lista == null || lista.size() == 0) {
			return true;
		}

		return false;
	}

}
