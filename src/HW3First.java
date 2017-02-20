import stanford.karel.*;

public class HW3First extends SuperKarel{

	public void run(){
		while (notFacingNorth()){
		if (frontIsClear()){
		
			if(noBeepersPresent()){
			PtB();move();}}
			
			if(frontIsClear()){
				move();}
			else {GoB();move();}
			
	
		}}
		
	
	
	
	public void TR(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	public void TL(){
		turnLeft();
	}
	public void PtB(){
		putBeeper();
	}
	public void PckB(){
		pickBeeper();
	}
	public void TA(){
		turnLeft();
		turnLeft();
	}
	public void A(){
		turnLeft();
		turnLeft();
		turnLeft();
		turnLeft();
	}
	public void end(){
		while (frontIsBlocked()){A();};
	}
	public void Tite(){
	if (frontIsClear()){move();}
	else {end();}
	}
	public void GoB(){
		if (facingEast()){
			TA();move();TA();
			if(noBeepersPresent())
			{move();PtB();TL();Tite();
			
			TL();}
			else {move();TL();Tite();
			
			TL();PtB();move();}}
		else {TA();move();TA();
		if(noBeepersPresent())
		{move();TR();Tite();
		
		TR();}
		else {move();TR();Tite();
		
		TR();PtB();move();}}
	}
}
