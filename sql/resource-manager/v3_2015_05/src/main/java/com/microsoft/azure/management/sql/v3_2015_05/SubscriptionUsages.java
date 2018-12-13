/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2015_05;

import rx.Observable;
import com.microsoft.azure.management.sql.v3_2015_05.SubscriptionUsage;

/**
 * Type representing SubscriptionUsages.
 */
public interface SubscriptionUsages {
    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SubscriptionUsage> getAsync(String locationName, String usageName);

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SubscriptionUsage> listByLocationAsync(final String locationName);

}
