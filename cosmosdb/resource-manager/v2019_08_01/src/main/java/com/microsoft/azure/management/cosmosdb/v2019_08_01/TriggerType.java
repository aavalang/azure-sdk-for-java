/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TriggerType.
 */
public final class TriggerType extends ExpandableStringEnum<TriggerType> {
    /** Static value Pre for TriggerType. */
    public static final TriggerType PRE = fromString("Pre");

    /** Static value Post for TriggerType. */
    public static final TriggerType POST = fromString("Post");

    /**
     * Creates or finds a TriggerType from its string representation.
     * @param name a name to look for
     * @return the corresponding TriggerType
     */
    @JsonCreator
    public static TriggerType fromString(String name) {
        return fromString(name, TriggerType.class);
    }

    /**
     * @return known TriggerType values
     */
    public static Collection<TriggerType> values() {
        return values(TriggerType.class);
    }
}
