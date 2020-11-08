package adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import domain.Covid19Pacient;
import domain.Symptom;
import iterator.Covid19PacientIterator;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p=new Covid19Pacient("Elene", 20);
		p.addSymptom(new Symptom("s1", 10, 5), 1);
		p.addSymptom(new Symptom("s2", 10, 4), 2);
		p.addSymptom(new Symptom("s3", 10, 3), 3);
		p.addSymptom(new Symptom("s4", 10, 2), 4);
		p.addSymptom(new Symptom("s5", 10, 1), 5);
		
		Covid19PacientInvertedIterator inIt = new Covid19PacientInvertedIterator(new ArrayList<Symptom>(p.getSymptoms()));
		SymptomNameComparator nameComp = new SymptomNameComparator();
		SeverityIndexComparator indexComp = new SeverityIndexComparator();
		
		Iterator sortedNames = Sorting.sortedIterator(inIt, nameComp);
		Iterator sortedIndex = Sorting.sortedIterator(inIt, indexComp);
		
		System.out.println("Izenaren arabera:");
		
		while(sortedNames.hasNext()) {
			System.out.println(sortedNames.next());
		}
		
		System.out.println("Severity indexen arabera:");
		
		while(sortedIndex.hasNext()) {
			System.out.println(sortedIndex.next());
		}	

	}

}
