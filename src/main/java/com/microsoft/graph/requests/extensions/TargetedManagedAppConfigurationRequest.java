// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TargetedManagedAppConfiguration;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Request.
 */
public class TargetedManagedAppConfigurationRequest extends BaseRequest {
	
    /**
     * The request for the TargetedManagedAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TargetedManagedAppConfiguration.class);
    }

    /**
     * Gets the TargetedManagedAppConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TargetedManagedAppConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TargetedManagedAppConfiguration from the service
     *
     * @return the TargetedManagedAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TargetedManagedAppConfiguration> callback) {
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
     * Patches this TargetedManagedAppConfiguration with a source
     *
     * @param sourceTargetedManagedAppConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TargetedManagedAppConfiguration sourceTargetedManagedAppConfiguration, final ICallback<? super TargetedManagedAppConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceTargetedManagedAppConfiguration);
    }

    /**
     * Patches this TargetedManagedAppConfiguration with a source
     *
     * @param sourceTargetedManagedAppConfiguration the source object with updates
     * @return the updated TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppConfiguration patch(final TargetedManagedAppConfiguration sourceTargetedManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration, final ICallback<? super TargetedManagedAppConfiguration> callback) {
        send(HttpMethod.POST, callback, newTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the new object to create
     * @return the created TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppConfiguration post(final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.POST, newTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration, final ICallback<? super TargetedManagedAppConfiguration> callback) {
        send(HttpMethod.PUT, callback, newTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the object to create/update
     * @return the created TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppConfiguration put(final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newTargetedManagedAppConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public TargetedManagedAppConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TargetedManagedAppConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public TargetedManagedAppConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TargetedManagedAppConfigurationRequest)this;
     }

}

