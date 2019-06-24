/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The recurrence schedule.
 */
public class RecurrenceSchedule {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The minutes.
     */
    @JsonProperty(value = "minutes")
    private List<Integer> minutes;

    /**
     * The hours.
     */
    @JsonProperty(value = "hours")
    private List<Integer> hours;

    /**
     * The days of the week.
     */
    @JsonProperty(value = "weekDays")
    private List<DaysOfWeek> weekDays;

    /**
     * The month days.
     */
    @JsonProperty(value = "monthDays")
    private List<Integer> monthDays;

    /**
     * The monthly occurrences.
     */
    @JsonProperty(value = "monthlyOccurrences")
    private List<RecurrenceScheduleOccurrence> monthlyOccurrences;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the minutes.
     *
     * @return the minutes value
     */
    public List<Integer> minutes() {
        return this.minutes;
    }

    /**
     * Set the minutes.
     *
     * @param minutes the minutes value to set
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withMinutes(List<Integer> minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * Get the hours.
     *
     * @return the hours value
     */
    public List<Integer> hours() {
        return this.hours;
    }

    /**
     * Set the hours.
     *
     * @param hours the hours value to set
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withHours(List<Integer> hours) {
        this.hours = hours;
        return this;
    }

    /**
     * Get the days of the week.
     *
     * @return the weekDays value
     */
    public List<DaysOfWeek> weekDays() {
        return this.weekDays;
    }

    /**
     * Set the days of the week.
     *
     * @param weekDays the weekDays value to set
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withWeekDays(List<DaysOfWeek> weekDays) {
        this.weekDays = weekDays;
        return this;
    }

    /**
     * Get the month days.
     *
     * @return the monthDays value
     */
    public List<Integer> monthDays() {
        return this.monthDays;
    }

    /**
     * Set the month days.
     *
     * @param monthDays the monthDays value to set
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withMonthDays(List<Integer> monthDays) {
        this.monthDays = monthDays;
        return this;
    }

    /**
     * Get the monthly occurrences.
     *
     * @return the monthlyOccurrences value
     */
    public List<RecurrenceScheduleOccurrence> monthlyOccurrences() {
        return this.monthlyOccurrences;
    }

    /**
     * Set the monthly occurrences.
     *
     * @param monthlyOccurrences the monthlyOccurrences value to set
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withMonthlyOccurrences(List<RecurrenceScheduleOccurrence> monthlyOccurrences) {
        this.monthlyOccurrences = monthlyOccurrences;
        return this;
    }

}