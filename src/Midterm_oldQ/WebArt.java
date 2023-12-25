package Midterm_oldQ;

public class WebArt implements ArtCount{
	private String[] animations;
	private String[] advertisements;
	public WebArt(String[] animations, String[] advertisements) {
		this.animations = animations;
		this.advertisements = advertisements;
	}
	public String[] getAnimations() {
		return animations;
	}
	public String[] getAdvertisements() {
		return advertisements;
	}
	@Override
	public int numArtPieces() {
		return this.animations.length + this.advertisements.length;
	}
}
