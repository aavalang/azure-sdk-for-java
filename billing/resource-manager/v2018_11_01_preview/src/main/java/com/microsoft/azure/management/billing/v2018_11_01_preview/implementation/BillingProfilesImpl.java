/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfiles;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfileListResult;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfile;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfileCreationParameters;

class BillingProfilesImpl extends WrapperImpl<BillingProfilesInner> implements BillingProfiles {
    private final BillingManager manager;

    BillingProfilesImpl(BillingManager manager) {
        super(manager.inner().billingProfiles());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private BillingProfileImpl wrapModel(BillingProfileInner inner) {
        return  new BillingProfileImpl(inner, manager());
    }

    @Override
    public Observable<BillingProfileListResult> listByBillingAccountNameAsync(String billingAccountName) {
        BillingProfilesInner client = this.inner();
        return client.listByBillingAccountNameAsync(billingAccountName)
        .map(new Func1<BillingProfileListResultInner, BillingProfileListResult>() {
            @Override
            public BillingProfileListResult call(BillingProfileListResultInner inner) {
                return new BillingProfileListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingProfile> getAsync(String billingAccountName, String billingProfileName) {
        BillingProfilesInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName)
        .map(new Func1<BillingProfileInner, BillingProfile>() {
            @Override
            public BillingProfile call(BillingProfileInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<BillingProfile> createAsync(String billingAccountName, BillingProfileCreationParameters parameters) {
        BillingProfilesInner client = this.inner();
        return client.createAsync(billingAccountName, parameters)
        .map(new Func1<BillingProfileInner, BillingProfile>() {
            @Override
            public BillingProfile call(BillingProfileInner inner) {
                return new BillingProfileImpl(inner, manager());
            }
        });
    }

}
