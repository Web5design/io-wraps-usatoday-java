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

package com.google.api.services.articlesapi;


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
 * Service definition for Articlesapi (1.0).
 *
 * <p>
 * 
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
  public class ArticlesapiRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        ArticlesapiRequest articlesapiRequest = (ArticlesapiRequest)request;
        articlesapiRequest.setPrettyPrint(true);
        articlesapiRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Articlesapi extends GoogleClient {

  /**
   * The default base URL of the service. This is determined when the library is generated and
   * normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = "https://www.googleapis.comopen/";

  /**
   * The application name to be sent in the User-Agent header of each request.
   */
  @Deprecated
  private String applicationName;

  /**
   * The URL of the server hosting the API.
   */
  @Deprecated
  private String baseServer = "https://www.googleapis.com";

  /**
   * The base path of the service.
   */
  @Deprecated
  private String basePath = "open/";

  /**
   * Construct a Articlesapi instance to connect to the Articlesapi service.
   *
   * @param transport The transport to use for requests
   * @param requestInitializer A initializer to use to build requests for subsequent API calls. May
   *        be null if no initializer is required.
   * @param jsonFactory A factory for creating JSON parsers and serializers
   *
   * @deprecated (scheduled to be removed in 1.4) Use
   *             {@link #Articlesapi(HttpTransport, JsonFactory)} for only required
   *             params or {@link Builder} if you need to specify any of the optional params.
   */
  @Deprecated
  public Articlesapi(
      HttpTransport transport,
      HttpRequestInitializer requestInitializer,
      JsonFactory jsonFactory) {
    super(transport, new ArticlesapiRequestInitializer(), requestInitializer, jsonFactory,
        DEFAULT_BASE_URL, null);
    ((ArticlesapiRequestInitializer)getJsonHttpRequestInitializer()).setArticlesapi(this);
  }

  /**
   * Construct a Articlesapi instance to connect to the Articlesapi service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   */
  public Articlesapi(HttpTransport transport, JsonFactory jsonFactory) {
    this(transport, null, jsonFactory);
  }

  /**
   * Construct a Articlesapi instance to connect to the Articlesapi service.
   *
   * @param appName The application name. This is embedded into the User-Agent string
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   *
   * @deprecated (scheduled to be removed in 1.4) Use
   *             {@link #Articlesapi(HttpTransport, JsonFactory)} for only required
   *             params or {@link Builder} if you need to specify any of the optional params.
   */
  @Deprecated
  public Articlesapi(String appName, HttpTransport transport, JsonFactory jsonFactory) {
    this(transport, null, jsonFactory);
    setApplicationName(appName);
  }


  /**
   * Created to maintain backwards compatibility (scheduled to be removed in 1.4).
   */
  private static class ArticlesapiRequestInitializer implements JsonHttpRequestInitializer {
    private Articlesapi articlesapi;
    void setArticlesapi(Articlesapi articlesapi) {
      this.articlesapi = articlesapi;
    }
    public void initialize(JsonHttpRequest jsonHttpRequest) {
      ArticlesapiRequest request = (ArticlesapiRequest)jsonHttpRequest;
    }
  }

  /**
   * Construct a Articlesapi instance to connect to the Articlesapi service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param baseUrl The base url of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  Articlesapi(
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
   * Returns the base URL of the service, for example {@code "https://www.googleapis.comopen/"}.
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
   * Returns the base path of the service, for example {@code "open/"}.
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
   * An accessor for creating requests from the ArticlesMethods collection.
   *
   * The typical use is:<pre>
   *   {@code Articlesapi articlesapi = new Articlesapi(...);}
   *   {@code Articlesapi.ArticlesMethods.List request = articlesapi.articlesMethods().list(parameters ...)}</pre>
   *
   * @return the resource collection
   */
  public ArticlesMethods articlesMethods() {
    return new ArticlesMethods();
  }

  /**
   * An accessor for creating requests from the ArticlesMethods collection.
   *
   * @deprecated (scheduled to be removed in 1.4) Use {@link #articlesMethods()}
   */
  @Deprecated
  public final ArticlesMethods articlesMethods = new ArticlesMethods();

  /**
   * The "ArticlesMethods" collection of methods.
   */
  public class ArticlesMethods {

    /**
     * Community feeds return content from any one of USA TODAY&#39;s blogs in reverse chronological
     * order.
     *
     * Create a request for the method "ArticlesMethods.CommunityFeedMethods".
     *
     * This request holds the parameters needed by the the articlesapi server.  After setting any
     * optional parameters, call the {@link CommunityFeedMethods#execute()} method to invoke the remote
     * operation.
     *
     * @param community Use this to request Top News by section. Default is home
    [default: entertainment]
     * @param encoding Output format as JSON or RSS
    [default: json]
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public CommunityFeedMethods communityFeedMethods(String community, String encoding) throws IOException {
      CommunityFeedMethods result = new CommunityFeedMethods(community, encoding);
      initialize(result);
      return result;
    }

    public class CommunityFeedMethods extends ArticlesapiRequest {

      private static final String REST_PATH = "articles/{community}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private CommunityFeedMethods(String community, String encoding) {
        super(Articlesapi.this, HttpMethod.GET, REST_PATH, null);
        this.community = community;
        this.encoding = encoding;
      }

      /**
       * Sends the "communityFeedMethods" request to the Articlesapi server.
       *
       * @return the {@link com.google.api.services.articlesapi.model.StoryList} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.articlesapi.model.StoryList execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.articlesapi.model.StoryList result = response.parseAs(
            com.google.api.services.articlesapi.model.StoryList.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Use this to request Top News by section. Default is home */
      @Key("community")
      private String community;

      /**  Use this to request Top News by section. Default is home [default: entertainment]
       */
      public String getCommunity() {
        return community;
      }

      /** Use this to request Top News by section. Default is home */
      public CommunityFeedMethods setCommunity(String community) {
        this.community = community;
        return this;
      }

      /** Output format as JSON or RSS */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or RSS [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or RSS */
      public CommunityFeedMethods setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }


    }
    /**
     * Use this to request Top News by section. Default is home
     *
     * Create a request for the method "ArticlesMethods.TopNews".
     *
     * This request holds the parameters needed by the the articlesapi server.  After setting any
     * optional parameters, call the {@link TopNews#execute()} method to invoke the remote operation.
     *
     * @param encoding Output format as JSON or RSS
    [default: json]
     * @param section Use this to request Top News by section. Default is home
    [default: home]
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public TopNews topNews(String encoding, String section) throws IOException {
      TopNews result = new TopNews(encoding, section);
      initialize(result);
      return result;
    }

    public class TopNews extends ArticlesapiRequest {

      private static final String REST_PATH = "articles/topnews/{section}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private TopNews(String encoding, String section) {
        super(Articlesapi.this, HttpMethod.GET, REST_PATH, null);
        this.encoding = encoding;
        this.section = section;
      }

      /**
       * Sends the "topNews" request to the Articlesapi server.
       *
       * @return the {@link com.google.api.services.articlesapi.model.StoryList} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.articlesapi.model.StoryList execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.articlesapi.model.StoryList result = response.parseAs(
            com.google.api.services.articlesapi.model.StoryList.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Use this value to set the number of incoming stories. (default is 10) */
      @Key("count")
      private String count;

      /**  Use this value to set the number of incoming stories. (default is 10) [default: 10]
       */
      public String getCount() {
        return count;
      }

      /** Use this value to set the number of incoming stories. (default is 10) */
      public TopNews setCount(String count) {
        this.count = count;
        return this;
      }

      /** Output format as JSON or RSS */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or RSS [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or RSS */
      public TopNews setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Use this to request Top News by section. Default is home */
      @Key("section")
      private String section;

      /**  Use this to request Top News by section. Default is home [default: home]
       */
      public String getSection() {
        return section;
      }

      /** Use this to request Top News by section. Default is home */
      public TopNews setSection(String section) {
        this.section = section;
        return this;
      }

      /** Returns stories that are no older than X days old, where X equals the input value. */
      @Key("days")
      private String days;

      /**  Returns stories that are no older than X days old, where X equals the input value. [default: 0]
       */
      public String getDays() {
        return days;
      }

      /** Returns stories that are no older than X days old, where X equals the input value. */
      public TopNews setDays(String days) {
        this.days = days;
        return this;
      }

      /** Appends the designated CSP value to each hyperlink. */
      @Key("csp")
      private String csp;

      /**  Appends the designated CSP value to each hyperlink.
       */
      public String getCsp() {
        return csp;
      }

      /** Appends the designated CSP value to each hyperlink. */
      public TopNews setCsp(String csp) {
        this.csp = csp;
        return this;
      }

      /** Returns the Xth page of results, where X equals the input value. */
      @Key("page")
      private String page;

      /**  Returns the Xth page of results, where X equals the input value. [default: 0]
       */
      public String getPage() {
        return page;
      }

      /** Returns the Xth page of results, where X equals the input value. */
      public TopNews setPage(String page) {
        this.page = page;
        return this;
      }


    }

  }



  /**
   * Builder for {@link Articlesapi}.
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

    /** Builds a new instance of {@link Articlesapi}. */
    @Override
    public Articlesapi build() {
      return new Articlesapi(
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
