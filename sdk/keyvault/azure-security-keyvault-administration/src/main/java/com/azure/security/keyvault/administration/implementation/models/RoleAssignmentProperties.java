// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role assignment properties.
 */
@Fluent
public final class RoleAssignmentProperties {
    /*
     * The role definition ID used in the role assignment.
     */
    @JsonProperty(value = "roleDefinitionId", required = true)
    private String roleDefinitionId;

    /*
     * The principal ID assigned to the role. This maps to the ID inside the
     * Active Directory. It can point to a user, service principal, or security
     * group.
     */
    @JsonProperty(value = "principalId", required = true)
    private String principalId;

    /**
     * Get the roleDefinitionId property: The role definition ID used in the
     * role assignment.
     *
     * @return the roleDefinitionId value.
     */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID used in the
     * role assignment.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentProperties object itself.
     */
    public RoleAssignmentProperties setRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID assigned to the role.
     * This maps to the ID inside the Active Directory. It can point to a user,
     * service principal, or security group.
     *
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID assigned to the role.
     * This maps to the ID inside the Active Directory. It can point to a user,
     * service principal, or security group.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentProperties object itself.
     */
    public RoleAssignmentProperties setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
}
