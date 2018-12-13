/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import rx.Observable;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.EncryptionProtectorInner;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.EncryptionProtectorsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing EncryptionProtectors.
 */
public interface EncryptionProtectors extends HasInner<EncryptionProtectorsInner> {
    /**
     * Gets a list of server encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EncryptionProtector> listByServerAsync(final String resourceGroupName, final String serverName);

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EncryptionProtector> getAsync(String resourceGroupName, String serverName);

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EncryptionProtector> createOrUpdateAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters);

}
