// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.LocaleInfo;
import com.microsoft.graph.models.extensions.TimeZoneInformation;
import com.microsoft.graph.models.generated.TimeZoneStandard;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Request Builder.
 */
public class OutlookUserRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the OutlookUserRequest instance
     */
    public OutlookUserRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the OutlookUserRequest instance
     */
    public OutlookUserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OutlookUserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public OutlookCategoryCollectionRequestBuilder masterCategories() {
        return new OutlookCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("masterCategories"), getClient(), null);
    }

    public OutlookCategoryRequestBuilder masterCategories(final String id) {
        return new OutlookCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("masterCategories") + "/" + id, getClient(), null);
    }

    public OutlookUserSupportedLanguagesCollectionRequestBuilder supportedLanguages() {
        return new OutlookUserSupportedLanguagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedLanguages"), getClient(), null);
    }

    public OutlookUserSupportedTimeZonesCollectionRequestBuilder supportedTimeZones() {
        return new OutlookUserSupportedTimeZonesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedTimeZones"), getClient(), null);
    }

    public OutlookUserSupportedTimeZonesCollectionRequestBuilder supportedTimeZones(final TimeZoneStandard timeZoneStandard) {
        return new OutlookUserSupportedTimeZonesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedTimeZones"), getClient(), null, timeZoneStandard);
    }
}
