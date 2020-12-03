// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyWithReferenceRequest;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Claims Mapping Policy Collection Reference Request.
 */
public class ClaimsMappingPolicyCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<ClaimsMappingPolicy, ClaimsMappingPolicyWithReferenceRequest, ClaimsMappingPolicyReferenceRequestBuilder, ClaimsMappingPolicyWithReferenceRequestBuilder, ClaimsMappingPolicyCollectionResponse, ClaimsMappingPolicyCollectionWithReferencesPage, ClaimsMappingPolicyCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ClaimsMappingPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ClaimsMappingPolicyCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ClaimsMappingPolicyCollectionResponse.class, ClaimsMappingPolicyCollectionWithReferencesPage.class, ClaimsMappingPolicyCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new ClaimsMappingPolicy
     * @param newClaimsMappingPolicy the ClaimsMappingPolicy to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final ClaimsMappingPolicy newClaimsMappingPolicy, @Nonnull final ICallback<? super ClaimsMappingPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/claimsMappingPolicies/" + newClaimsMappingPolicy.id);
        new ClaimsMappingPolicyWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newClaimsMappingPolicy, body, callback);
    }

    /**
     * Creates a new ClaimsMappingPolicy
     * @param newClaimsMappingPolicy the ClaimsMappingPolicy to create
     * @return the newly created object
     */
    @Nonnull
    public ClaimsMappingPolicy post(@Nonnull final ClaimsMappingPolicy newClaimsMappingPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/claimsMappingPolicies/" + newClaimsMappingPolicy.id);
        return new ClaimsMappingPolicyWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newClaimsMappingPolicy, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ClaimsMappingPolicyCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public ClaimsMappingPolicyCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public ClaimsMappingPolicyCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public ClaimsMappingPolicyCollectionReferenceRequest select(@Nonnull final String value) {
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
    public ClaimsMappingPolicyCollectionReferenceRequest top(final int value) {
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
    public ClaimsMappingPolicyCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ClaimsMappingPolicyCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
