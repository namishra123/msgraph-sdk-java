// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionResponse;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed App Diagnostic Statuses Collection Request.
 */
public class UserGetManagedAppDiagnosticStatusesCollectionRequest extends BaseCollectionRequest<ManagedAppDiagnosticStatus, UserGetManagedAppDiagnosticStatusesCollectionResponse, UserGetManagedAppDiagnosticStatusesCollectionPage> {


    /**
     * The request for this UserGetManagedAppDiagnosticStatuses
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserGetManagedAppDiagnosticStatusesCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserGetManagedAppDiagnosticStatusesCollectionResponse.class, UserGetManagedAppDiagnosticStatusesCollectionPage.class, UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder.class);
    }


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}
