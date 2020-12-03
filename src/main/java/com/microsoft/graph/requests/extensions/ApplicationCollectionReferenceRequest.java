// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ApplicationWithReferenceRequest;
import com.microsoft.graph.requests.extensions.ApplicationReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ApplicationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Collection Reference Request.
 */
public class ApplicationCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<Application, ApplicationWithReferenceRequest, ApplicationReferenceRequestBuilder, ApplicationWithReferenceRequestBuilder, ApplicationCollectionResponse, ApplicationCollectionWithReferencesPage, ApplicationCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationCollectionResponse.class, ApplicationCollectionWithReferencesPage.class, ApplicationCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new Application
     * @param newApplication the Application to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final Application newApplication, @Nonnull final ICallback<? super Application> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/applications/" + newApplication.id);
        new ApplicationWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newApplication, body, callback);
    }

    /**
     * Creates a new Application
     * @param newApplication the Application to create
     * @return the newly created object
     */
    @Nonnull
    public Application post(@Nonnull final Application newApplication) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/applications/" + newApplication.id);
        return new ApplicationWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newApplication, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public ApplicationCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public ApplicationCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public ApplicationCollectionReferenceRequest select(@Nonnull final String value) {
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
    public ApplicationCollectionReferenceRequest top(final int value) {
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
    public ApplicationCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
