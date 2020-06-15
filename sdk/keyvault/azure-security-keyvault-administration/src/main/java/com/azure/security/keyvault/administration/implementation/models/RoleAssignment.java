// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role Assignments.
 */
@Fluent
public final class RoleAssignment {
    /*
     * The role assignment ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The role assignment name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The role assignment type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Role assignment properties.
     */
    @JsonProperty(value = "properties")
    private RoleAssignmentPropertiesWithScope properties;

    /**
     * Get the id property: The role assignment ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The role assignment name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: The role assignment type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the properties property: Role assignment properties.
     *
     * @return the properties value.
     */
    public RoleAssignmentPropertiesWithScope getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Role assignment properties.
     *
     * @param properties the properties value to set.
     * @return the RoleAssignment object itself.
     */
    public RoleAssignment setProperties(RoleAssignmentPropertiesWithScope properties) {
        this.properties = properties;
        return this;
    }
}
