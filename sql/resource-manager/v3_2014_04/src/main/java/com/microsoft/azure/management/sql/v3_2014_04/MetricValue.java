/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents database metrics.
 */
public class MetricValue {
    /**
     * The number of values for the metric.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Double count;

    /**
     * The average value of the metric.
     */
    @JsonProperty(value = "average", access = JsonProperty.Access.WRITE_ONLY)
    private Double average;

    /**
     * The max value of the metric.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Double maximum;

    /**
     * The min value of the metric.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Double minimum;

    /**
     * The metric timestamp (ISO-8601 format).
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * The total value of the metric.
     */
    @JsonProperty(value = "total", access = JsonProperty.Access.WRITE_ONLY)
    private Double total;

    /**
     * Get the number of values for the metric.
     *
     * @return the count value
     */
    public Double count() {
        return this.count;
    }

    /**
     * Get the average value of the metric.
     *
     * @return the average value
     */
    public Double average() {
        return this.average;
    }

    /**
     * Get the max value of the metric.
     *
     * @return the maximum value
     */
    public Double maximum() {
        return this.maximum;
    }

    /**
     * Get the min value of the metric.
     *
     * @return the minimum value
     */
    public Double minimum() {
        return this.minimum;
    }

    /**
     * Get the metric timestamp (ISO-8601 format).
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the total value of the metric.
     *
     * @return the total value
     */
    public Double total() {
        return this.total;
    }

}
