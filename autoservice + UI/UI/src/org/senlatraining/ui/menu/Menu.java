package org.senlatraining.ui.menu;

public class Menu {
	private String name = new String();
	private MenuItem menuItems = new MenuItem();
	
	public String getMenuName(){
		return this.name;
	}
//------------------------------------------------------------------------
	public void setMenuName(String name){
		this.name = name;
	}
//------------------------------------------------------------------------
/*	public String addMenuItem(){
		return this.name;
	}
//------------------------------------------------------------------------
	public void setMenuName(String name){
		this.name = name;
	}*/
}
