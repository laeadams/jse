package m4.s20;

import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap;

public class Example {

	public static void main(String[] args) {
		// name --> phone number
		// Tom --> "0039 3456780923"

		// se cerco Tom "0039 3456780923"
		// se cerco Bob "no number"

		Map<String, String> map = new HashMap<String, String>(); // l'oggetto HashMap è associato al nome map che è
																	// reference di map. Conviene essere il più generico
																	// possibile senza esagerare (ad esempio non mettere
																	// Object). Essendo generico posso cambiare HashMap
																	// con TreeMap senza dover cambiare il codice dato
																	// che entrambi implementano Map. Avendo messo solo
																	// HashMap sarei stato più limitato a quello.

		map.put("Tom", "0039123");
		map.put("Sarah", "0044123");

		String[] checkNames = { "Tom", "Diana", "Sarah" };

		for (String aName : checkNames) {
			getNumber(aName, map);
		}

		// per prendere tutti gli elementi di una mappa
		
		// var sarebbe Map.Entry<String, String >
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		// oppure:
		for(var key : map.keySet()) {
			System.out.println(key + ": "+ map.get(key));
		}

	}

	public static void getNumber(String name, Map<String, String> map) {

		if (!map.containsKey(name)) {
			System.out.println("No number");
		} else {
			System.out.println(map.get(name));
		}

	}

}
