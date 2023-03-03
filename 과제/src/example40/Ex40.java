package example40;

class Entry {
	private String word;
	
	public Entry() {
		System.out.println("***약어사전***");
	}
	
	public Entry(String word) {
		this();
		this.word = word;
	}
	
	public void writeView() {
		System.out.println("약어: " + word);
	}
}

class SubEntry extends Entry {
	private String definition;
	private int year;
	
	public SubEntry() {
	}
	
	public SubEntry(String word) {
		super(word);
	}

	public SubEntry(String word, String definition, int year) {
		this(word);
		this.definition = definition;
		this.year = year;
	}
	
	public void printView() {
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year);
	}
	
}

public class Ex40 {

	public static void main(String[] args) {
		SubEntry ob = new SubEntry("OOP", "Object Oriented Programming", 1991);
		ob.writeView();
		ob.printView();
	}

}
