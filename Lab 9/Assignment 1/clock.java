package l9ass1;
public class clock {
     int hr;  //store hours
     int min; //store minutes
     int sec; //store seconds

//Default constructor	        
    public clock()
    {
        setTime(0, 0, 0);  // sets hours, min, sec to 0 if out of range i.e 0-12
    }
//arg constructor, to set the time
    public clock(int hours, int minutes, int seconds)
    {
	      setTime(hours, minutes, seconds);
    }
//Method to set the time
    public void setTime(int hours, int minutes, int seconds)
    {
	      if(0 <= hours && hours < 12) // 12 hour time format
		       hr = hours;
	      else
		       hr = 0; //default value
              //checking minutes
              if(0 <= minutes && minutes < 60)
		       min = minutes;
	      else
		       min = 0;
              //checking seconds
	      if(0 <= seconds && seconds < 60)
		       sec = seconds;
	      else
	         sec = 0;
    }

 //getter Methods 
    public int getHours()
    {
	        return hr;
    }
    public int getMinutes()
    {
	        return min;
    }
    public int getSeconds()
    {
	        return sec;
    }

//display method
    public void printTime(){
        System.out.println(this.getHours()+" Hour "+this.getMinutes()+" minutes "+this.getSeconds()+" seconds");
    }    
    }

