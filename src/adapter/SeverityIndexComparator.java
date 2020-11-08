package adapter;

import java.util.Comparator;
import domain.Symptom;

public class SeverityIndexComparator implements Comparator{

	@Override
	public int compare(Object s1, Object s2) {
		int s1index = ((Symptom)s1).getSeverityIndex();
		int s2index = ((Symptom)s2).getSeverityIndex();
		
		if(s1index>s2index) {
			return 1;
		}else if (s1index<s2index) {
			return -1;
		}else {
			return 0;
		}
	}

}
