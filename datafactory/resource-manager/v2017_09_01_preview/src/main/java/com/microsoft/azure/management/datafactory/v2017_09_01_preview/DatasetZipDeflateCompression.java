/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ZipDeflate compression method used on a dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ZipDeflate")
public class DatasetZipDeflateCompression extends DatasetCompression {
    /**
     * The ZipDeflate compression level.
     */
    @JsonProperty(value = "level")
    private Object level;

    /**
     * Get the ZipDeflate compression level.
     *
     * @return the level value
     */
    public Object level() {
        return this.level;
    }

    /**
     * Set the ZipDeflate compression level.
     *
     * @param level the level value to set
     * @return the DatasetZipDeflateCompression object itself.
     */
    public DatasetZipDeflateCompression withLevel(Object level) {
        this.level = level;
        return this;
    }

}