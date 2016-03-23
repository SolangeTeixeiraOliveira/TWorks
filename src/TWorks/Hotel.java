package TWorks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Hotel {
	private List<Hotel> hotels;
	
	private String type;
	private String name;
	private int stars;
	private int weekday_regular_price;
	private int weekday_rewards_price;
	private int weekend_regular_price;
	private int weekend_rewards_price;

	public Hotel(String type, String name, int stars, int weekday_regular_price, int weekday_rewards_price, int weekend_regular_price, int weekend_rewards_price){
		this.hotels = new ArrayList<Hotel>();
		this.name =name;
		this.stars = stars;
		this.weekday_regular_price = weekday_regular_price;
		this.weekday_rewards_price = weekday_rewards_price;
		this.weekend_regular_price = weekend_regular_price;
		this.weekend_rewards_price = weekend_rewards_price;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public int getWeekday_regular_price() {
		return weekday_regular_price;
	}

	public void setWeekday_regular_price(int weekday_regular_price) {
		this.weekday_regular_price = weekday_regular_price;
	}

	public int getWeekday_rewards_price() {
		return weekday_rewards_price;
	}

	public void setWeekday_rewards_price(int weekday_rewards_price) {
		this.weekday_rewards_price = weekday_rewards_price;
	}

	public int getWeekend_regular_price() {
		return weekend_regular_price;
	}

	public void setWeekend_regular_price(int weekend_regular_price) {
		this.weekend_regular_price = weekend_regular_price;
	}

	public int getWeekend_rewards_price() {
		return weekend_rewards_price;
	}

	public void setWeekend_rewards_price(int weekend_rewards_price) {
		this.weekend_rewards_price = weekend_rewards_price;
	}

	public int calcRegularPrice(int qtdWeekday, int qtdWeekend){
		return ((weekday_regular_price * qtdWeekday) + (weekend_regular_price * qtdWeekend));
	}

	public int calcRewardsPrice(int qtdWeekday, int qtdWeekend){
		return ((weekday_rewards_price * qtdWeekday) + (weekend_rewards_price * qtdWeekend));
	}

	//calculate the best price for each customer and show each value and hotel's name
	public void calcBestPrice(int qtdWeekday, int qtdWeekend){

		int numhotels;
		int best_index = 0;
		int best_price = 0;
		int i;

		if (type.equals("Regular")){
			best_price = calcRegularPrice(qtdWeekday, qtdWeekend);
		}
		else if (type.equals("Rewards")){
			best_price = calcRewardsPrice(qtdWeekday, qtdWeekend);
		}
		else {
			//informar tipo invalido e nao ir para o proximo for
		}
		if (type.equals("Regular") || type.equals("Rewards")) //garate tipo valido
			for (i=1; i<numhotels; i++)
			{
				int price = 0;
				if (type.equals("Regular")){
					price = hotels[i].weekday_regular_price * qtdWeekday + hotels[0].weekend_regular_price * qtdWeekend;
				}else if (type.equals("Rewards")){
					price = hotels[i].weekday_rewards_price * qtdWeekday + hotels[0].weekend_rewards_price * qtdWeekend;

				}if (price > 0 && price < best_price){
					best_index = i; // se menor preco atualiza
				}else if (price > 0 && price = best_price && hotels[i].stars > hotels[best_index].stars){
					best_index = i;  // se menor preco e mais estrelas atualiza
				}
			}
	}
}



//	public int calRegularPrice(int qtdWeekday, int qtdWeekend){
//		return ((weekday_regular_price  qtdWeekday) + (weekend_regular_price  qtdWeekend));
//	}


//	public int calRewardPrice(int qtdWeekday, int qtdWeekend){
//		return ((weekday_reward_price  qtdWeekday) + (weekend_reward_price  qtdWeekend));
//	}



//}
*/


