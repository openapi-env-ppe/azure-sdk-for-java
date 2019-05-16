/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation.HanaOnAzureManager;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation.HanaInstanceInner;

/**
 * Type representing HanaInstance.
 */
public interface HanaInstance extends HasInner<HanaInstanceInner>, Resource, GroupableResourceCore<HanaOnAzureManager, HanaInstanceInner>, HasResourceGroup, Refreshable<HanaInstance>, Updatable<HanaInstance.Update>, HasManager<HanaOnAzureManager> {
    /**
     * @return the hanaInstanceId value.
     */
    String hanaInstanceId();

    /**
     * @return the hardwareProfile value.
     */
    HardwareProfile hardwareProfile();

    /**
     * @return the hwRevision value.
     */
    String hwRevision();

    /**
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * @return the osProfile value.
     */
    OSProfile osProfile();

    /**
     * @return the partnerNodeId value.
     */
    String partnerNodeId();

    /**
     * @return the powerState value.
     */
    HanaInstancePowerStateEnum powerState();

    /**
     * @return the provisioningState value.
     */
    HanaProvisioningStatesEnum provisioningState();

    /**
     * @return the proximityPlacementGroup value.
     */
    String proximityPlacementGroup();

    /**
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * The entirety of the HanaInstance definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of HanaInstance definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a HanaInstance definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the HanaInstance definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<HanaInstance>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a HanaInstance update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<HanaInstance>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of HanaInstance update stages.
     */
    interface UpdateStages {
    }
}