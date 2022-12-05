package com.mygame.dao;

public class GameService{
	
	public String[] getcitynameServices(){
		GameDAO gd=new GameDAO();
		String[] cityname=gd.getcityname();
		return cityname;
	}


}
