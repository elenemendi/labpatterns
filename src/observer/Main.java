package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Covid19Pacient pacient = new Covid19Pacient("aitor", 35);
		Covid19Pacient pacient2 = new Covid19Pacient("elene", 82);
		Covid19Pacient pacient3 = new Covid19Pacient("igor", 46);
		
		PacientObserverGUI pacientGUI = new PacientObserverGUI(pacient);
		PacientObserverGUI pacientGUI2 = new PacientObserverGUI(pacient2);
		PacientObserverGUI pacientGUI3 = new PacientObserverGUI(pacient3);
		
		PacientSymptomGUI frame = new PacientSymptomGUI(pacient);
		PacientSymptomGUI frame2 = new PacientSymptomGUI(pacient2);
		PacientSymptomGUI frame3 = new PacientSymptomGUI(pacient3);
		
		PacientThermometerGUI ter = new PacientThermometerGUI(pacient);
		PacientThermometerGUI ter2 = new PacientThermometerGUI(pacient2);
		PacientThermometerGUI ter3 = new PacientThermometerGUI(pacient3);
		
		SemaphorGUI sem = new SemaphorGUI(pacient);
		SemaphorGUI sem2 = new SemaphorGUI(pacient2);
		SemaphorGUI sem3 = new SemaphorGUI(pacient3);
	}


}
