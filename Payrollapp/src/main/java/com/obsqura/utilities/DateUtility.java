package com.obsqura.utilities;

import java.text.*;
import java.time.LocalDateTime;
import java.util.Date;



  
public class DateUtility{
      Date d1;
	public String currentDate() {
		 //Instantiate a Date object
	      Date d1=new Date();

	       //display time and date using toString()//
	      return (d1.toString());
		}
	public String singleFormatDate() {
		Date d1 = new Date( );
	      SimpleDateFormat ft =new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      return(ft.format(d1));
		}
	public String currentDateTime () {
		LocalDateTime myObj = LocalDateTime.now();
		String Localtimedate1=myObj.toString();
	    return(Localtimedate1);
		
	}

}
