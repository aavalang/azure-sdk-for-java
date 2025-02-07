// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for ForceCloseHandles operation.
 */
@JacksonXmlRootElement(localName = "Directory-ForceCloseHandles-Headers")
@Fluent
public final class DirectoryForceCloseHandlesHeaders {
    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * A string describing next handle to be closed. It is returned when more
     * handles need to be closed to complete the request.
     */
    @JsonProperty(value = "x-ms-marker")
    private String marker;

    /*
     * Contains count of number of handles closed.
     */
    @JsonProperty(value = "x-ms-number-of-handles-closed")
    private Integer numberOfHandlesClosed;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the DirectoryForceCloseHandlesHeaders object itself.
     */
    public DirectoryForceCloseHandlesHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the DirectoryForceCloseHandlesHeaders object itself.
     */
    public DirectoryForceCloseHandlesHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the DirectoryForceCloseHandlesHeaders object itself.
     */
    public DirectoryForceCloseHandlesHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the marker property: A string describing next handle to be closed.
     * It is returned when more handles need to be closed to complete the
     * request.
     *
     * @return the marker value.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * Set the marker property: A string describing next handle to be closed.
     * It is returned when more handles need to be closed to complete the
     * request.
     *
     * @param marker the marker value to set.
     * @return the DirectoryForceCloseHandlesHeaders object itself.
     */
    public DirectoryForceCloseHandlesHeaders setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the numberOfHandlesClosed property: Contains count of number of
     * handles closed.
     *
     * @return the numberOfHandlesClosed value.
     */
    public Integer getNumberOfHandlesClosed() {
        return this.numberOfHandlesClosed;
    }

    /**
     * Set the numberOfHandlesClosed property: Contains count of number of
     * handles closed.
     *
     * @param numberOfHandlesClosed the numberOfHandlesClosed value to set.
     * @return the DirectoryForceCloseHandlesHeaders object itself.
     */
    public DirectoryForceCloseHandlesHeaders setNumberOfHandlesClosed(Integer numberOfHandlesClosed) {
        this.numberOfHandlesClosed = numberOfHandlesClosed;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the DirectoryForceCloseHandlesHeaders object itself.
     */
    public DirectoryForceCloseHandlesHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
