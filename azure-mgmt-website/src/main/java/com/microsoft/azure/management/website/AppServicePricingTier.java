/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines App service pricing tiers.
 */
public enum AppServicePricingTier {
    /** Free app service plan. */
    FREE_F1("Free", "F1"),

    /** App service plan with shared infrastructure. */
    SHARED_D1("Shared", "D1"),

    /** Basic pricing tier with a small size. */
    BASIC_B1("Basic", "B1"),

    /** Basic pricing tier with a medium size. */
    BASIC_B2("Basic", "B2"),

    /** Basic pricing tier with a large size. */
    BASIC_B3("Basic", "B3"),

    /** Standard pricing tier with a small size. */
    STANDARD_S1("Standard", "S1"),

    /** Standard pricing tier with a medium size. */
    STANDARD_S2("Standard", "S2"),

    /** Standard pricing tier with a large size. */
    STANDARD_S3("Standard", "S3"),

    /** Premium pricing tier with a small size. */
    PREMIUM_P1("Premium", "P1"),

    /** Premium pricing tier with a medium size. */
    PREMIUM_P2("Premium", "P2"),

    /** Premium pricing tier with a large size. */
    PREMIUM_P3("Premium", "P3");

    /** The actual serialized value for a SiteAvailabilityState instance. */
    private SkuDescription skuDescription;

    AppServicePricingTier(String tier, String size) {
        this.skuDescription = new SkuDescription()
                .withName(size)
                .withTier(tier)
                .withSize(size);
    }

    /**
     * Parses a serialized value to an AppServicePricingTier instance.
     *
     * @param skuDescription the serialized value to parse.
     * @return the parsed AppServicePricingTier object, or null if unable to parse.
     */
    public static AppServicePricingTier fromSkuDescription(SkuDescription skuDescription) {
        AppServicePricingTier[] items = AppServicePricingTier.values();
        for (AppServicePricingTier item : items) {
            if (item.skuDescription.tier().equalsIgnoreCase(skuDescription.tier())
                    && item.skuDescription.size().equalsIgnoreCase(skuDescription.size())) {
                return item;
            }
        }
        return null;
    }

    /**
     * @return the underneath sku description
     */
    @JsonValue
    public SkuDescription toSkuDescription() {
        return this.skuDescription;
    }

    @Override
    public String toString() {
        return this.skuDescription.tier() + "_" + this.skuDescription.size();
    }
}