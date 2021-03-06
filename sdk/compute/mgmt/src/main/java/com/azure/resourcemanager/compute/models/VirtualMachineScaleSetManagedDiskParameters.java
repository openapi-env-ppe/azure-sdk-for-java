// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualMachineScaleSetManagedDiskParameters model. */
@Fluent
public final class VirtualMachineScaleSetManagedDiskParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetManagedDiskParameters.class);

    /*
     * Specifies the storage account type for the managed disk. NOTE:
     * UltraSSD_LRS can only be used with data disks, it cannot be used with OS
     * Disk.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountTypes storageAccountType;

    /**
     * Get the storageAccountType property: Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS
     * can only be used with data disks, it cannot be used with OS Disk.
     *
     * @return the storageAccountType value.
     */
    public StorageAccountTypes storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS
     * can only be used with data disks, it cannot be used with OS Disk.
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the VirtualMachineScaleSetManagedDiskParameters object itself.
     */
    public VirtualMachineScaleSetManagedDiskParameters withStorageAccountType(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
