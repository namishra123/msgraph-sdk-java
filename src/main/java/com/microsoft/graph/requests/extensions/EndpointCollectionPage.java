// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Endpoint;
import com.microsoft.graph.requests.extensions.EndpointCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.EndpointCollectionPage;
import com.microsoft.graph.requests.extensions.EndpointCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Endpoint Collection Page.
 */
public class EndpointCollectionPage extends BaseCollectionPage<Endpoint, EndpointCollectionRequestBuilder> {

    /**
     * A collection page for Endpoint
     *
     * @param response the serialized EndpointCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EndpointCollectionPage(final EndpointCollectionResponse response, final EndpointCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
