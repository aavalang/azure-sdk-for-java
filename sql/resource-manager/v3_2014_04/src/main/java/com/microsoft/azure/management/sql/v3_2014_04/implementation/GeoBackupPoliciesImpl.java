/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v3_2014_04.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v3_2014_04.GeoBackupPolicies;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v3_2014_04.GeoBackupPolicy;

class GeoBackupPoliciesImpl extends WrapperImpl<GeoBackupPoliciesInner> implements GeoBackupPolicies {
    private final SqlManager manager;

    GeoBackupPoliciesImpl(SqlManager manager) {
        super(manager.inner().geoBackupPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public GeoBackupPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private GeoBackupPolicyImpl wrapModel(GeoBackupPolicyInner inner) {
        return  new GeoBackupPolicyImpl(inner, manager());
    }

    private GeoBackupPolicyImpl wrapModel(String name) {
        return new GeoBackupPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<GeoBackupPolicy> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        GeoBackupPoliciesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<List<GeoBackupPolicyInner>, Observable<GeoBackupPolicyInner>>() {
            @Override
            public Observable<GeoBackupPolicyInner> call(List<GeoBackupPolicyInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<GeoBackupPolicyInner, GeoBackupPolicy>() {
            @Override
            public GeoBackupPolicy call(GeoBackupPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<GeoBackupPolicy> getAsync(String resourceGroupName, String serverName, String databaseName) {
        GeoBackupPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<GeoBackupPolicyInner, GeoBackupPolicy>() {
            @Override
            public GeoBackupPolicy call(GeoBackupPolicyInner inner) {
                return wrapModel(inner);
            }
       });
    }

}