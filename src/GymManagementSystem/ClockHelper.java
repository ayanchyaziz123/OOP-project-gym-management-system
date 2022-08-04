/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GymManagementSystem;

/**
 *
 * @author My
 */
public class ClockHelper {
    
    
        public String timeh(int hour,int minute,int second)
        {
            String _timeh=null;
            Clock cl=new Clock();
            
        String x= String.valueOf(hour);
        String y=String.valueOf(minute);
        String z=String.valueOf(second);
        String t_time=x+":"+y+":"+z;
        
        _timeh=t_time;
        

        return _timeh;
           
        }
        
       
        public String dateh(int day,int month,int year)
        {
            String _dateh=null;
    
        String x= String.valueOf(day);
        String y=String.valueOf(month);
        String z=String.valueOf(year);
        String t_Date=x+"/"+y+"/"+z;
        _dateh=t_Date;
    
        
        return _dateh;
        } 
    
}
