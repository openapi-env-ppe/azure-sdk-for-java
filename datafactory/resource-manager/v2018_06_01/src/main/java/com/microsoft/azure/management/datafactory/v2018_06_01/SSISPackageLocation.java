/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSIS package location.
 */
public class SSISPackageLocation {
    /**
     * The SSIS package path. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "packagePath", required = true)
    private Object packagePath;

    /**
     * Get the SSIS package path. Type: string (or Expression with resultType string).
     *
     * @return the packagePath value
     */
    public Object packagePath() {
        return this.packagePath;
    }

    /**
     * Set the SSIS package path. Type: string (or Expression with resultType string).
     *
     * @param packagePath the packagePath value to set
     * @return the SSISPackageLocation object itself.
     */
    public SSISPackageLocation withPackagePath(Object packagePath) {
        this.packagePath = packagePath;
        return this;
    }

}