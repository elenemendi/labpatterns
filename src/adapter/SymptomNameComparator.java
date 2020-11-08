package adapter;

import java.util.Comparator;
import domain.Symptom;

public class SymptomNameComparator implements Comparator {

	@Override
	public int compare(Object s1, Object s2) {
		String s1name = ((Symptom)s1).getName();
		String s2name = ((Symptom)s2).getName();
		
		if(s1name.compareTo(s2name)>0) {
			return 1;
		}else if (s1name.equals(s2name)) {
			return 0;
		}else {
			return -1;
		}
	
	}

}
