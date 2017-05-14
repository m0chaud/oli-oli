package com.compit.programming.basics.oops.concept.inheritance.v1;

/**
 * @author: chaudharimehul
 * @date:	May 14, 2017
 * 
 */
public class NonBatteryOperated extends Toy {

	//Energy level required to play the toy. 1-->10 10 is highest
	int energyLevelRequired; 
	
	//Can be operated by
	OperatedBy operatedBy;
	
	public void setEnergyLevelRequired(int energyLevelRequired){
		this.energyLevelRequired = energyLevelRequired;
	}
	
	public int getEnergyLevelRequired(){
		return energyLevelRequired;
	}
	
	public void setOperatedBy(OperatedBy operatedBy){
		this.operatedBy = operatedBy;
	}
	
	public OperatedBy getOperatedBy(){
		return operatedBy;
	}
}
