// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.sas;

import com.azure.storage.common.implementation.Constants;

import java.util.Locale;

/**
 * This is a helper class to construct a string representing the permissions granted by a ServiceSAS to a file. Setting
 * a value to true means that any SAS which uses these permissions will grant permissions for that operation. Once all
 * the values are set, this should be serialized with toString and set as the permissions field on a {@link
 * ShareServiceSasSignatureValues} object. It is possible to construct the permissions string without this class, but
 * the order of the permissions is particular and this class guarantees correctness.
 */
public final class ShareFileSasPermission {
    private boolean readPermission;

    private boolean createPermission;

    private boolean writePermission;

    private boolean deletePermission;

    /**
     * Initializes an {@code ShareFileSasPermission} object with all fields set to false.
     */
    public ShareFileSasPermission() {
    }

    /**
     * Creates an {@code ShareFileSasPermission} from the specified permissions string. This method will throw an
     * {@code IllegalArgumentException} if it encounters a character that does not correspond to a valid permission.
     *
     * @param permString A {@code String} which represents the {@code ShareFileSasPermission}.
     * @return A {@code ShareFileSasPermission} generated from the given {@code String}.
     * @throws IllegalArgumentException If {@code permString} contains a character other than r, c, w, or d.
     */
    public static ShareFileSasPermission parse(String permString) {
        ShareFileSasPermission permissions = new ShareFileSasPermission();

        for (int i = 0; i < permString.length(); i++) {
            char c = permString.charAt(i);
            switch (c) {
                case 'r':
                    permissions.readPermission = true;
                    break;
                case 'c':
                    permissions.createPermission = true;
                    break;
                case 'w':
                    permissions.writePermission = true;
                    break;
                case 'd':
                    permissions.deletePermission = true;
                    break;
                default:
                    throw new IllegalArgumentException(
                        String.format(Locale.ROOT, Constants.ENUM_COULD_NOT_BE_PARSED_INVALID_VALUE,
                            "Permissions", permString, c));
            }
        }
        return permissions;
    }

    /**
     * @return the read permission status
     */
    public boolean hasReadPermission() {
        return readPermission;
    }

    /**
     * Sets the read permission status.
     *
     * @param hasReadPermission Permission status to set
     * @return the updated ShareFileSasPermission object
     */
    public ShareFileSasPermission setReadPermission(boolean hasReadPermission) {
        this.readPermission = hasReadPermission;
        return this;
    }

    /**
     * @return the create permission status
     */
    public boolean hasCreatePermission() {
        return createPermission;
    }

    /**
     * Sets the create permission status.
     *
     * @param hasCreatePermission Permission status to set
     * @return the updated ShareFileSasPermission object
     */
    public ShareFileSasPermission setCreatePermission(boolean hasCreatePermission) {
        this.createPermission = hasCreatePermission;
        return this;
    }

    /**
     * @return the write permission status
     */
    public boolean hasWritePermission() {
        return writePermission;
    }

    /**
     * Sets the write permission status.
     *
     * @param hasWritePermission Permission status to set
     * @return the updated ShareFileSasPermission object
     */
    public ShareFileSasPermission setWritePermission(boolean hasWritePermission) {
        this.writePermission = hasWritePermission;
        return this;
    }

    /**
     * @return the delete permission status
     */
    public boolean hasDeletePermission() {
        return deletePermission;
    }

    /**
     * Sets the delete permission status.
     *
     * @param hasDeletePermission Permission status to set
     * @return the updated ShareFileSasPermission object
     */
    public ShareFileSasPermission setDeletePermission(boolean hasDeletePermission) {
        this.deletePermission = hasDeletePermission;
        return this;
    }

    /**
     * Converts the given permissions to a {@code String}. Using this method will guarantee the permissions are in an
     * order accepted by the service.
     *
     * @return A {@code String} which represents the {@code ShareFileSasPermission}.
     */
    @Override
    public String toString() {
        // The order of the characters should be as specified here to ensure correctness:
        // https://docs.microsoft.com/en-us/rest/api/storageservices/constructing-a-service-sas
        final StringBuilder builder = new StringBuilder();

        if (this.readPermission) {
            builder.append('r');
        }

        if (this.createPermission) {
            builder.append('c');
        }

        if (this.writePermission) {
            builder.append('w');
        }

        if (this.deletePermission) {
            builder.append('d');
        }

        return builder.toString();
    }
}
