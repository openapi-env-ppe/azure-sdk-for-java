/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Monitoring data for integration runtime node.
 */
public class IntegrationRuntimeNodeMonitoringData {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Name of the integration runtime node.
     */
    @JsonProperty(value = "nodeName", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeName;

    /**
     * Available memory (MB) on the integration runtime node.
     */
    @JsonProperty(value = "availableMemoryInMB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer availableMemoryInMB;

    /**
     * CPU percentage on the integration runtime node.
     */
    @JsonProperty(value = "cpuUtilization", access = JsonProperty.Access.WRITE_ONLY)
    private Double cpuUtilization;

    /**
     * Maximum concurrent jobs on the integration runtime node.
     */
    @JsonProperty(value = "concurrentJobsLimit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer concurrentJobsLimit;

    /**
     * The number of jobs currently running on the integration runtime node.
     */
    @JsonProperty(value = "concurrentJobsRunning", access = JsonProperty.Access.WRITE_ONLY)
    private Integer concurrentJobsRunning;

    /**
     * The maximum concurrent jobs in this integration runtime.
     */
    @JsonProperty(value = "maxConcurrentJobs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxConcurrentJobs;

    /**
     * Sent bytes on the integration runtime node.
     */
    @JsonProperty(value = "sentBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Double sentBytes;

    /**
     * Received bytes on the integration runtime node.
     */
    @JsonProperty(value = "receivedBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Double receivedBytes;

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
     * @return the IntegrationRuntimeNodeMonitoringData object itself.
     */
    public IntegrationRuntimeNodeMonitoringData withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get name of the integration runtime node.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Get available memory (MB) on the integration runtime node.
     *
     * @return the availableMemoryInMB value
     */
    public Integer availableMemoryInMB() {
        return this.availableMemoryInMB;
    }

    /**
     * Get cPU percentage on the integration runtime node.
     *
     * @return the cpuUtilization value
     */
    public Double cpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * Get maximum concurrent jobs on the integration runtime node.
     *
     * @return the concurrentJobsLimit value
     */
    public Integer concurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }

    /**
     * Get the number of jobs currently running on the integration runtime node.
     *
     * @return the concurrentJobsRunning value
     */
    public Integer concurrentJobsRunning() {
        return this.concurrentJobsRunning;
    }

    /**
     * Get the maximum concurrent jobs in this integration runtime.
     *
     * @return the maxConcurrentJobs value
     */
    public Integer maxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    /**
     * Get sent bytes on the integration runtime node.
     *
     * @return the sentBytes value
     */
    public Double sentBytes() {
        return this.sentBytes;
    }

    /**
     * Get received bytes on the integration runtime node.
     *
     * @return the receivedBytes value
     */
    public Double receivedBytes() {
        return this.receivedBytes;
    }

}