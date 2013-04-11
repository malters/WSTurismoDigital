package com.turismoDigita;

import java.util.ArrayList;

import com.google.gson.Gson;

public class FeedTransFormer {
	
	public static String EventoFeed(ArrayList<Eventos> feedData)
	{
	String feeds = null;
	Gson gson = new Gson();
	feeds = gson.toJson(feedData);
	return feeds;
	}
}
