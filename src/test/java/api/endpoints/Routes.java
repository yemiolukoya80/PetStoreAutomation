package api.endpoints;

public class Routes {
	
	
	/*
	 * Create user (Post) - https://petstore.swagger.io/v2/user
	 * Get user (Get) - https://petstore.swagger.io/v2/user/{username}
	 * Delete user (Delete) - https://petstore.swagger.io/v2/user/{username}
	 * Update user (Put) - https://petstore.swagger.io/v2/user/{username}
	 *
	 */
	
	// User Module urls
	public static String base_url = "https://petstore.swagger.io/v2";
	
	public static String post_url = base_url + "/user";
	
	public static String get_url = base_url + "/user/{username}";
	
	public static String delete_url = base_url + "/user/{username}";
	
	public static String update_url = base_url + "/user/{username}";

	// Store Module urls
	
	public static String storePost_url = base_url + "/store/order";
	
	public static String storeGet_url = base_url + "/store/order/{orderId}";
	
	public static String storeDelete_url = base_url + "/store/order/{orderId}";



}
