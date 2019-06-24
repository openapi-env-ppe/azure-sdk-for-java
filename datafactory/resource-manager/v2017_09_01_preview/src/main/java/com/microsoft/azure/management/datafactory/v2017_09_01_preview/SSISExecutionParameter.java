/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSIS execution parameter.
 */
public class SSISExecutionParameter {
    /**
     * SSIS package execution parameter value. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * Get sSIS package execution parameter value. Type: string (or Expression with resultType string).
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set sSIS package execution parameter value. Type: string (or Expression with resultType string).
     *
     * @param value the value value to set
     * @return the SSISExecutionParameter object itself.
     */
    public SSISExecutionParameter withValue(Object value) {
        this.value = value;
        return this;
    }

}