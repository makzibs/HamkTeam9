package asdf;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class MoveForward extends Thread {
	DataExchange DEObj;

	private static EV3LargeRegulatedMotor leftWheel;
	private static EV3LargeRegulatedMotor rightWheel;

	public MoveForward(DataExchange DE) {
		DEObj = DE;
		leftWheel = new EV3LargeRegulatedMotor(MotorPort.A);
		rightWheel = new EV3LargeRegulatedMotor(MotorPort.D);

		leftWheel.setSpeed(250);
		rightWheel.setSpeed(250);
	}

	public void run() {
		// Infinite Task
		while (true) {
			
			  if (DEObj.getnoDetections() == 2) {
		            // Break out of the loop when noDetections is 2
				  
				  //Celebration
				 
				  leftWheel.stop();
				  rightWheel.stop();
				  
				  leftWheel.backward();
	              rightWheel.backward();
	              Delay.msDelay(1000);
	              
	              leftWheel.setSpeed(300);
	              rightWheel.setSpeed(300);
	              
	              leftWheel.forward();
	              rightWheel.backward();
	              Delay.msDelay(3000);
	              
	              
	              leftWheel.setSpeed(200);
	              rightWheel.setSpeed(200);
	              
	              leftWheel.forward();
	              rightWheel.backward();
	              Delay.msDelay(2000);
	              
	              leftWheel.setSpeed(150);
	              rightWheel.setSpeed(150);
	              
	              leftWheel.forward();
	              rightWheel.backward();
	              Delay.msDelay(2000);
	              
	              leftWheel.setSpeed(100);
	              rightWheel.setSpeed(100);
	              
	              leftWheel.forward();
	              rightWheel.backward();
	              Delay.msDelay(2000);
	              
	              leftWheel.setSpeed(50);
	              rightWheel.setSpeed(50);
	              
	              leftWheel.forward();
	              rightWheel.backward();
	              Delay.msDelay(2000);
	              
	              leftWheel.stop();
				  rightWheel.stop();
				  
				  break;				
		          
			  }
			  
			  
			  
			  else if (!DEObj.getIsObstacleDetected() && DEObj.getIsColourDetected() == 1) {
				leftWheel.forward();
				rightWheel.forward();
			//
				}
				
	
				
			else if(!DEObj.getIsObstacleDetected() ) {
					
			     if (DEObj.getIsColourDetected() == 2) {
					
					//turn left				
			    	 
			    	 
			    	 leftWheel.setSpeed(180);
		                rightWheel.setSpeed(70);
		                leftWheel.forward();
		                rightWheel.forward();
			    	 
			    	 
			    	   
			    	    		    	 
			    		            
										
				}
			      else if (DEObj.getIsColourDetected() == 3) {
				 
				//turn right
			    	    leftWheel.setSpeed(70);
		                rightWheel.setSpeed(180);
		                leftWheel.forward();
		                rightWheel.forward();
			    	 
							
			    	  
				    
			    }
				}
		else if(DEObj.getIsObstacleDetected()) {	
			
			
			
			//takes left turn 
			leftWheel.setSpeed(300);
            rightWheel.setSpeed(100);
            leftWheel.forward();
            rightWheel.forward();
            Delay.msDelay(800);
            
            
            //moves forward
    	 
            leftWheel.setSpeed(150);
            rightWheel.setSpeed(150);
            leftWheel.forward();
            rightWheel.forward();
            Delay.msDelay(2000);
            
            
            //takes right turn
             
            
            leftWheel.setSpeed(100);
            rightWheel.setSpeed(300);
            leftWheel.forward();
            rightWheel.forward();
            Delay.msDelay(1500);
    	  
            		
 			
 			
 			while(DEObj.getIsColourDetected() == 3) {
 			
 			//continues to move forwards until it meets the black track
			 leftWheel.setSpeed(100);
             rightWheel.setSpeed(100);
             leftWheel.forward();
             rightWheel.forward();
	    	
	    	
	    	
	    	 
            
 			}
       
            
				  
			  
			   }
			
			
		      
			
			
			
			
				
		
		}
	}
}
