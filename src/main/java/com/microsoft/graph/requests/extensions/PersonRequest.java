// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Person;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Request.
 */
public class PersonRequest extends BaseRequest<Person> {
	
    /**
     * The request for the Person
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Person.class);
    }

    /**
     * Gets the Person from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Person> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Person from the service
     *
     * @return the Person from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Person get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Person> callback) {
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
     * Patches this Person with a source
     *
     * @param sourcePerson the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Person sourcePerson, @Nonnull final ICallback<? super Person> callback) {
        send(HttpMethod.PATCH, callback, sourcePerson);
    }

    /**
     * Patches this Person with a source
     *
     * @param sourcePerson the source object with updates
     * @return the updated Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Person patch(@Nonnull final Person sourcePerson) throws ClientException {
        return send(HttpMethod.PATCH, sourcePerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Person newPerson, @Nonnull final ICallback<? super Person> callback) {
        send(HttpMethod.POST, callback, newPerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the new object to create
     * @return the created Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Person post(@Nonnull final Person newPerson) throws ClientException {
        return send(HttpMethod.POST, newPerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Person newPerson, @Nonnull final ICallback<? super Person> callback) {
        send(HttpMethod.PUT, callback, newPerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the object to create/update
     * @return the created Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Person put(@Nonnull final Person newPerson) throws ClientException {
        return send(HttpMethod.PUT, newPerson);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PersonRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PersonRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public PersonRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public PersonRequest count() {
        addCountOption(true);
        return this;
    }
}

