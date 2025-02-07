/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_09_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * VirtualRouter Resource.
 */
@JsonFlatten
@SkipParentValidation
public class VirtualRouterInner extends Resource {
    /**
     * VirtualRouter ASN.
     */
    @JsonProperty(value = "properties.virtualRouterAsn")
    private Long virtualRouterAsn;

    /**
     * VirtualRouter IPs.
     */
    @JsonProperty(value = "properties.virtualRouterIps")
    private List<String> virtualRouterIps;

    /**
     * The Subnet on which VirtualRouter is hosted.
     */
    @JsonProperty(value = "properties.hostedSubnet")
    private SubResource hostedSubnet;

    /**
     * The Gateway on which VirtualRouter is hosted.
     */
    @JsonProperty(value = "properties.hostedGateway")
    private SubResource hostedGateway;

    /**
     * List of references to VirtualRouterPeerings.
     */
    @JsonProperty(value = "properties.peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> peerings;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get virtualRouter ASN.
     *
     * @return the virtualRouterAsn value
     */
    public Long virtualRouterAsn() {
        return this.virtualRouterAsn;
    }

    /**
     * Set virtualRouter ASN.
     *
     * @param virtualRouterAsn the virtualRouterAsn value to set
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withVirtualRouterAsn(Long virtualRouterAsn) {
        this.virtualRouterAsn = virtualRouterAsn;
        return this;
    }

    /**
     * Get virtualRouter IPs.
     *
     * @return the virtualRouterIps value
     */
    public List<String> virtualRouterIps() {
        return this.virtualRouterIps;
    }

    /**
     * Set virtualRouter IPs.
     *
     * @param virtualRouterIps the virtualRouterIps value to set
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withVirtualRouterIps(List<String> virtualRouterIps) {
        this.virtualRouterIps = virtualRouterIps;
        return this;
    }

    /**
     * Get the Subnet on which VirtualRouter is hosted.
     *
     * @return the hostedSubnet value
     */
    public SubResource hostedSubnet() {
        return this.hostedSubnet;
    }

    /**
     * Set the Subnet on which VirtualRouter is hosted.
     *
     * @param hostedSubnet the hostedSubnet value to set
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withHostedSubnet(SubResource hostedSubnet) {
        this.hostedSubnet = hostedSubnet;
        return this;
    }

    /**
     * Get the Gateway on which VirtualRouter is hosted.
     *
     * @return the hostedGateway value
     */
    public SubResource hostedGateway() {
        return this.hostedGateway;
    }

    /**
     * Set the Gateway on which VirtualRouter is hosted.
     *
     * @param hostedGateway the hostedGateway value to set
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withHostedGateway(SubResource hostedGateway) {
        this.hostedGateway = hostedGateway;
        return this;
    }

    /**
     * Get list of references to VirtualRouterPeerings.
     *
     * @return the peerings value
     */
    public List<SubResource> peerings() {
        return this.peerings;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withId(String id) {
        this.id = id;
        return this;
    }

}
