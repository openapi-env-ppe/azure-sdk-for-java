/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ingest fragment dropped event data.
 */
public class MediaLiveEventIngestHeartbeatEventData {
    /**
     * Gets the type of the track (Audio / Video).
     */
    @JsonProperty(value = "trackType", access = JsonProperty.Access.WRITE_ONLY)
    private String trackType;

    /**
     * Gets the track name.
     */
    @JsonProperty(value = "trackName", access = JsonProperty.Access.WRITE_ONLY)
    private String trackName;

    /**
     * Gets the bitrate of the track.
     */
    @JsonProperty(value = "bitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Long bitrate;

    /**
     * Gets the incoming bitrate.
     */
    @JsonProperty(value = "incomingBitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Long incomingBitrate;

    /**
     * Gets the last timestamp.
     */
    @JsonProperty(value = "lastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String lastTimestamp;

    /**
     * Gets the timescale of the last timestamp.
     */
    @JsonProperty(value = "timescale", access = JsonProperty.Access.WRITE_ONLY)
    private String timescale;

    /**
     * Gets the fragment Overlap count.
     */
    @JsonProperty(value = "overlapCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long overlapCount;

    /**
     * Gets the fragment Discontinuity count.
     */
    @JsonProperty(value = "discontinuityCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long discontinuityCount;

    /**
     * Gets Non increasing count.
     */
    @JsonProperty(value = "nonincreasingCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long nonincreasingCount;

    /**
     * Gets a value indicating whether unexpected bitrate is present or not.
     */
    @JsonProperty(value = "unexpectedBitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean unexpectedBitrate;

    /**
     * Gets the state of the live event.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * Gets a value indicating whether preview is healthy or not.
     */
    @JsonProperty(value = "healthy", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean healthy;

    /**
     * Get gets the type of the track (Audio / Video).
     *
     * @return the trackType value
     */
    public String trackType() {
        return this.trackType;
    }

    /**
     * Get gets the track name.
     *
     * @return the trackName value
     */
    public String trackName() {
        return this.trackName;
    }

    /**
     * Get gets the bitrate of the track.
     *
     * @return the bitrate value
     */
    public Long bitrate() {
        return this.bitrate;
    }

    /**
     * Get gets the incoming bitrate.
     *
     * @return the incomingBitrate value
     */
    public Long incomingBitrate() {
        return this.incomingBitrate;
    }

    /**
     * Get gets the last timestamp.
     *
     * @return the lastTimestamp value
     */
    public String lastTimestamp() {
        return this.lastTimestamp;
    }

    /**
     * Get gets the timescale of the last timestamp.
     *
     * @return the timescale value
     */
    public String timescale() {
        return this.timescale;
    }

    /**
     * Get gets the fragment Overlap count.
     *
     * @return the overlapCount value
     */
    public Long overlapCount() {
        return this.overlapCount;
    }

    /**
     * Get gets the fragment Discontinuity count.
     *
     * @return the discontinuityCount value
     */
    public Long discontinuityCount() {
        return this.discontinuityCount;
    }

    /**
     * Get gets Non increasing count.
     *
     * @return the nonincreasingCount value
     */
    public Long nonincreasingCount() {
        return this.nonincreasingCount;
    }

    /**
     * Get gets a value indicating whether unexpected bitrate is present or not.
     *
     * @return the unexpectedBitrate value
     */
    public Boolean unexpectedBitrate() {
        return this.unexpectedBitrate;
    }

    /**
     * Get gets the state of the live event.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Get gets a value indicating whether preview is healthy or not.
     *
     * @return the healthy value
     */
    public Boolean healthy() {
        return this.healthy;
    }

}