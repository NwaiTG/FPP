package Midterm_oldQ;

public class ArtCreationData {
	ArtCount[] assembleCommonArt(FineArt[] fineArtWorks, WebArt[] webArtWorks) {
		ArtCount[] arCount = new ArtCount[fineArtWorks.length + webArtWorks.length];
		int index = 0;
		for(FineArt f : fineArtWorks){
			arCount[index] = f;
			index++;
		}
		
		for(WebArt w : webArtWorks) {
			arCount[index] = w;
			index++;
		}
		return arCount;
	}
	
	int computeNumberArtWorks(ArtCount[] artWorkds) {
		int res = 0;
		for(ArtCount a : artWorkds)
		{
			res += a.numArtPieces();
		}
		return res;
	}

}
