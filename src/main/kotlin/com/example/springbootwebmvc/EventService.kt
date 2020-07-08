package com.example.springbootwebmvc

import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class EventService {

    fun getEvent(): List<Event> {
        var event1: Event = Event(name = "스프링웹MVC스터디1차",
                limitOfEnrollment = 5,
                startDateTime = LocalDateTime.of(2019, 1, 10, 14, 30),
                endDateTime = LocalDateTime.of(2019, 1, 15, 14, 30))

        var event2: Event = Event(name = "스프링웹MVC스터디2차",
                limitOfEnrollment = 5,
                startDateTime = LocalDateTime.of(2019, 2, 10, 14, 30),
                endDateTime = LocalDateTime.of(2019, 2, 15, 14, 30))

        return listOf(event1, event2)
    }
}