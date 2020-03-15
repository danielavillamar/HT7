// DANIELA VILLAMAR
// 19086


public class Association<K, V> {
	
	private K english;
	private V spanish;
	
	/**
	 * english la palabra en ingles
	 * spanish la palabra en espaniol
	 */
   
   
	public Association(K english, V spanish) {
		// TODO Auto-generated constructor stub
		this.english = english;
		this.spanish = spanish; 
	}

	/**
	 * return the english
	 */
   
	public K getEnglish() {
		return english;
	}

	/**
	 * english the english to set
	 */
   
   
	public void setEnglish(K english) {
		this.english = english;
	}

	/**
	 * return the spanish
	 */
   
	public V getSpanish() {
		return spanish;
	}

	/**
	 * spanish the spanish to set
	 */
   
	public void setSpanish(V spanish) {
		this.spanish = spanish;
	}

}
