/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an Oracle OCI driver.
 */
public class OracleOCIDriverInfo {
    /**
     * The name of the driver package.
     */
    @JsonProperty(value = "driverName", access = JsonProperty.Access.WRITE_ONLY)
    private String driverName;

    /**
     * The size in bytes of the driver package.
     */
    @JsonProperty(value = "driverSize", access = JsonProperty.Access.WRITE_ONLY)
    private String driverSize;

    /**
     * The MD5 Base64 encoded checksum for the driver package.
     */
    @JsonProperty(value = "archiveChecksum", access = JsonProperty.Access.WRITE_ONLY)
    private String archiveChecksum;

    /**
     * The checksum for the driver package provided by Oracle.
     */
    @JsonProperty(value = "oracleChecksum", access = JsonProperty.Access.WRITE_ONLY)
    private String oracleChecksum;

    /**
     * Version listed in the OCI assembly 'oci.dll'.
     */
    @JsonProperty(value = "assemblyVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String assemblyVersion;

    /**
     * List of Oracle database versions supported by this driver. Only major
     * minor of the version is listed.
     */
    @JsonProperty(value = "supportedOracleVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> supportedOracleVersions;

    /**
     * Get the name of the driver package.
     *
     * @return the driverName value
     */
    public String driverName() {
        return this.driverName;
    }

    /**
     * Get the size in bytes of the driver package.
     *
     * @return the driverSize value
     */
    public String driverSize() {
        return this.driverSize;
    }

    /**
     * Get the MD5 Base64 encoded checksum for the driver package.
     *
     * @return the archiveChecksum value
     */
    public String archiveChecksum() {
        return this.archiveChecksum;
    }

    /**
     * Get the checksum for the driver package provided by Oracle.
     *
     * @return the oracleChecksum value
     */
    public String oracleChecksum() {
        return this.oracleChecksum;
    }

    /**
     * Get version listed in the OCI assembly 'oci.dll'.
     *
     * @return the assemblyVersion value
     */
    public String assemblyVersion() {
        return this.assemblyVersion;
    }

    /**
     * Get list of Oracle database versions supported by this driver. Only major minor of the version is listed.
     *
     * @return the supportedOracleVersions value
     */
    public List<String> supportedOracleVersions() {
        return this.supportedOracleVersions;
    }

}
