/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RecoveryPlanGroupType.
 */
public final class RecoveryPlanGroupType extends ExpandableStringEnum<RecoveryPlanGroupType> {
    /** Static value Shutdown for RecoveryPlanGroupType. */
    public static final RecoveryPlanGroupType SHUTDOWN = fromString("Shutdown");

    /** Static value Boot for RecoveryPlanGroupType. */
    public static final RecoveryPlanGroupType BOOT = fromString("Boot");

    /** Static value Failover for RecoveryPlanGroupType. */
    public static final RecoveryPlanGroupType FAILOVER = fromString("Failover");

    /**
     * Creates or finds a RecoveryPlanGroupType from its string representation.
     * @param name a name to look for
     * @return the corresponding RecoveryPlanGroupType
     */
    @JsonCreator
    public static RecoveryPlanGroupType fromString(String name) {
        return fromString(name, RecoveryPlanGroupType.class);
    }

    /**
     * @return known RecoveryPlanGroupType values
     */
    public static Collection<RecoveryPlanGroupType> values() {
        return values(RecoveryPlanGroupType.class);
    }
}
