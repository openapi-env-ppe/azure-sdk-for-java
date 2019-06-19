/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error info.
 */
public class ErrorInfo {
    /**
     * The error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * Get the error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the error code.
     *
     * @param code the code value to set
     * @return the ErrorInfo object itself.
     */
    public ErrorInfo withCode(String code) {
        this.code = code;
        return this;
    }

}
