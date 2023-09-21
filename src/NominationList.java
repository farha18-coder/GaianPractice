import java.util.ArrayList;
import java.util.List;

public class NominationList {
	
	 private Nomination head;

	    public NominationList() {
	        this.head = null;
	    }

	    public void addNomination(Nomination nomination) {
	        if (head == null) {
	            head = nomination;
	        } else {
	            Nomination current = head;
	            while (current.getNext() != null) {
	                current = current.getNext();
	            }
	            current.setNext(nomination);
	        }
	    }

	    public void removeNomination(Nomination nomination) {
	        if (head == nomination) {
	            head = head.getNext();
	        } else {
	            Nomination current = head;
	            while (current.getNext() != nomination) {
	                current = current.getNext();
	            }            current.setNext(nomination.getNext());
	        }
	    }

	    public Nomination findNomination(String category, String nominee, int year) {
	        Nomination current = head;
	        while (current != null) {
	            if (current.getCategory().equals(category) && current.getNominee().equals(nominee)
	                    && current.getYear() == year) {
	                return current;
	            }
	            current = current.getNext();
	        }
	        return null;
	    }

	    public List<String> getNomineesByYear(int year) {
	        List<String> nominees = new ArrayList<>();
	        Nomination current = head;
	        while (current != null) {
	            if (current.getYear() == year) {
	                nominees.add(current.getNominee());
	            }
	            current = current.getNext();
	        }
	        return nominees;
	    }

}
