/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GymManagementSystem;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

/**
 *
 * @author My
 */
public class Clock {
    
    
    private int day,month,year,second,minute,hour;
    public String a,b;
    public void  clock()
    {
        Calendar cal=new GregorianCalendar();
        day=cal.get(Calendar.DAY_OF_MONTH);
         month=cal.get(Calendar.MONTH);
         year=cal.get(Calendar.YEAR);
        
         second=cal.get(Calendar.SECOND);
         minute=cal.get(Calendar.MINUTE);
         hour=cal.get(Calendar.HOUR);
         
        ClockHelper msob  = new ClockHelper();
         a=msob.dateh(day,month,year);
         b=msob.timeh(hour,minute,second);
         
      
    }
    
    
}
