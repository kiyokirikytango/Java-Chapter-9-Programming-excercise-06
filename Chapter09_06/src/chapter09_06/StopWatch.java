
package chapter09_06;

class StopWatch {
     private long startTime;
    private long endTime;               //private data fields with getter methods
    
  long getStartTime(){
        return startTime;
  }  
     long getEndTime(){
        return endTime;
  } 
     StopWatch() {
		startTime = System.currentTimeMillis();
	}                                                           
  
  public void start() {
        startTime = System.currentTimeMillis();
    }                                                   //method that rests the time to current time

    public void stop() {
       endTime = System.currentTimeMillis();
    }                                                   // method that sets the time to curernt time

    public long getElapsedTime() {
        return endTime - startTime;                             //method that shows the differnce between startime and endtime
    }
}
     
    

