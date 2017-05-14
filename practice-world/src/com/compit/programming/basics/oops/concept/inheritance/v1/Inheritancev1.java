package com.compit.programming.basics.oops.concept.inheritance.v1;

/**
 * @author: chaudharimehul
 * @date:	May 14, 2017
 * 
 */
public class Inheritancev1{
	
	public static void main(String[] arguments){
		
		BatteryOperated redCar = new BatteryOperated();
		NonBatteryOperated jcb = new NonBatteryOperated();
		
		BatteryOperated guitar = new BatteryOperated();
		NonBatteryOperated abacus =  new NonBatteryOperated(); 
		
		redCar.setMovable(true);
		redCar.setRideable(false);
		redCar.setNoiceLevel(4);
		redCar.setSize(Size.MEDIUM);
		
		redCar.setBatteryCount(5);
		redCar.setBatteryType(BatteryType.AA);
		redCar.setRemoteOperable(true);
		
		jcb.setMovable(true);
		jcb.setRideable(false);
		jcb.setNoiceLevel(1);
		jcb.setSize(Size.MEDIUM);
		
		jcb.setEnergyLevelRequired(3);
		jcb.setOperatedBy(OperatedBy.HAND);
		
		guitar.setMovable(false);
		guitar.setRideable(false);
		guitar.setNoiceLevel(5);
		guitar.setSize(Size.MEDIUM);
		
		guitar.setBatteryCount(3);
		guitar.setRemoteOperable(false);
		guitar.setBatteryType(BatteryType.AA);
		
		abacus.setMovable(false);
		abacus.setRideable(false);
		abacus.setNoiceLevel(0);
		abacus.setSize(Size.MEDIUM);
		
		abacus.setEnergyLevelRequired(1);
		abacus.setOperatedBy(OperatedBy.HAND);
		
		
		String sysOutSeperator = "------------------------------------";
		
		System.out.println(" redCar -- Movable --> " + redCar.isMovable());
		System.out.println(" redCar -- Rideable --> "+ redCar.isRideable());
		System.out.println(" redCar -- NoiceLevel --> " + redCar.getNoiceLevel());
		System.out.println(" redCar -- Size --> " + redCar.getSize());
		System.out.println(" redCar -- BatteryCount --> " + redCar.getBatteryCount());
		System.out.println(" redCar -- Battery Type --> " + redCar.getBatteryType());
		System.out.println(" redCar -- RemoteOperable --> " + redCar.isRemoteOperable());
		
		System.out.println(sysOutSeperator);
		
		System.out.println(" jcb -- Movable --> " + jcb.isMovable());
		System.out.println(" jcb -- Rideable --> " + jcb.isRideable());
		System.out.println(" jcb -- NoiceLevel --> " + jcb.getNoiceLevel());
		System.out.println(" jcb -- Size --> "+ jcb.getSize());
		System.out.println(" jcb -- EnergyLevelRequired --> " + jcb.getEnergyLevelRequired() );
		System.out.println(" jcb -- OperatedBy --> " + jcb.getOperatedBy() );
		
		System.out.println(sysOutSeperator);
		
		System.out.println(" guitar -- Movable --> " + guitar.isMovable() );
		System.out.println(" guitar -- Rideable --> " + guitar.isRideable());
		System.out.println(" guitar -- NoiceLevel --> " + guitar.getNoiceLevel() );
		System.out.println(" guitar -- Size --> " + guitar.getSize() );
		System.out.println( " guitar -- BatteryCount --> " +guitar.getBatteryCount() );
		System.out.println(" guitar -- BatteryType --> " + guitar.getBatteryType() );
		System.out.println(" guitar -- Remote Operable --> "+  guitar.isRemoteOperable() );
		
		System.out.println(sysOutSeperator);
		
		System.out.println(" abacus -- Movable --> "  + abacus.isMovable() );
		System.out.println(" abacus -- Rideable --> " + abacus.isRideable() );
		System.out.println(" abacus -- NoiceLeve --> " + abacus.getNoiceLevel() );
		System.out.println(" abacus -- Size --> " + abacus.getSize() );
		System.out.println(" abacus -- EnergyLevelRequired --> " + abacus.getEnergyLevelRequired() );
		System.out.println(" abacus -- OperatedBy --> " + abacus.getOperatedBy() );
	}
}