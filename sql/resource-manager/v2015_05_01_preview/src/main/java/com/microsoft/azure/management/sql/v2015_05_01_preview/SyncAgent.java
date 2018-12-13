/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SyncAgentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;

/**
 * Type representing SyncAgent.
 */
public interface SyncAgent extends HasInner<SyncAgentInner>, Indexable, Refreshable<SyncAgent>, Updatable<SyncAgent.Update>, HasManager<SqlManager> {
    /**
     * @return the expiryTime value.
     */
    DateTime expiryTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isUpToDate value.
     */
    Boolean isUpToDate();

    /**
     * @return the lastAliveTime value.
     */
    DateTime lastAliveTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    SyncAgentState state();

    /**
     * @return the syncAgentName value.
     */
    String syncAgentName();

    /**
     * @return the syncDatabaseId value.
     */
    String syncDatabaseId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the version value.
     */
    String version();

    /**
     * The entirety of the SyncAgent definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SyncAgent definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SyncAgent definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the syncagent definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SyncAgent> {
        }
    }
    /**
     * The template for a SyncAgent update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SyncAgent> {
    }

    /**
     * Grouping of SyncAgent update stages.
     */
    interface UpdateStages {
    }
}
