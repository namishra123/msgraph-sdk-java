// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.AppRoleAssignmentWithReferenceRequest;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Role Assignment Collection Reference Request.
 */
public class AppRoleAssignmentCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<AppRoleAssignment, AppRoleAssignmentWithReferenceRequest, AppRoleAssignmentReferenceRequestBuilder, AppRoleAssignmentWithReferenceRequestBuilder, AppRoleAssignmentCollectionResponse, AppRoleAssignmentCollectionWithReferencesPage, AppRoleAssignmentCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of AppRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppRoleAssignmentCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppRoleAssignmentCollectionResponse.class, AppRoleAssignmentCollectionWithReferencesPage.class, AppRoleAssignmentCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new AppRoleAssignment
     * @param newAppRoleAssignment the AppRoleAssignment to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final AppRoleAssignment newAppRoleAssignment, @Nonnull final ICallback<? super AppRoleAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/me/registeredUsersAsAppRoleAssignment/" + newAppRoleAssignment.id);
        new AppRoleAssignmentWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAppRoleAssignment, body, callback);
    }

    /**
     * Creates a new AppRoleAssignment
     * @param newAppRoleAssignment the AppRoleAssignment to create
     * @return the newly created object
     */
    @Nonnull
    public AppRoleAssignment post(@Nonnull final AppRoleAssignment newAppRoleAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/me/registeredUsersAsAppRoleAssignment/" + newAppRoleAssignment.id);
        return new AppRoleAssignmentWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newAppRoleAssignment, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public AppRoleAssignmentCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public AppRoleAssignmentCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public AppRoleAssignmentCollectionReferenceRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public AppRoleAssignmentCollectionReferenceRequest select(@Nonnull final String value) {
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
    public AppRoleAssignmentCollectionReferenceRequest top(final int value) {
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
    public AppRoleAssignmentCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public AppRoleAssignmentCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
