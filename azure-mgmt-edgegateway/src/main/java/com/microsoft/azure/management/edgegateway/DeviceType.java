/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DeviceType.
 */
public final class DeviceType extends ExpandableStringEnum<DeviceType> {
    /** Static value DataBoxEdgeDevice for DeviceType. */
    public static final DeviceType DATA_BOX_EDGE_DEVICE = fromString("DataBoxEdgeDevice");

    /**
     * Creates or finds a DeviceType from its string representation.
     * @param name a name to look for
     * @return the corresponding DeviceType
     */
    @JsonCreator
    public static DeviceType fromString(String name) {
        return fromString(name, DeviceType.class);
    }

    /**
     * @return known DeviceType values
     */
    public static Collection<DeviceType> values() {
        return values(DeviceType.class);
    }
}