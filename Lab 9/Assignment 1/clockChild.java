package l9ass1;
public class clockChild extends clock{
    String meridian;
    
//Method to set the time in 24 Hours format
    public void setTime(int hours, int minutes, int seconds)
    {
	      if(0 <= hours && hours < 24) // 24 hour time format
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
//constructor to ckeck AM/PM
public clockChild(int hours, int minutes, int seconds){
	      super(hours, minutes, seconds);
              if (hours>0 && hours<=12){
                  meridian="PM";
              }else if(hours>12 && hours<24){
                  meridian="AM";
              }
    }
    @Override
     public void printTime(){
        super.printTime();
        System.out.println(meridian);
    } 
}
