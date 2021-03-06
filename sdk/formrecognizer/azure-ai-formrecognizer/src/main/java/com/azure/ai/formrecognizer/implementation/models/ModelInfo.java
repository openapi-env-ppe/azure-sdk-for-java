// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** The ModelInfo model. */
@Fluent
public final class ModelInfo {
    /*
     * Model identifier.
     */
    @JsonProperty(value = "modelId", required = true)
    private UUID modelId;

    /*
     * Status of the model.
     */
    @JsonProperty(value = "status", required = true)
    private ModelStatus status;

    /*
     * Date and time (UTC) when the model was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime createdDateTime;

    /*
     * Date and time (UTC) when the status was last updated.
     */
    @JsonProperty(value = "lastUpdatedDateTime", required = true)
    private OffsetDateTime lastUpdatedDateTime;

    /**
     * Get the modelId property: Model identifier.
     *
     * @return the modelId value.
     */
    public UUID getModelId() {
        return this.modelId;
    }

    /**
     * Set the modelId property: Model identifier.
     *
     * @param modelId the modelId value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setModelId(UUID modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the status property: Status of the model.
     *
     * @return the status value.
     */
    public ModelStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the model.
     *
     * @param status the status value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setStatus(ModelStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time (UTC) when the model was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time (UTC) when the model was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: Date and time (UTC) when the status was last updated.
     *
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Set the lastUpdatedDateTime property: Date and time (UTC) when the status was last updated.
     *
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }
}
