package edu.personal.facebook;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.User;
import facebook4j.auth.AccessToken;

public class loginFacebook {

	public static void main(String[] args) {
		Facebook facebook = new FacebookFactory().getInstance();
		
		String appId = "280545782307372";
		String appSecret = "af0ba0df44810c1c7f2eb2fe341b20c0";
		facebook.setOAuthAppId(appId, appSecret);
		AccessToken accessToken = null;
		try {
			accessToken = facebook.getOAuthAppAccessToken();
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "AccessToken" + accessToken);
		facebook.setOAuthPermissions("public_profile");
		
		facebook.setOAuthAccessToken(new AccessToken(accessToken.getToken(), null));
		
		
		
		
		try {
			User user = facebook.getUser("/me");
		} catch (FacebookException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(true){
			return;
		}
		
		System.out.println( User.class.getName());
		

		try {
			facebook.postStatusMessage("Hello World from Facebook4J.");
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
