package com.compit.programming.basics.oops.concept.inheritance.v1;

/**
 * @author: chaudharimehul
 * @date:	May 14, 2017
 * 
 * Version v1 (basic), of inheritance
 * 
 */
public class Toy {
	
	//Toy can be movable or not
	boolean isMovable;
	
	//noice level made by toy. 1 .. 10. 10 being the highest noice level
	int noiceLevel;
	
	//is it possible to ride on toy
	boolean isRideable;
	
	//Toy Size
	Size size;
	
	public void setMovable(boolean isMovable){
		this.isMovable = isMovable;
	}

	public boolean isMovable(){
		return isMovable;
	}
	
	public void setNoiceLevel(int noiceLevel){
		this.noiceLevel = noiceLevel;
	}
	
	public int getNoiceLevel(){
		return noiceLevel;
	}

	public void setRideable(boolean isRideable){
		this.isRideable = isRideable;
	}
	
	public boolean isRideable(){
		return isRideable;
	}
	
	public void setSize(Size size){
		this.size = size;
	}
	
	public Size getSize(){
		return size;
	}
}

