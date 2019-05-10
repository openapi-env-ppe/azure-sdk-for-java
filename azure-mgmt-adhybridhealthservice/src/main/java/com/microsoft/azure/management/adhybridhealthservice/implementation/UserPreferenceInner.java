/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The user preference for a given feature.
 */
public class UserPreferenceInner {
    /**
     * The name of the metric.
     */
    @JsonProperty(value = "metricNames")
    private List<String> metricNames;

    /**
     * Get the name of the metric.
     *
     * @return the metricNames value
     */
    public List<String> metricNames() {
        return this.metricNames;
    }

    /**
     * Set the name of the metric.
     *
     * @param metricNames the metricNames value to set
     * @return the UserPreferenceInner object itself.
     */
    public UserPreferenceInner withMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

}