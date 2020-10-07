// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeGraphInsights;
import com.microsoft.graph.models.extensions.UsedInsight;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.UsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UsedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Used Insight Collection Request Builder.
 */
public class UsedInsightCollectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for this collection of OfficeGraphInsights
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UsedInsightCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public UsedInsightCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public UsedInsightCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new UsedInsightCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public UsedInsightRequestBuilder byId(final String id) {
        return new UsedInsightRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
