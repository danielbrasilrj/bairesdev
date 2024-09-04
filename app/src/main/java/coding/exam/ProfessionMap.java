package coding.exam;

import java.util.HashMap;
import java.util.Map;

public final class ProfessionMap {

	final Map<String, String> userProfessionMap = new HashMap<>();

	public void addUserProfession(final String username, final String profession) {
		userProfessionMap.put( username, profession );
	}

	public String getProfessionByUser(final String username) {
		return userProfessionMap.get( username );
	}

	public Map<String, String> getUserProfessionMap() {
		return userProfessionMap;
	}
}
