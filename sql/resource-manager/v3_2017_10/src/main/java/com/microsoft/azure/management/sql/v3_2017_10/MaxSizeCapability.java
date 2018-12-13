/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The maximum size capability.
 */
public class MaxSizeCapability {
    /**
     * The maximum size limit (see 'unit' for the units).
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /**
     * The units that the limit is expressed in. Possible values include:
     * 'Megabytes', 'Gigabytes', 'Terabytes', 'Petabytes'.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeUnit unit;

    /**
     * Get the maximum size limit (see 'unit' for the units).
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the units that the limit is expressed in. Possible values include: 'Megabytes', 'Gigabytes', 'Terabytes', 'Petabytes'.
     *
     * @return the unit value
     */
    public MaxSizeUnit unit() {
        return this.unit;
    }

}
