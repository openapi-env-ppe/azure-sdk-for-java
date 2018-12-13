/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SyncGroupLogPropertiesInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;
import java.util.UUID;

/**
 * Type representing SyncGroupLogProperties.
 */
public interface SyncGroupLogProperties extends HasInner<SyncGroupLogPropertiesInner>, HasManager<SqlManager> {
    /**
     * @return the details value.
     */
    String details();

    /**
     * @return the operationStatus value.
     */
    String operationStatus();

    /**
     * @return the source value.
     */
    String source();

    /**
     * @return the timestamp value.
     */
    DateTime timestamp();

    /**
     * @return the tracingId value.
     */
    UUID tracingId();

    /**
     * @return the type value.
     */
    SyncGroupLogType type();

}
