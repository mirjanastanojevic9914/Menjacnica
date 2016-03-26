package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKursValute(Valuta val, double prodajniKurs,
			double srednjiKurs, double kupovniKurs, GregorianCalendar dat) {

		Kurs k = new Kurs();
		k.setDatum(dat);
		k.setKupovniKurs(kupovniKurs);
		k.setProdajniKurs(prodajniKurs);
		k.setSrednjiKurs(srednjiKurs);

		for (int i = 0; i < valute.size(); i++) {

			if (valute.get(i).equals(val)) {
				if (!valute.get(i).getKursevi().contains(k)) {
					valute.get(i).getKursevi().add(k);
					break;
				}
			}
		}

	}

	@Override
	public void obrisiKursValute(Valuta val, GregorianCalendar dat) {
		for (int i = 0; i < valute.size(); i++) {

			if (valute.get(i).equals(val)) {

				for (int j = 0; j < val.getKursevi().size(); j++) {

					if (val.getKursevi().get(j).getDatum().equals(dat)) {
						val.getKursevi().remove(j);
					}
				}
			}
		}
	}

	@Override
	public Kurs pronadjiIVratiKursValute(Valuta val, GregorianCalendar dat) {
		for (int i = 0; i < valute.size(); i++) {

			if (valute.get(i).equals(val)) {

				for (int j = 0; j < valute.get(i).getKursevi().size(); i++) {

					if (valute.get(i).getKursevi().get(j).equals(dat)) {

						return valute.get(i).getKursevi().get(j);
					}
				}
			}
		}
		return null;
	}

}
