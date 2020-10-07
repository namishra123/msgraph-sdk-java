// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UrlAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Url Assessment Request Request Builder.
 */
public class UrlAssessmentRequestRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the UrlAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UrlAssessmentRequestRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UrlAssessmentRequestRequest instance
     */
    public UrlAssessmentRequestRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UrlAssessmentRequestRequest instance
     */
    public UrlAssessmentRequestRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UrlAssessmentRequestRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ThreatAssessmentResultCollectionRequestBuilder results() {
        return new ThreatAssessmentResultCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("results"), getClient(), null);
    }

    public ThreatAssessmentResultRequestBuilder results(final String id) {
        return new ThreatAssessmentResultRequestBuilder(getRequestUrlWithAdditionalSegment("results") + "/" + id, getClient(), null);
    }
}
