/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage information about the data disks present in the custom image.
 */
public class DataDiskStorageTypeInfoFragment {
    /**
     * Disk Lun.
     */
    @JsonProperty(value = "lun")
    private String lun;

    /**
     * Disk Storage Type. Possible values include: 'Standard', 'Premium'.
     */
    @JsonProperty(value = "storageType")
    private StorageType storageType;

    /**
     * Get disk Lun.
     *
     * @return the lun value
     */
    public String lun() {
        return this.lun;
    }

    /**
     * Set disk Lun.
     *
     * @param lun the lun value to set
     * @return the DataDiskStorageTypeInfoFragment object itself.
     */
    public DataDiskStorageTypeInfoFragment withLun(String lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get disk Storage Type. Possible values include: 'Standard', 'Premium'.
     *
     * @return the storageType value
     */
    public StorageType storageType() {
        return this.storageType;
    }

    /**
     * Set disk Storage Type. Possible values include: 'Standard', 'Premium'.
     *
     * @param storageType the storageType value to set
     * @return the DataDiskStorageTypeInfoFragment object itself.
     */
    public DataDiskStorageTypeInfoFragment withStorageType(StorageType storageType) {
        this.storageType = storageType;
        return this;
    }

}
