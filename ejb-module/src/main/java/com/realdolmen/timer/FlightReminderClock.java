package com.realdolmen.timer;


import com.realdolmen.passenger.domain.Flight;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class FlightReminderClock {



    @Schedule(hour= "3" , persistent = false)
    public void sendReminder()  {
        System.out.println("YOUR FLIGHT LEAVES SOON");
    }

}
