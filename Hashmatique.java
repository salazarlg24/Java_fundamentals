import java.util.HashMap;

class Hashmatique{
	public static void main(String[] args){
		HashMap <String, String> trackList = new HashMap<>();
		trackList.put("Big Papa","Lyrics lyrics and more lyrics");		
		trackList.put("Dear Mama","Lyrics lyrics and more lyrics");		
		trackList.put("24k Gold","Lyrics lyrics and more lyrics");		
		trackList.put("In the End","Lyrics lyrics and more lyrics");

		// String track = trackList.get("24k Gold");

		for(String key : trackList.keySet()){
			System.out.println(key + " : " + trackList.get(key));
		}		
	}
}