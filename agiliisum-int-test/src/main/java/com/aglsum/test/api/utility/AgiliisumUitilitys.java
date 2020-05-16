package com.aglsum.test.api.utility;

import java.util.Map;
import org.springframework.stereotype.Component;
@Component
public class AgiliisumUitilitys {
public String getRole(String userId) {
		var map = Map.of("aglsumAdmn", "admin", "aglsUsr", "user");
		return map.get(userId);
	}
public String getUrlByRole(String accessUrls) {
	var adminRole="/aglsum/**";
	var userRole="/aglsum/api/getconfigdetails";
	var map = Map.of("admin", adminRole, "user", userRole);
	return map.get(accessUrls);
	
}
}
