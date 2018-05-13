package Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Hey {

	public static void main(String[] args) {
		
		Hello userObject = new Hello(  
			    "Norman", 
			    "normstud.io", 
			    26
			);
		Gson gson = new Gson(); //serialization
		String userJson = gson.toJson(userObject);  
		System.out.println(userJson.toString());
		
		
		
		
		
		
		
		
		
		
		
		
//				String json ="{\"city\":\"Jos\",\"state\":\"Nigeria\",\"houseno\":\"13\"}";
//				Gson gson = new GsonBuilder().create();		
//				Hello address=gson.fromJson(json, Hello.class);//deserialization
//				System.out.println(address.toString());
//		
//				
	}

}

