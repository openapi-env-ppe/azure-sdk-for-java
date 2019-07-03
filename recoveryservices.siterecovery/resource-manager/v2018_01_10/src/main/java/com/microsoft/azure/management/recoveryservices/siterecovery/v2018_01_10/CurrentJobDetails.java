/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Current job details of the migration item.
 */
public class CurrentJobDetails {
    /**
     * The job name.
     */
    @JsonProperty(value = "jobName")
    private String jobName;

    /**
     * The ARM Id of the job being executed.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /**
     * The start time of the job.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Get the job name.
     *
     * @return the jobName value
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * Set the job name.
     *
     * @param jobName the jobName value to set
     * @return the CurrentJobDetails object itself.
     */
    public CurrentJobDetails withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Get the ARM Id of the job being executed.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the ARM Id of the job being executed.
     *
     * @param jobId the jobId value to set
     * @return the CurrentJobDetails object itself.
     */
    public CurrentJobDetails withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the start time of the job.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time of the job.
     *
     * @param startTime the startTime value to set
     * @return the CurrentJobDetails object itself.
     */
    public CurrentJobDetails withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

}