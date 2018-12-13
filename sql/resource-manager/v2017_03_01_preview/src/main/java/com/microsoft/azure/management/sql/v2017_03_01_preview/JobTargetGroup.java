/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.JobTargetGroupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;
import java.util.List;

/**
 * Type representing JobTargetGroup.
 */
public interface JobTargetGroup extends HasInner<JobTargetGroupInner>, Indexable, Refreshable<JobTargetGroup>, Updatable<JobTargetGroup.Update>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the members value.
     */
    List<JobTarget> members();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the JobTargetGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithJobAgent, DefinitionStages.WithMembers, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of JobTargetGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a JobTargetGroup definition.
         */
        interface Blank extends WithJobAgent {
        }

        /**
         * The stage of the jobtargetgroup definition allowing to specify JobAgent.
         */
        interface WithJobAgent {
           /**
            * Specifies resourceGroupName, serverName, jobAgentName.
            */
            WithMembers withExistingJobAgent(String resourceGroupName, String serverName, String jobAgentName);
        }

        /**
         * The stage of the jobtargetgroup definition allowing to specify Members.
         */
        interface WithMembers {
           /**
            * Specifies members.
            */
            WithCreate withMembers(List<JobTarget> members);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<JobTargetGroup> {
        }
    }
    /**
     * The template for a JobTargetGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<JobTargetGroup>, UpdateStages.WithMembers {
    }

    /**
     * Grouping of JobTargetGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the jobtargetgroup update allowing to specify Members.
         */
        interface WithMembers {
            /**
             * Specifies members.
             */
            Update withMembers(List<JobTarget> members);
        }

    }
}
