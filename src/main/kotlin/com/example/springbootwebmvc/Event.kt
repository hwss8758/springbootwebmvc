package com.example.springbootwebmvc

import java.time.LocalDateTime

data class Event(var name: String,
                 var limitOfEnrollment: Int,
                 var startDateTime: LocalDateTime,
                 var endDateTime: LocalDateTime)