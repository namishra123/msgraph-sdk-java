// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Subscription;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionPage;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscription Collection Page.
 */
public class SubscriptionCollectionPage extends BaseCollectionPage<Subscription, SubscriptionCollectionRequestBuilder> {

    /**
     * A collection page for Subscription
     *
     * @param response the serialized SubscriptionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SubscriptionCollectionPage(final SubscriptionCollectionResponse response, final SubscriptionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
