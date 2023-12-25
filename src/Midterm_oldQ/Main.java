package Midterm_oldQ;

public class Main {
	static FineArt[] fineArtsArr;
	static WebArt[] webArtsArr;
	
	public static void main(String[] args) {
		populateArrays();
		ArtCreationData acd = new ArtCreationData();
		
		ArtCount[] artObjects = acd.assembleCommonArt(fineArtsArr, webArtsArr);
		System.out.println("Number of pieces of art: " +
		acd.computeNumberArtWorks(artObjects));		
	}
	
	private static void populateArrays() {
		fineArtsArr = new FineArt[] {
				new FineArt(paintings1, sculptures1),
				new FineArt(paintings2, sculptures2)};
		
		webArtsArr = new WebArt[] {
				new WebArt(animations1, advertisements1),
				new WebArt(animations2, new String[0])};
	}
	
	static String[] paintings1 = new String[] {"Horizon", "Sunset", "Speeding"};
	static String[] paintings2 = new String[] {"Horizon", "Sunset", "Speeding"};
	static String[] sculptures1 = new String[] {"Thinker", "TallMan", "Invincible"};
	static String[] sculptures2 = new String[] {"Wonder Boy"};
	
	static String[] animations1 = new String[] {"Sponge Bob", "Batman", "Goofy"};
	static String[] animations2 = new String[] {"Waking Up", "Dusk", "Car Race"};
	static String[] advertisements1 = new String[] {"Cereal", "Skim Milk", "Dob Bones"};

}
