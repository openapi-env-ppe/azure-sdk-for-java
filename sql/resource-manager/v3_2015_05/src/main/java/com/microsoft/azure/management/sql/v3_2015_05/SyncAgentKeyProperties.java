/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2015_05;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v3_2015_05.implementation.SqlManager;
import com.microsoft.azure.management.sql.v3_2015_05.implementation.SyncAgentKeyPropertiesInner;

/**
 * Type representing SyncAgentKeyProperties.
 */
public interface SyncAgentKeyProperties extends HasInner<SyncAgentKeyPropertiesInner>, HasManager<SqlManager> {
    /**
     * @return the syncAgentKey value.
     */
    String syncAgentKey();

}
