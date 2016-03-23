package TWorks;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

//create hotels's list


public class Hotel {
	public List<Hotel> hotels; 
	private String name;
	private int stars;
	private int weekday_regular_price;
	private int weekday_rewards_price;
	private int weekend_regular_price;
	private int weekend_rewards_price;



	public Hotel(String name, int stars, int weekday_regular_price, int weekday_rewards_price, int weekend_regular_price, int weekend_rewards_price){
		this.name = name;
		this.stars = stars;
		this.weekday_regular_price = weekday_regular_price;
		this.weekday_rewards_price = weekday_rewards_price;
		this.weekend_regular_price = weekend_regular_price;
		this.weekend_rewards_price = weekend_rewards_price;
	}

	//create list of inputs
	
	// Add hotel in a list
	//add each hotel in the list lista.add(new Hotel(parameters));
	public void addHotel(int hotelName) {
		hotels.add(new Hotel(name));
	}


	//output result
	public void showResult(){

	}
	//calculate the best price for each customer and show each value and hotel's name
	public void calBestPrice(){

		int type, regular, rewards, numhotels;
		int best_index = 0;
		int best_price = 0;
		int i;

		if (type==regular){
			best_price = hotels[0].weekday_regular_price * qtdWeekday + hotels[0].weekend_regular_price * qtdWeekend;
		}
		else if (type==rewards){
			best_price = hotels[0].weekday_rewards_price * qtdWeekday + hotels[0].weekend_rewards_price * qtdWeekend;
		}
		else
			//informar tipo invalido e nao ir para o proximo for

			if (type==regular || type==rewards) //garate tipo valido
				for (i=1; i<numhotels; i++)
				{
					int price = 0;
					if (type==regular)
						price = hotels[i].weekday_regular_price * qtdWeekday + hotels[0].weekend_regular_price * qtdWeekend;
					else if (type==rewards)
						price = hotels[i].weekday_rewards_price * qtdWeekday + hotels[0].weekend_rewards_price * qtdWeekend;

					if (price > 0 && price < best_price)
						best_index = i; // se menor preco atualiza
					else if (price > 0 && price = best_price && hotels[i].stars > hotels[best_index].stars)
						best_index = i;  // se menor preco e mais estrelas atualiza
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



