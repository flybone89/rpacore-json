

	import com.google.gson.JsonObject
	import com.google.gson.Gson
	import com.google.gson.JsonArray
	import com.google.gson.JsonParser
	import com.google.gson.JsonElement
	
	
	// Assignment:
	// Number of available toppings for 'Сakes';
	// List of 'Old Fashioned' available types of batter;
	// Calculate the amount of PPUs for all donuts.
	
	num_cake_toppings = 0;
	list_battery_types = new ArrayList();
	sum_donut_ppu = 0.0;
	
	// Using Gson
	// First use the main class to create a Gson instance object, followed by either the toJson(Object) or fromJson(Object) method
	// Example: MyType target2 = gson.fromJson(json, MyType.class); // deserializes json into target2
	// (1) creates Gson instance, (2) deserializes jsonData to JsonObject, (3) uses Groovy method getAt() to get data from JsonObject
	
	JsonArray items = new Gson().fromJson(json_data.toString(), JsonObject.class).getAt("Data"); // also getAsJsonArray("Data")
	JsonParser parser = new JsonParser();
	
    for (int i = 0; i < items.size(); i++) {
       JsonElement value = items.get(i).get("name");
       JsonElement batters = parser.parse(items.get(i).get("batters").toString());
       JsonArray batter = batters.getAsJsonArray("batter");
       JsonArray topping = items.get(i).get("topping");
    }

