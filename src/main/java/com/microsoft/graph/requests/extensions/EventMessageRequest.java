// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EventMessage;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request.
 */
public class EventMessageRequest extends BaseRequest {
	
    /**
     * The request for the EventMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public EventMessageRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends EventMessage> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the EventMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventMessage.class);
    }

    /**
     * Gets the EventMessage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EventMessage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EventMessage from the service
     *
     * @return the EventMessage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EventMessage> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EventMessage with a source
     *
     * @param sourceEventMessage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EventMessage sourceEventMessage, final ICallback<? super EventMessage> callback) {
        send(HttpMethod.PATCH, callback, sourceEventMessage);
    }

    /**
     * Patches this EventMessage with a source
     *
     * @param sourceEventMessage the source object with updates
     * @return the updated EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessage patch(final EventMessage sourceEventMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     *
     * @param newEventMessage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EventMessage newEventMessage, final ICallback<? super EventMessage> callback) {
        send(HttpMethod.POST, callback, newEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     *
     * @param newEventMessage the new object to create
     * @return the created EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessage post(final EventMessage newEventMessage) throws ClientException {
        return send(HttpMethod.POST, newEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     *
     * @param newEventMessage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EventMessage newEventMessage, final ICallback<? super EventMessage> callback) {
        send(HttpMethod.PUT, callback, newEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     *
     * @param newEventMessage the object to create/update
     * @return the created EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessage put(final EventMessage newEventMessage) throws ClientException {
        return send(HttpMethod.PUT, newEventMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public EventMessageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EventMessageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public EventMessageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EventMessageRequest)this;
     }

}

