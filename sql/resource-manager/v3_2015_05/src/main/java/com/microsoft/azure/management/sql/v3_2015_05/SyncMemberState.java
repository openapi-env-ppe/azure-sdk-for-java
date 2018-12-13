/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2015_05;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SyncMemberState.
 */
public final class SyncMemberState extends ExpandableStringEnum<SyncMemberState> {
    /** Static value SyncInProgress for SyncMemberState. */
    public static final SyncMemberState SYNC_IN_PROGRESS = fromString("SyncInProgress");

    /** Static value SyncSucceeded for SyncMemberState. */
    public static final SyncMemberState SYNC_SUCCEEDED = fromString("SyncSucceeded");

    /** Static value SyncFailed for SyncMemberState. */
    public static final SyncMemberState SYNC_FAILED = fromString("SyncFailed");

    /** Static value DisabledTombstoneCleanup for SyncMemberState. */
    public static final SyncMemberState DISABLED_TOMBSTONE_CLEANUP = fromString("DisabledTombstoneCleanup");

    /** Static value DisabledBackupRestore for SyncMemberState. */
    public static final SyncMemberState DISABLED_BACKUP_RESTORE = fromString("DisabledBackupRestore");

    /** Static value SyncSucceededWithWarnings for SyncMemberState. */
    public static final SyncMemberState SYNC_SUCCEEDED_WITH_WARNINGS = fromString("SyncSucceededWithWarnings");

    /** Static value SyncCancelling for SyncMemberState. */
    public static final SyncMemberState SYNC_CANCELLING = fromString("SyncCancelling");

    /** Static value SyncCancelled for SyncMemberState. */
    public static final SyncMemberState SYNC_CANCELLED = fromString("SyncCancelled");

    /** Static value UnProvisioned for SyncMemberState. */
    public static final SyncMemberState UN_PROVISIONED = fromString("UnProvisioned");

    /** Static value Provisioning for SyncMemberState. */
    public static final SyncMemberState PROVISIONING = fromString("Provisioning");

    /** Static value Provisioned for SyncMemberState. */
    public static final SyncMemberState PROVISIONED = fromString("Provisioned");

    /** Static value ProvisionFailed for SyncMemberState. */
    public static final SyncMemberState PROVISION_FAILED = fromString("ProvisionFailed");

    /** Static value DeProvisioning for SyncMemberState. */
    public static final SyncMemberState DE_PROVISIONING = fromString("DeProvisioning");

    /** Static value DeProvisioned for SyncMemberState. */
    public static final SyncMemberState DE_PROVISIONED = fromString("DeProvisioned");

    /** Static value DeProvisionFailed for SyncMemberState. */
    public static final SyncMemberState DE_PROVISION_FAILED = fromString("DeProvisionFailed");

    /** Static value Reprovisioning for SyncMemberState. */
    public static final SyncMemberState REPROVISIONING = fromString("Reprovisioning");

    /** Static value ReprovisionFailed for SyncMemberState. */
    public static final SyncMemberState REPROVISION_FAILED = fromString("ReprovisionFailed");

    /** Static value UnReprovisioned for SyncMemberState. */
    public static final SyncMemberState UN_REPROVISIONED = fromString("UnReprovisioned");

    /**
     * Creates or finds a SyncMemberState from its string representation.
     * @param name a name to look for
     * @return the corresponding SyncMemberState
     */
    @JsonCreator
    public static SyncMemberState fromString(String name) {
        return fromString(name, SyncMemberState.class);
    }

    /**
     * @return known SyncMemberState values
     */
    public static Collection<SyncMemberState> values() {
        return values(SyncMemberState.class);
    }
}
