/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_01_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The child information of a management group used during creation.
 */
public class CreateManagementGroupChildInfo {
    /**
     * The type of child resource.
     * The fully qualified resource type which includes provider namespace
     * (e.g. /providers/Microsoft.Management/managementGroups). Possible values
     * include: '/providers/Microsoft.Management/managementGroups',
     * '/subscriptions'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The fully qualified ID for the child resource (management group or
     * subscription).  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The name of the child entity.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The friendly name of the child resource.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The roles definitions associated with the management group.
     */
    @JsonProperty(value = "roles", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> roles;

    /**
     * The list of children.
     */
    @JsonProperty(value = "children", access = JsonProperty.Access.WRITE_ONLY)
    private List<CreateManagementGroupChildInfo> children;

    /**
     * Get the fully qualified resource type which includes provider namespace (e.g. /providers/Microsoft.Management/managementGroups). Possible values include: '/providers/Microsoft.Management/managementGroups', '/subscriptions'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name of the child entity.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the friendly name of the child resource.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the roles definitions associated with the management group.
     *
     * @return the roles value
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Get the list of children.
     *
     * @return the children value
     */
    public List<CreateManagementGroupChildInfo> children() {
        return this.children;
    }

}