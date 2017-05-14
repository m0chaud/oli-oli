package com.compit.programming.basics.oops.concept.inheritance.v1;

/**
 * @author: chaudharimehul
 * @date:	May 14, 2017
 * 
 */
public class BatteryOperated extends Toy {
	
	//number of batteries in toy
	int batteryCount;
	
	//Type of Battery
	BatteryType batteryType;
	
	//Can be operated with remote
	boolean isRemoteOperable;
	
	public void setBatteryCount(int batteryCount){
		this.batteryCount = batteryCount;
	}
	
	public int getBatteryCount(){
		return batteryCount;
	}
	
	public void setBatteryType(BatteryType batteryType){
		this.batteryType = batteryType;
	}
	
	public BatteryType getBatteryType(){
		return batteryType;
	}
	public void setRemoteOperable(boolean isRemoteOperable){
		this.isRemoteOperable = isRemoteOperable;
	}
	
	public boolean isRemoteOperable(){
		return isRemoteOperable;
	}
}
