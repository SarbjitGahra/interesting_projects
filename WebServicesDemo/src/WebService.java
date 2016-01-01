import net.webservicex.Country;
import net.webservicex.CountrySoap;


public class WebService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country country = new Country ();
		CountrySoap soap =	country.getCountrySoap();
		System.out.println("hello");
		System.out.println(soap.getISD("India"));

		}
		
	}
