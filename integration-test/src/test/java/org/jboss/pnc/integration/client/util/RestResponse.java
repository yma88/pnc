/**
 * JBoss, Home of Professional Open Source.
 * Copyright 2014-2020 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.pnc.integration.client.util;

import io.restassured.response.Response;

import java.util.Optional;

public class RestResponse<T> {

    private final Response restCallResponse;
    private final Optional<T> returnedValue;

    public RestResponse(Response restCallResponse, T returnedValue) {
        this.restCallResponse = restCallResponse;
        this.returnedValue = Optional.ofNullable(returnedValue);
    }

    public boolean hasValue() {
        return this.returnedValue.isPresent();
    }

    public T getValue() {
        return this.returnedValue.get();
    }

    public Response getRestCallResponse() {
        return this.restCallResponse;
    }
}
