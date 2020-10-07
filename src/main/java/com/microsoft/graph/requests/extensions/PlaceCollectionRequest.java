// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Place;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.PlaceCollectionResponse;
import com.microsoft.graph.requests.extensions.PlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceCollectionRequest;
import com.microsoft.graph.requests.extensions.PlaceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Place Collection Request.
 */
public class PlaceCollectionRequest extends BaseCollectionRequest<PlaceCollectionResponse, PlaceCollectionPage> {

    /**
     * The request builder for this collection of Place
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlaceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlaceCollectionResponse.class, PlaceCollectionPage.class);
    }

    public void get(final ICallback<? super PlaceCollectionPage> callback) {
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

    public PlaceCollectionPage get() throws ClientException {
        final PlaceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Place newPlace, final ICallback<? super Place> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PlaceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPlace, callback);
    }

    public Place post(final Place newPlace) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PlaceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPlace);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public PlaceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PlaceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public PlaceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PlaceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public PlaceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (PlaceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public PlaceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PlaceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public PlaceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PlaceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public PlaceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PlaceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public PlaceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (PlaceCollectionRequest)this;
    }
    public PlaceCollectionPage buildFromResponse(final PlaceCollectionResponse response) {
        final PlaceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PlaceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PlaceCollectionPage page = new PlaceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
