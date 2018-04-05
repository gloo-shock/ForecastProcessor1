package com.forecast.entries

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "ForecastsAndResults")
abstract class AbstractResult(val hostScore: Int,
                              val guestScore: Int,
                              val isMatchResult: Boolean) : DatabaseEntry() {
    fun getDiff(): Int {
        return hostScore - guestScore;
    }
}