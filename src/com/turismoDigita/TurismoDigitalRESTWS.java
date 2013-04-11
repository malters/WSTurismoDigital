package com.turismoDigita;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/turismoDigital")
public class TurismoDigitalRESTWS {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLTurismoDigitalInfo(){
		
		return "<html> " + "<title>" + "Turismo Digital Info" + "</title>"
		+"<body><h1>" + "Test REST" + "</h1></body>" + "</html>";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getXMLTurismoDigitalInfo(){
		
		return "Test REST";
	}
	
	@GET
	@Path("/GetEventos")
	@Produces("application/json")
	public String getEventosTurismoDigitalInfo(){
		
		String feeds = null;
		try 
		{
		ArrayList<Eventos> feedData = new ArrayList<Eventos>();
		
		Eventos feedObject = new Eventos();
		feedObject.setMsg_id("1");
		feedObject.setMessage("Fiestas del Pilar");
		feedObject.setFecha("12/10/2013");
		
		feedData.add(feedObject);
		
		Eventos feedObject2 = new Eventos();
		feedObject2.setMsg_id("2");
		feedObject2.setMessage("Cinco Marzada");
		feedObject2.setFecha("05/03/2013");
		
		feedData.add(feedObject2);
		
		feeds=FeedTransFormer.EventoFeed(feedData);
		}
		catch (Exception e)
		{
		System.out.println("Exception Error"); //Console 
		}
		return feeds;
	}
	
	@PUT
	@Path("{idNumber}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateTurismoDigitalInfo(@PathParam("idNumber")  Integer idNumber){
		
		return "Test REST";
	}
}
