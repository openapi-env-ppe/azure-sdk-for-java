/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_03;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v3_2017_03.implementation.JobVersionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v3_2017_03.implementation.SqlManager;

/**
 * Type representing JobVersion.
 */
public interface JobVersion extends HasInner<JobVersionInner>, Indexable, Refreshable<JobVersion>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
