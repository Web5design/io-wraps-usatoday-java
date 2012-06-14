/*
 * Copyright (c) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file was generated.
 *  with google-apis-code-generator 1.1.1 (build: 2011-10-20)
 */

package com.google.api.services.censusapi;

import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.json.JsonHttpClient;
import com.google.api.client.http.json.JsonHttpRequest;
import com.google.api.client.util.Key;


/**
 * Generated Censusapi request.
 *
 * @since 1.3.0
 */
public class CensusapiRequest extends JsonHttpRequest {

  /**
   * Builds an instance of CensusapiRequest.
   *
   * @param client The JSON HTTP client which handles this request
   * @param method HTTP Method type
   * @param uriTemplate URI template
   * @param content A POJO that can be serialized into JSON or {@code null} for none
   */
  public CensusapiRequest(
      JsonHttpClient client, HttpMethod method, String uriTemplate, Object content) {
    super(client, method, uriTemplate, content);
  }

}

