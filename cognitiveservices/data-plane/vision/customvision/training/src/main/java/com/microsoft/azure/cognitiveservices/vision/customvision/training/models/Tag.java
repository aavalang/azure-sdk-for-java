/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Tag.
 */
public class Tag {
    /**
     * Gets the Tag ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * Gets or sets the name of the tag.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Gets or sets the description of the tag.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Gets or sets the type of the tag. Possible values include: 'Regular',
     * 'Negative'.
     */
    @JsonProperty(value = "type", required = true)
    private TagType type;

    /**
     * Gets the number of images with this tag.
     */
    @JsonProperty(value = "imageCount", access = JsonProperty.Access.WRITE_ONLY)
    private int imageCount;

    /**
     * Get gets the Tag ID.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get gets or sets the name of the tag.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the tag.
     *
     * @param name the name value to set
     * @return the Tag object itself.
     */
    public Tag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets the description of the tag.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description of the tag.
     *
     * @param description the description value to set
     * @return the Tag object itself.
     */
    public Tag withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get gets or sets the type of the tag. Possible values include: 'Regular', 'Negative'.
     *
     * @return the type value
     */
    public TagType type() {
        return this.type;
    }

    /**
     * Set gets or sets the type of the tag. Possible values include: 'Regular', 'Negative'.
     *
     * @param type the type value to set
     * @return the Tag object itself.
     */
    public Tag withType(TagType type) {
        this.type = type;
        return this;
    }

    /**
     * Get gets the number of images with this tag.
     *
     * @return the imageCount value
     */
    public int imageCount() {
        return this.imageCount;
    }

}
