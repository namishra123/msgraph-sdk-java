// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Get User Ids With Flagged App Registration Collection Request.
 */
public class ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest extends BaseCollectionRequest<ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse, ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage> {


    /**
     * The request for this ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse.class, ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage.class);
    }


    public void get(final ICallback<? super ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage get() throws ClientException {
        final ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage buildFromResponse(final ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse response) {
        final ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage page = new ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest)this;
    }

}
