package org.senlatraining.ui.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private String name = new String();
	private List<MenuItem> menuItems = new ArrayList<MenuItem>();
	
	public Menu(){
	}
//------------------------------------------------------------------------	
	public Menu(String name){
		this.name = name;
	}
//------------------------------------------------------------------------	
	public String getMenuName(){
		return this.name;
	}
//------------------------------------------------------------------------
	public void setMenuName(String name){
		this.name = name;
	}
//------------------------------------------------------------------------
	public void addMenuItem(MenuItem menuItem){
		menuItems.add(menuItem);
	}
//------------------------------------------------------------------------
	public List<MenuItem> getMenuItems(){
		return menuItems;
	}
}
