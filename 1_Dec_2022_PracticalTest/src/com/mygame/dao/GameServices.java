package com.mygame.dao;

public class GameServices {
	public String[] getcitynameServices(){
		GameDAO gd=new GameDAO();
		String[] cityname=gd.getcityname();
		return cityname;
	}

}
