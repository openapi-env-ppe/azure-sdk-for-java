/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.DatabaseConnectionPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;

/**
 * Type representing DatabaseConnectionPolicy.
 */
public interface DatabaseConnectionPolicy extends HasInner<DatabaseConnectionPolicyInner>, Indexable, Refreshable<DatabaseConnectionPolicy>, Updatable<DatabaseConnectionPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the proxyDnsName value.
     */
    String proxyDnsName();

    /**
     * @return the proxyPort value.
     */
    String proxyPort();

    /**
     * @return the redirectionState value.
     */
    String redirectionState();

    /**
     * @return the securityEnabledAccess value.
     */
    String securityEnabledAccess();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the useServerDefault value.
     */
    String useServerDefault();

    /**
     * @return the visibility value.
     */
    String visibility();

    /**
     * The entirety of the DatabaseConnectionPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatabaseConnectionPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatabaseConnectionPolicy definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the databaseconnectionpolicy definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, serverName, databaseName.
            */
            WithCreate withExistingDatabasis(String resourceGroupName, String serverName, String databaseName);
        }

        /**
         * The stage of the databaseconnectionpolicy definition allowing to specify ProxyDnsName.
         */
        interface WithProxyDnsName {
            /**
             * Specifies proxyDnsName.
             */
            WithCreate withProxyDnsName(String proxyDnsName);
        }

        /**
         * The stage of the databaseconnectionpolicy definition allowing to specify ProxyPort.
         */
        interface WithProxyPort {
            /**
             * Specifies proxyPort.
             */
            WithCreate withProxyPort(String proxyPort);
        }

        /**
         * The stage of the databaseconnectionpolicy definition allowing to specify RedirectionState.
         */
        interface WithRedirectionState {
            /**
             * Specifies redirectionState.
             */
            WithCreate withRedirectionState(String redirectionState);
        }

        /**
         * The stage of the databaseconnectionpolicy definition allowing to specify SecurityEnabledAccess.
         */
        interface WithSecurityEnabledAccess {
            /**
             * Specifies securityEnabledAccess.
             */
            WithCreate withSecurityEnabledAccess(String securityEnabledAccess);
        }

        /**
         * The stage of the databaseconnectionpolicy definition allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             */
            WithCreate withState(String state);
        }

        /**
         * The stage of the databaseconnectionpolicy definition allowing to specify UseServerDefault.
         */
        interface WithUseServerDefault {
            /**
             * Specifies useServerDefault.
             */
            WithCreate withUseServerDefault(String useServerDefault);
        }

        /**
         * The stage of the databaseconnectionpolicy definition allowing to specify Visibility.
         */
        interface WithVisibility {
            /**
             * Specifies visibility.
             */
            WithCreate withVisibility(String visibility);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatabaseConnectionPolicy>, DefinitionStages.WithProxyDnsName, DefinitionStages.WithProxyPort, DefinitionStages.WithRedirectionState, DefinitionStages.WithSecurityEnabledAccess, DefinitionStages.WithState, DefinitionStages.WithUseServerDefault, DefinitionStages.WithVisibility {
        }
    }
    /**
     * The template for a DatabaseConnectionPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatabaseConnectionPolicy>, UpdateStages.WithProxyDnsName, UpdateStages.WithProxyPort, UpdateStages.WithRedirectionState, UpdateStages.WithSecurityEnabledAccess, UpdateStages.WithState, UpdateStages.WithUseServerDefault, UpdateStages.WithVisibility {
    }

    /**
     * Grouping of DatabaseConnectionPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the databaseconnectionpolicy update allowing to specify ProxyDnsName.
         */
        interface WithProxyDnsName {
            /**
             * Specifies proxyDnsName.
             */
            Update withProxyDnsName(String proxyDnsName);
        }

        /**
         * The stage of the databaseconnectionpolicy update allowing to specify ProxyPort.
         */
        interface WithProxyPort {
            /**
             * Specifies proxyPort.
             */
            Update withProxyPort(String proxyPort);
        }

        /**
         * The stage of the databaseconnectionpolicy update allowing to specify RedirectionState.
         */
        interface WithRedirectionState {
            /**
             * Specifies redirectionState.
             */
            Update withRedirectionState(String redirectionState);
        }

        /**
         * The stage of the databaseconnectionpolicy update allowing to specify SecurityEnabledAccess.
         */
        interface WithSecurityEnabledAccess {
            /**
             * Specifies securityEnabledAccess.
             */
            Update withSecurityEnabledAccess(String securityEnabledAccess);
        }

        /**
         * The stage of the databaseconnectionpolicy update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             */
            Update withState(String state);
        }

        /**
         * The stage of the databaseconnectionpolicy update allowing to specify UseServerDefault.
         */
        interface WithUseServerDefault {
            /**
             * Specifies useServerDefault.
             */
            Update withUseServerDefault(String useServerDefault);
        }

        /**
         * The stage of the databaseconnectionpolicy update allowing to specify Visibility.
         */
        interface WithVisibility {
            /**
             * Specifies visibility.
             */
            Update withVisibility(String visibility);
        }

    }
}
