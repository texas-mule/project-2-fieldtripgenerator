package com.ezimmerhanzel.service;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezimmerhanzel.repository.FoodRepository;
import com.ezimmerhanzel.domain.Coordinate;
import com.ezimmerhanzel.domain.Food;

@Service
public class FoodService {
	@Autowired
	FoodRepository foodRepository;

	public void setFoodRepository(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}

	public Collection<Food> getAllFood() {
		return this.foodRepository.getAll();
	}

	public void deleteAllFood() {
		this.foodRepository.deleteAll();
	}

	public void saveNewFood(Food food) {
		foodRepository.addFood(food);
	}

	public void findFood(Coordinate coord) {
		String urlString = "https://maps.googleapis.com/maps/api/place/nearbysearch/json"
				+ "?key=AIzaSyCcRZDChd6Qf4PVLgaYL2GZ4SjCYyvSvKU" + "&location=" + coord.toString() + "&rankby=distance"
				+ "&type=restaurant";
		try {
			URL url = new URL(urlString);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(new InputStreamReader(con.getInputStream(), "UTF-8"));
			JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonObject.get("results").toString());
			Iterator<?> iterator = jsonArray.iterator();
			String rating;
			String price_level;
			String address;
			for (int i = 0; i < 5; i++) {
				jsonObject = (JSONObject) jsonParser.parse(iterator.next().toString());
				if (jsonObject.containsKey("rating")) {
					rating = jsonObject.get("rating").toString();
				} else {
					rating = "Could not find a rating.";
				}
				if (jsonObject.containsKey("price_level")) {
					price_level = jsonObject.get("price_level").toString();
				} else {
					price_level = "Could not find a price level.";
				}
				if (jsonObject.containsKey("vicinity")) {
					address = jsonObject.get("vicinity").toString();
				} else {
					address = "Could not find an Address.";
				}
				foodRepository.addFood(new Food(jsonObject.get("name").toString(), rating, price_level, address,
						new Coordinate(
								Double.parseDouble(
										((Map<?, ?>) ((Map<?, ?>) jsonObject.get("geometry")).get("location"))
												.get("lat").toString()),
								Double.parseDouble(
										((Map<?, ?>) ((Map<?, ?>) jsonObject.get("geometry")).get("location"))
												.get("lng").toString()))));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Collection<Food> chooseFood(String name) {
		return foodRepository.getOne(name);
	}
}
