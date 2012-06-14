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


import com.google.api.client.googleapis.services.GoogleClient;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.json.JsonHttpRequest;
import com.google.api.client.http.json.JsonHttpRequestInitializer;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Key;

import java.io.IOException;


/**
 * Service definition for Censusapi (1.0).
 *
 * <p>
 * USA TODAY Census API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link JsonHttpRequestInitializer} to initialize global parameters via its
 * {@link Builder}. Sample usage:
 * </p>
 *
 * <pre>
  public class CensusapiRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        CensusapiRequest censusapiRequest = (CensusapiRequest)request;
        censusapiRequest.setPrettyPrint(true);
        censusapiRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Censusapi extends GoogleClient {

  /**
   * The default base URL of the service. This is determined when the library is generated and
   * normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = "http://api.usatoday.com/open";

  /**
   * The application name to be sent in the User-Agent header of each request.
   */
  @Deprecated
  private String applicationName;

  /**
   * The URL of the server hosting the API.
   */
  @Deprecated
  private String baseServer = "http://api.usatoday.com";

  /**
   * The base path of the service.
   */
  @Deprecated
  private String basePath = "/open";

  /**
   * Construct a Censusapi instance to connect to the Censusapi service.
   *
   * @param transport The transport to use for requests
   * @param requestInitializer A initializer to use to build requests for subsequent API calls. May
   *        be null if no initializer is required.
   * @param jsonFactory A factory for creating JSON parsers and serializers
   *
   * @deprecated (scheduled to be removed in 1.4) Use
   *             {@link #Censusapi(HttpTransport, JsonFactory)} for only required
   *             params or {@link Builder} if you need to specify any of the optional params.
   */
  @Deprecated
  public Censusapi(
      HttpTransport transport,
      HttpRequestInitializer requestInitializer,
      JsonFactory jsonFactory) {
    super(transport, new CensusapiRequestInitializer(), requestInitializer, jsonFactory,
        DEFAULT_BASE_URL, null);
    ((CensusapiRequestInitializer)getJsonHttpRequestInitializer()).setCensusapi(this);
  }

  /**
   * Construct a Censusapi instance to connect to the Censusapi service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   */
  public Censusapi(HttpTransport transport, JsonFactory jsonFactory) {
    this(transport, null, jsonFactory);
  }

  /**
   * Construct a Censusapi instance to connect to the Censusapi service.
   *
   * @param appName The application name. This is embedded into the User-Agent string
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   *
   * @deprecated (scheduled to be removed in 1.4) Use
   *             {@link #Censusapi(HttpTransport, JsonFactory)} for only required
   *             params or {@link Builder} if you need to specify any of the optional params.
   */
  @Deprecated
  public Censusapi(String appName, HttpTransport transport, JsonFactory jsonFactory) {
    this(transport, null, jsonFactory);
    setApplicationName(appName);
  }


  /**
   * Created to maintain backwards compatibility (scheduled to be removed in 1.4).
   */
  private static class CensusapiRequestInitializer implements JsonHttpRequestInitializer {
    private Censusapi censusapi;
    void setCensusapi(Censusapi censusapi) {
      this.censusapi = censusapi;
    }
    public void initialize(JsonHttpRequest jsonHttpRequest) {
      CensusapiRequest request = (CensusapiRequest)jsonHttpRequest;
    }
  }

  /**
   * Construct a Censusapi instance to connect to the Censusapi service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param baseUrl The base url of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  Censusapi(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      String baseUrl,
      String applicationName) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          baseUrl,
          applicationName);
  }

  /**
   * Sets the application name to be sent in the User-Agent header of requests
   *
   * @param applicationName The application name
   *
   * @deprecated (scheduled to be removed in 1.4) Use {@link Builder}.
   */
  @Deprecated
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  /**
   * Returns the application name to be sent in the User-Agent header of requests or {@code null}
   * for none.
   *
   * <p>
   * This override will be removed in 1.4
   * </p>
   */
  @Override
  public String getApplicationName() {
    if (applicationName == null) {
      return super.getApplicationName();
    }
    return applicationName;
  }

  /**
   * Returns the base URL of the service, for example {@code "https://www.googleapis.com/open"}.
   *
   * <p>
   * This override will be removed in 1.4
   * </p>
   */
  @Override
  public String getBaseUrl() {
    String baseUrl = getBaseServer() + getBasePath();
    if (DEFAULT_BASE_URL.equals(baseUrl)) {
      return super.getBaseUrl();
    }
    return baseUrl;
  }

  /**
   * Sets the URL of the server hosting the API.
   *
   * @param baseServer The URL of the server hosting the API
   *
   * @deprecated (scheduled to be removed in 1.4) Use {@link Builder}.
   */
  @Deprecated
  public void setBaseServer(String baseServer) {
    this.baseServer = baseServer;
  }

  /**
   * Returns the URL of the server hosting the API, for example {@code "https://www.googleapis.com"}.
   *
   * @deprecated (scheduled to be removed in 1.4) Use {@link #getBaseUrl}.
   */
  @Deprecated
  public String getBaseServer() {
    return baseServer;
  }

  /**
   * Sets the base path of the service.
   *
   * @param basePath The base path of the service
   *
   * @deprecated (scheduled to be removed in 1.4) Use {@link Builder}.
   */
  @Deprecated
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  /**
   * Returns the base path of the service, for example {@code "/open"}.
   *
   * @deprecated (scheduled to be removed in 1.4) Use {@link #getBaseUrl}.
   */
  @Deprecated
  public String getBasePath() {
    return basePath;
  }

  /**
   * Returns an instance of a new builder.
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   */
   public static Builder builder(HttpTransport transport, JsonFactory jsonFactory) {
     return new Builder(transport, jsonFactory);
   }

  /**
   * An accessor for creating requests from the CensusResources collection.
   *
   * The typical use is:<pre>
   *   {@code Censusapi censusapi = new Censusapi(...);}
   *   {@code Censusapi.CensusResources.List request = censusapi.censusResources().list(parameters ...)}</pre>
   *
   * @return the resource collection
   */
  public CensusResources censusResources() {
    return new CensusResources();
  }

  /**
   * An accessor for creating requests from the CensusResources collection.
   *
   * @deprecated (scheduled to be removed in 1.4) Use {@link #censusResources()}
   */
  @Deprecated
  public final CensusResources censusResources = new CensusResources();

  /**
   * The "CensusResources" collection of methods.
   */
  public class CensusResources {

    /**
     * Returns an area&#39;s housing data. Information includes the number of housing units, and the
     * percentage of those that are vacant.
     *
     * Create a request for the method "CensusResources.Housing".
     *
     * This request holds the parameters needed by the the censusapi server.  After setting any optional
     * parameters, call the {@link Housing#execute()} method to invoke the remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Housing housing() throws IOException {
      Housing result = new Housing();
      initialize(result);
      return result;
    }

    public class Housing extends CensusapiRequest {

      private static final String REST_PATH = "census/housing";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Housing() {
        super(Censusapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "housing" request to the Censusapi server.
       *
       * @throws IOException if the request fails
       */
      public void execute() throws IOException {
        HttpResponse response = executeUnparsed();

        response.ignore();

      }


      /** [placename, FIPS, GNIS] */
      @Key("keyname")
      private String keyname;

      /** [ placename, FIPS, GNIS]
       */
      public String getKeyname() {
        return keyname;
      }

      /** [placename, FIPS, GNIS] */
      public Housing setKeyname(String keyname) {
        this.keyname = keyname;
        return this;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      @Key("sumlevid")
      private String sumlevid;

      /**  1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level
       */
      public String getSumlevid() {
        return sumlevid;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      public Housing setSumlevid(String sumlevid) {
        this.sumlevid = sumlevid;
        return this;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      @Key("keypat")
      private String keypat;

      /**  State abbreviation default, or arbitrary placename if keyname=placename
       */
      public String getKeypat() {
        return keypat;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      public Housing setKeypat(String keypat) {
        this.keypat = keypat;
        return this;
      }


    }
    /**
     * Returns an area&#39;s racial data. Information includes the percentage of an area&#39;s
     * population that identifies as White, Black, American Indian, Asian, native Hawaiian/Pacific
     * Islander, or mixed race.
     *
     * Create a request for the method "CensusResources.Race".
     *
     * This request holds the parameters needed by the the censusapi server.  After setting any optional
     * parameters, call the {@link Race#execute()} method to invoke the remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Race race() throws IOException {
      Race result = new Race();
      initialize(result);
      return result;
    }

    public class Race extends CensusapiRequest {

      private static final String REST_PATH = "census/race";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Race() {
        super(Censusapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "race" request to the Censusapi server.
       *
       * @throws IOException if the request fails
       */
      public void execute() throws IOException {
        HttpResponse response = executeUnparsed();

        response.ignore();

      }


      /** [placename, FIPS, GNIS] */
      @Key("keyname")
      private String keyname;

      /** [ placename, FIPS, GNIS]
       */
      public String getKeyname() {
        return keyname;
      }

      /** [placename, FIPS, GNIS] */
      public Race setKeyname(String keyname) {
        this.keyname = keyname;
        return this;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      @Key("sumlevid")
      private String sumlevid;

      /**  1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level
       */
      public String getSumlevid() {
        return sumlevid;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      public Race setSumlevid(String sumlevid) {
        this.sumlevid = sumlevid;
        return this;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      @Key("keypat")
      private String keypat;

      /**  State abbreviation default, or arbitrary placename if keyname=placename
       */
      public String getKeypat() {
        return keypat;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      public Race setKeypat(String keypat) {
        this.keypat = keypat;
        return this;
      }


    }
    /**
     * Returns all available ethnicity, housing, population and race information for specified area.
     *
     * Create a request for the method "CensusResources.Locations".
     *
     * This request holds the parameters needed by the the censusapi server.  After setting any optional
     * parameters, call the {@link Locations#execute()} method to invoke the remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Locations locations() throws IOException {
      Locations result = new Locations();
      initialize(result);
      return result;
    }

    public class Locations extends CensusapiRequest {

      private static final String REST_PATH = "census/locations";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Locations() {
        super(Censusapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "locations" request to the Censusapi server.
       *
       * @throws IOException if the request fails
       */
      public void execute() throws IOException {
        HttpResponse response = executeUnparsed();

        response.ignore();

      }


      /** [placename, FIPS, GNIS] */
      @Key("keyname")
      private String keyname;

      /** [ placename, FIPS, GNIS]
       */
      public String getKeyname() {
        return keyname;
      }

      /** [placename, FIPS, GNIS] */
      public Locations setKeyname(String keyname) {
        this.keyname = keyname;
        return this;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      @Key("sumlevid")
      private String sumlevid;

      /**  1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level
       */
      public String getSumlevid() {
        return sumlevid;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      public Locations setSumlevid(String sumlevid) {
        this.sumlevid = sumlevid;
        return this;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      @Key("keypat")
      private String keypat;

      /**  State abbreviation default, or arbitrary placename if keyname=placename
       */
      public String getKeypat() {
        return keypat;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      public Locations setKeypat(String keypat) {
        this.keypat = keypat;
        return this;
      }


    }
    /**
     * Returns an area&#39;s ethnic data. Information includes how much of the population identifies as
     * Hispanic or non-Hispanic white, and the USA TODAY Diversity Index.
     *
     * Create a request for the method "CensusResources.Ethnicity".
     *
     * This request holds the parameters needed by the the censusapi server.  After setting any optional
     * parameters, call the {@link Ethnicity#execute()} method to invoke the remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Ethnicity ethnicity() throws IOException {
      Ethnicity result = new Ethnicity();
      initialize(result);
      return result;
    }

    public class Ethnicity extends CensusapiRequest {

      private static final String REST_PATH = "census/ethnicity";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Ethnicity() {
        super(Censusapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "ethnicity" request to the Censusapi server.
       *
       * @throws IOException if the request fails
       */
      public void execute() throws IOException {
        HttpResponse response = executeUnparsed();

        response.ignore();

      }


      /** [placename, FIPS, GNIS] */
      @Key("keyname")
      private String keyname;

      /** [ placename, FIPS, GNIS]
       */
      public String getKeyname() {
        return keyname;
      }

      /** [placename, FIPS, GNIS] */
      public Ethnicity setKeyname(String keyname) {
        this.keyname = keyname;
        return this;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      @Key("sumlevid")
      private String sumlevid;

      /**  1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level
       */
      public String getSumlevid() {
        return sumlevid;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      public Ethnicity setSumlevid(String sumlevid) {
        this.sumlevid = sumlevid;
        return this;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      @Key("keypat")
      private String keypat;

      /**  State abbreviation default, or arbitrary placename if keyname=placename
       */
      public String getKeypat() {
        return keypat;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      public Ethnicity setKeypat(String keypat) {
        this.keypat = keypat;
        return this;
      }


    }
    /**
     * Returns an area&#39;s population data. Information includes the total population of an area,
     * average population per square mile, and the percent by which that population has changed since
     * the last census.
     *
     * Create a request for the method "CensusResources.Population".
     *
     * This request holds the parameters needed by the the censusapi server.  After setting any optional
     * parameters, call the {@link Population#execute()} method to invoke the remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Population population() throws IOException {
      Population result = new Population();
      initialize(result);
      return result;
    }

    public class Population extends CensusapiRequest {

      private static final String REST_PATH = "census/population";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Population() {
        super(Censusapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "population" request to the Censusapi server.
       *
       * @throws IOException if the request fails
       */
      public void execute() throws IOException {
        HttpResponse response = executeUnparsed();

        response.ignore();

      }


      /** [placename, FIPS, GNIS] */
      @Key("keyname")
      private String keyname;

      /** [ placename, FIPS, GNIS]
       */
      public String getKeyname() {
        return keyname;
      }

      /** [placename, FIPS, GNIS] */
      public Population setKeyname(String keyname) {
        this.keyname = keyname;
        return this;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      @Key("sumlevid")
      private String sumlevid;

      /**  1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level
       */
      public String getSumlevid() {
        return sumlevid;
      }

      /** 1 = National level, 2 = State level, 3 = County level, 4,6 = City,town level */
      public Population setSumlevid(String sumlevid) {
        this.sumlevid = sumlevid;
        return this;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      @Key("keypat")
      private String keypat;

      /**  State abbreviation default, or arbitrary placename if keyname=placename
       */
      public String getKeypat() {
        return keypat;
      }

      /** State abbreviation default, or arbitrary placename if keyname=placename */
      public Population setKeypat(String keypat) {
        this.keypat = keypat;
        return this;
      }


    }

  }



  /**
   * Builder for {@link Censusapi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends GoogleClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     */
    Builder(HttpTransport transport, JsonFactory jsonFactory) {
      super(transport, jsonFactory, new GenericUrl(DEFAULT_BASE_URL));
    }

    /** Builds a new instance of {@link Censusapi}. */
    @Override
    public Censusapi build() {
      return new Censusapi(
          getTransport(),
          getJsonHttpRequestInitializer(),
          getHttpRequestInitializer(),
          getJsonFactory(),
          getBaseUrl().build(),
          getApplicationName());
    }

    @Override
    public Builder setJsonHttpRequestInitializer(
        JsonHttpRequestInitializer jsonHttpRequestInitializer) {
      super.setJsonHttpRequestInitializer(jsonHttpRequestInitializer);
      return this;
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      super.setHttpRequestInitializer(httpRequestInitializer);
      return this;
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      super.setApplicationName(applicationName);
      return this;
    }
  }
}
