// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.util.ImplUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for UploadRange operation.
 */
@JacksonXmlRootElement(localName = "File-UploadRange-Headers")
@Fluent
public final class FileUploadRangeHeaders {
    /*
     * The ETag contains a value which represents the version of the file, in
     * quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * Returns the date and time the directory was last modified. Any operation
     * that modifies the share or its properties or metadata updates the last
     * modified time. Operations on files do not affect the last modified time
     * of the share.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * This header is returned so that the client can check for message content
     * integrity. The value of this header is computed by the File service; it
     * is not necessarily the same value as may have been specified in the
     * request headers.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

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
     * The value of this header is set to true if the contents of the request
     * are successfully encrypted using the specified algorithm, and false
     * otherwise.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean isServerEncrypted;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the eTag property: The ETag contains a value which represents the
     * version of the file, in quotes.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value which represents the
     * version of the file, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the FileUploadRangeHeaders object itself.
     */
    public FileUploadRangeHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: Returns the date and time the directory
     * was last modified. Any operation that modifies the share or its
     * properties or metadata updates the last modified time. Operations on
     * files do not affect the last modified time of the share.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the directory
     * was last modified. Any operation that modifies the share or its
     * properties or metadata updates the last modified time. Operations on
     * files do not affect the last modified time of the share.
     *
     * @param lastModified the lastModified value to set.
     * @return the FileUploadRangeHeaders object itself.
     */
    public FileUploadRangeHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the contentMD5 property: This header is returned so that the client
     * can check for message content integrity. The value of this header is
     * computed by the File service; it is not necessarily the same value as
     * may have been specified in the request headers.
     *
     * @return the contentMD5 value.
     */
    public byte[] getContentMD5() {
        return ImplUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: This header is returned so that the client
     * can check for message content integrity. The value of this header is
     * computed by the File service; it is not necessarily the same value as
     * may have been specified in the request headers.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the FileUploadRangeHeaders object itself.
     */
    public FileUploadRangeHeaders setContentMD5(byte[] contentMD5) {
        this.contentMD5 = ImplUtils.clone(contentMD5);
        return this;
    }

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
     * @return the FileUploadRangeHeaders object itself.
     */
    public FileUploadRangeHeaders setRequestId(String requestId) {
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
     * @return the FileUploadRangeHeaders object itself.
     */
    public FileUploadRangeHeaders setVersion(String version) {
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
     * @return the FileUploadRangeHeaders object itself.
     */
    public FileUploadRangeHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the isServerEncrypted property: The value of this header is set to
     * true if the contents of the request are successfully encrypted using the
     * specified algorithm, and false otherwise.
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted property: The value of this header is set to
     * true if the contents of the request are successfully encrypted using the
     * specified algorithm, and false otherwise.
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the FileUploadRangeHeaders object itself.
     */
    public FileUploadRangeHeaders setIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
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
     * @return the FileUploadRangeHeaders object itself.
     */
    public FileUploadRangeHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
