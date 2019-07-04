/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container unpairing input.
 */
public class RemoveProtectionContainerMappingInput {
    /**
     * Configure protection input properties.
     */
    @JsonProperty(value = "properties")
    private RemoveProtectionContainerMappingInputProperties properties;

    /**
     * Get configure protection input properties.
     *
     * @return the properties value
     */
    public RemoveProtectionContainerMappingInputProperties properties() {
        return this.properties;
    }

    /**
     * Set configure protection input properties.
     *
     * @param properties the properties value to set
     * @return the RemoveProtectionContainerMappingInput object itself.
     */
    public RemoveProtectionContainerMappingInput withProperties(RemoveProtectionContainerMappingInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
