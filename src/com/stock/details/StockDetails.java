package com.stock.details;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;


public class StockDetails {


	public static void main(String[] args) {
		try {

		    Reader reader = Files.newBufferedReader(Paths.get("resources/products.json"));

			Stocks[] stocks = new Gson().fromJson(reader,Stocks[].class);
			
			List<Stocks> stocksList= Arrays.asList(stocks);
			
			stocksList.stream().filter(s->s.isStock_available()==false).
			collect(Collectors.toList()).forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
