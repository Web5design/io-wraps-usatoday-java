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

package com.google.api.services.bestsellingbooksapi;


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
 * Service definition for Bestsellingbooksapi (1.0).
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
  public class BestsellingbooksapiRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        BestsellingbooksapiRequest bestsellingbooksapiRequest = (BestsellingbooksapiRequest)request;
        bestsellingbooksapiRequest.setPrettyPrint(true);
        bestsellingbooksapiRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Bestsellingbooksapi extends GoogleClient {

  /**
   * The default base URL of the service. This is determined when the library is generated and
   * normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = "https://www.googleapis.com/open";

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
  private String basePath = "/open";

  /**
   * Construct a Bestsellingbooksapi instance to connect to the Bestsellingbooksapi service.
   *
   * @param transport The transport to use for requests
   * @param requestInitializer A initializer to use to build requests for subsequent API calls. May
   *        be null if no initializer is required.
   * @param jsonFactory A factory for creating JSON parsers and serializers
   *
   * @deprecated (scheduled to be removed in 1.4) Use
   *             {@link #Bestsellingbooksapi(HttpTransport, JsonFactory)} for only required
   *             params or {@link Builder} if you need to specify any of the optional params.
   */
  @Deprecated
  public Bestsellingbooksapi(
      HttpTransport transport,
      HttpRequestInitializer requestInitializer,
      JsonFactory jsonFactory) {
    super(transport, new BestsellingbooksapiRequestInitializer(), requestInitializer, jsonFactory,
        DEFAULT_BASE_URL, null);
    ((BestsellingbooksapiRequestInitializer)getJsonHttpRequestInitializer()).setBestsellingbooksapi(this);
  }

  /**
   * Construct a Bestsellingbooksapi instance to connect to the Bestsellingbooksapi service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   */
  public Bestsellingbooksapi(HttpTransport transport, JsonFactory jsonFactory) {
    this(transport, null, jsonFactory);
  }

  /**
   * Construct a Bestsellingbooksapi instance to connect to the Bestsellingbooksapi service.
   *
   * @param appName The application name. This is embedded into the User-Agent string
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   *
   * @deprecated (scheduled to be removed in 1.4) Use
   *             {@link #Bestsellingbooksapi(HttpTransport, JsonFactory)} for only required
   *             params or {@link Builder} if you need to specify any of the optional params.
   */
  @Deprecated
  public Bestsellingbooksapi(String appName, HttpTransport transport, JsonFactory jsonFactory) {
    this(transport, null, jsonFactory);
    setApplicationName(appName);
  }


  /**
   * Created to maintain backwards compatibility (scheduled to be removed in 1.4).
   */
  private static class BestsellingbooksapiRequestInitializer implements JsonHttpRequestInitializer {
    private Bestsellingbooksapi bestsellingbooksapi;
    void setBestsellingbooksapi(Bestsellingbooksapi bestsellingbooksapi) {
      this.bestsellingbooksapi = bestsellingbooksapi;
    }
    public void initialize(JsonHttpRequest jsonHttpRequest) {
      BestsellingbooksapiRequest request = (BestsellingbooksapiRequest)jsonHttpRequest;
    }
  }

  /**
   * Construct a Bestsellingbooksapi instance to connect to the Bestsellingbooksapi service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param baseUrl The base url of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  Bestsellingbooksapi(
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
   * An accessor for creating requests from the BestSellingBooksMethods collection.
   *
   * The typical use is:<pre>
   *   {@code Bestsellingbooksapi bestsellingbooksapi = new Bestsellingbooksapi(...);}
   *   {@code Bestsellingbooksapi.BestSellingBooksMethods.List request = bestsellingbooksapi.bestSellingBooksMethods().list(parameters ...)}</pre>
   *
   * @return the resource collection
   */
  public BestSellingBooksMethods bestSellingBooksMethods() {
    return new BestSellingBooksMethods();
  }

  /**
   * An accessor for creating requests from the BestSellingBooksMethods collection.
   *
   * @deprecated (scheduled to be removed in 1.4) Use {@link #bestSellingBooksMethods()}
   */
  @Deprecated
  public final BestSellingBooksMethods bestSellingBooksMethods = new BestSellingBooksMethods();

  /**
   * The "BestSellingBooksMethods" collection of methods.
   */
  public class BestSellingBooksMethods {

    /**
     * Returns the date of each weekly books list for a particular year (published since October 1993,
     * when the books list began)
     *
     * Create a request for the method "BestSellingBooksMethods.BestSellingBookListsForParticularYear".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link BestSellingBookListsForParticularYear#execute()} method
     * to invoke the remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public BestSellingBookListsForParticularYear bestSellingBookListsForParticularYear() throws IOException {
      BestSellingBookListsForParticularYear result = new BestSellingBookListsForParticularYear();
      initialize(result);
      return result;
    }

    public class BestSellingBookListsForParticularYear extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/dates/{year}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private BestSellingBookListsForParticularYear() {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "bestSellingBookListsForParticularYear" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.BooksByDateResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.BooksByDateResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.BooksByDateResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.BooksByDateResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public BestSellingBookListsForParticularYear setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format [default: 2011]
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public BestSellingBookListsForParticularYear setYear(String year) {
        this.year = year;
        return this;
      }


    }
    /**
     * Returns the dates of each weekly books list for that particular year and month.
     *
     * Create a request for the method "BestSellingBooksMethods.Top150BooksForParticularYearAndMonth".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link Top150BooksForParticularYearAndMonth#execute()} method
     * to invoke the remote operation.
     *
     * @param month Month in M or MM format
    [default: 8]
     * @param year Year in YYYY format
    [default: 2011]
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Top150BooksForParticularYearAndMonth top150BooksForParticularYearAndMonth(String month, String year) throws IOException {
      Top150BooksForParticularYearAndMonth result = new Top150BooksForParticularYearAndMonth(month, year);
      initialize(result);
      return result;
    }

    public class Top150BooksForParticularYearAndMonth extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/booklists/{year}/{month}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Top150BooksForParticularYearAndMonth(String month, String year) {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
        this.month = month;
        this.year = year;
      }

      /**
       * Sends the "top150BooksForParticularYearAndMonth" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.BooksListResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.BooksListResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.BooksListResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.BooksListResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Use this value to set the number of books returned. */
      @Key("count")
      private String count;

      /**  Use this value to set the number of books returned.
       */
      public String getCount() {
        return count;
      }

      /** Use this value to set the number of books returned. */
      public Top150BooksForParticularYearAndMonth setCount(String count) {
        this.count = count;
        return this;
      }

      /** Title */
      @Key("title")
      private String title;

      /**  Title
       */
      public String getTitle() {
        return title;
      }

      /** Title */
      public Top150BooksForParticularYearAndMonth setTitle(String title) {
        this.title = title;
        return this;
      }

      /** Author */
      @Key("author")
      private String author;

      /**  Author
       */
      public String getAuthor() {
        return author;
      }

      /** Author */
      public Top150BooksForParticularYearAndMonth setAuthor(String author) {
        this.author = author;
        return this;
      }

      /** Month in M or MM format */
      @Key("month")
      private String month;

      /**  Month in M or MM format [default: 8]
       */
      public String getMonth() {
        return month;
      }

      /** Month in M or MM format */
      public Top150BooksForParticularYearAndMonth setMonth(String month) {
        this.month = month;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public Top150BooksForParticularYearAndMonth setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format [default: 2011]
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public Top150BooksForParticularYearAndMonth setYear(String year) {
        this.year = year;
        return this;
      }

      /** Class */
      @Key("class")
      private String bestsellingbooksapiClass;

      /**  Class
       */
      public String getBestsellingbooksapiClass() {
        return bestsellingbooksapiClass;
      }

      /** Class */
      public Top150BooksForParticularYearAndMonth setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
        this.bestsellingbooksapiClass = bestsellingbooksapiClass;
        return this;
      }


    }
    /**
     * Returns the date of each weekly books list published since October 1993, when the books list
     * began
     *
     * Create a request for the method
     * "BestSellingBooksMethods.AllBestSellingBookListsPublishedSince1993".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link AllBestSellingBookListsPublishedSince1993#execute()}
     * method to invoke the remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public AllBestSellingBookListsPublishedSince1993 allBestSellingBookListsPublishedSince1993() throws IOException {
      AllBestSellingBookListsPublishedSince1993 result = new AllBestSellingBookListsPublishedSince1993();
      initialize(result);
      return result;
    }

    public class AllBestSellingBookListsPublishedSince1993 extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/dates";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private AllBestSellingBookListsPublishedSince1993() {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "allBestSellingBookListsPublishedSince1993" request to the Bestsellingbooksapi
       * server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.BooksByDateResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.BooksByDateResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.BooksByDateResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.BooksByDateResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Use with maxyear to specify a range */
      @Key("minyear")
      private String minyear;

      /**  Use with maxyear to specify a range
       */
      public String getMinyear() {
        return minyear;
      }

      /** Use with maxyear to specify a range */
      public AllBestSellingBookListsPublishedSince1993 setMinyear(String minyear) {
        this.minyear = minyear;
        return this;
      }

      /** Use with minyear to specify a range */
      @Key("maxyear")
      private String maxyear;

      /**  Use with minyear to specify a range
       */
      public String getMaxyear() {
        return maxyear;
      }

      /** Use with minyear to specify a range */
      public AllBestSellingBookListsPublishedSince1993 setMaxyear(String maxyear) {
        this.maxyear = maxyear;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public AllBestSellingBookListsPublishedSince1993 setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }


    }
    /**
     * Returns list of titles that have appeared on the books list.
     *
     * Create a request for the method "BestSellingBooksMethods.SearchbyTitle".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link SearchbyTitle#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public SearchbyTitle searchbyTitle() throws IOException {
      SearchbyTitle result = new SearchbyTitle();
      initialize(result);
      return result;
    }

    public class SearchbyTitle extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/titles/";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private SearchbyTitle() {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "searchbyTitle" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.TitlesResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.TitlesResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.TitlesResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.TitlesResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Category */
      @Key("category")
      private String category;

      /**  Category
       */
      public String getCategory() {
        return category;
      }

      /** Category */
      public SearchbyTitle setCategory(String category) {
        this.category = category;
        return this;
      }

      /** Use with minyear to specify a range */
      @Key("maxyear")
      private String maxyear;

      /**  Use with minyear to specify a range
       */
      public String getMaxyear() {
        return maxyear;
      }

      /** Use with minyear to specify a range */
      public SearchbyTitle setMaxyear(String maxyear) {
        this.maxyear = maxyear;
        return this;
      }

      /** Author */
      @Key("author")
      private String author;

      /**  Author
       */
      public String getAuthor() {
        return author;
      }

      /** Author */
      public SearchbyTitle setAuthor(String author) {
        this.author = author;
        return this;
      }

      /** Title */
      @Key("title")
      private String title;

      /**  Title [default: Steve Jobs]
       */
      public String getTitle() {
        return title;
      }

      /** Title */
      public SearchbyTitle setTitle(String title) {
        this.title = title;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public SearchbyTitle setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public SearchbyTitle setYear(String year) {
        this.year = year;
        return this;
      }

      /** Use with maxyear to specify a range */
      @Key("minyear")
      private String minyear;

      /**  Use with maxyear to specify a range
       */
      public String getMinyear() {
        return minyear;
      }

      /** Use with maxyear to specify a range */
      public SearchbyTitle setMinyear(String minyear) {
        this.minyear = minyear;
        return this;
      }

      /** Class */
      @Key("class")
      private String bestsellingbooksapiClass;

      /**  Class
       */
      public String getBestsellingbooksapiClass() {
        return bestsellingbooksapiClass;
      }

      /** Class */
      public SearchbyTitle setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
        this.bestsellingbooksapiClass = bestsellingbooksapiClass;
        return this;
      }


    }
    /**
     * Returns the dates of each weekly books list for that particular year.
     *
     * Create a request for the method "BestSellingBooksMethods.Top150BooksForParticularYear".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link Top150BooksForParticularYear#execute()} method to invoke
     * the remote operation.
     *
     * @param year Year in YYYY format
    [default: 2011]
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Top150BooksForParticularYear top150BooksForParticularYear(String year) throws IOException {
      Top150BooksForParticularYear result = new Top150BooksForParticularYear(year);
      initialize(result);
      return result;
    }

    public class Top150BooksForParticularYear extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/booklists/{year}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Top150BooksForParticularYear(String year) {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
        this.year = year;
      }

      /**
       * Sends the "top150BooksForParticularYear" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.BooksListResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.BooksListResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.BooksListResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.BooksListResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Category */
      @Key("category")
      private String category;

      /**  Category
       */
      public String getCategory() {
        return category;
      }

      /** Category */
      public Top150BooksForParticularYear setCategory(String category) {
        this.category = category;
        return this;
      }

      /** Use this value to set the number of books returned. */
      @Key("count")
      private String count;

      /**  Use this value to set the number of books returned.
       */
      public String getCount() {
        return count;
      }

      /** Use this value to set the number of books returned. */
      public Top150BooksForParticularYear setCount(String count) {
        this.count = count;
        return this;
      }

      /** Title */
      @Key("title")
      private String title;

      /**  Title
       */
      public String getTitle() {
        return title;
      }

      /** Title */
      public Top150BooksForParticularYear setTitle(String title) {
        this.title = title;
        return this;
      }

      /** Author */
      @Key("author")
      private String author;

      /**  Author
       */
      public String getAuthor() {
        return author;
      }

      /** Author */
      public Top150BooksForParticularYear setAuthor(String author) {
        this.author = author;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public Top150BooksForParticularYear setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format [default: 2011]
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public Top150BooksForParticularYear setYear(String year) {
        this.year = year;
        return this;
      }

      /** Class */
      @Key("class")
      private String bestsellingbooksapiClass;

      /**  Class
       */
      public String getBestsellingbooksapiClass() {
        return bestsellingbooksapiClass;
      }

      /** Class */
      public Top150BooksForParticularYear setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
        this.bestsellingbooksapiClass = bestsellingbooksapiClass;
        return this;
      }


    }
    /**
     * Returns a list of available book classes (fiction or non-fiction)
     *
     * Create a request for the method "BestSellingBooksMethods.Classes".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link Classes#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Classes classes() throws IOException {
      Classes result = new Classes();
      initialize(result);
      return result;
    }

    public class Classes extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/classes";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Classes() {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "classes" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.ClassesResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.ClassesResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.ClassesResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.ClassesResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Category */
      @Key("category")
      private String category;

      /**  Category
       */
      public String getCategory() {
        return category;
      }

      /** Category */
      public Classes setCategory(String category) {
        this.category = category;
        return this;
      }

      /** Use with minyear to specify a range */
      @Key("maxyear")
      private String maxyear;

      /**  Use with minyear to specify a range
       */
      public String getMaxyear() {
        return maxyear;
      }

      /** Use with minyear to specify a range */
      public Classes setMaxyear(String maxyear) {
        this.maxyear = maxyear;
        return this;
      }

      /** Title */
      @Key("title")
      private String title;

      /**  Title
       */
      public String getTitle() {
        return title;
      }

      /** Title */
      public Classes setTitle(String title) {
        this.title = title;
        return this;
      }

      /** Author */
      @Key("author")
      private String author;

      /**  Author
       */
      public String getAuthor() {
        return author;
      }

      /** Author */
      public Classes setAuthor(String author) {
        this.author = author;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public Classes setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public Classes setYear(String year) {
        this.year = year;
        return this;
      }

      /** Use with maxyear to specify a range */
      @Key("minyear")
      private String minyear;

      /**  Use with maxyear to specify a range
       */
      public String getMinyear() {
        return minyear;
      }

      /** Use with maxyear to specify a range */
      public Classes setMinyear(String minyear) {
        this.minyear = minyear;
        return this;
      }


    }
    /**
     * Returns the dates of each weekly books list for that particular year.
     *
     * Create a request for the method "BestSellingBooksMethods.Top150BooksForParticularDate".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link Top150BooksForParticularDate#execute()} method to invoke
     * the remote operation.
     *
     * @param month Choose a Month
    [default: 8]
     * @param year Year in YYYY format
    [default: 2011]
     * @param date Day of month. Must be a Thursday, when booklists are published.
    [default: 4]
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Top150BooksForParticularDate top150BooksForParticularDate(String month, String year, String date) throws IOException {
      Top150BooksForParticularDate result = new Top150BooksForParticularDate(month, year, date);
      initialize(result);
      return result;
    }

    public class Top150BooksForParticularDate extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/booklists/{year}/{month}/{date}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Top150BooksForParticularDate(String month, String year, String date) {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
        this.month = month;
        this.year = year;
        this.date = date;
      }

      /**
       * Sends the "top150BooksForParticularDate" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.BooksListResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.BooksListResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.BooksListResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.BooksListResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Use this value to set the number of books returned. */
      @Key("count")
      private String count;

      /**  Use this value to set the number of books returned.
       */
      public String getCount() {
        return count;
      }

      /** Use this value to set the number of books returned. */
      public Top150BooksForParticularDate setCount(String count) {
        this.count = count;
        return this;
      }

      /** Title */
      @Key("title")
      private String title;

      /**  Title
       */
      public String getTitle() {
        return title;
      }

      /** Title */
      public Top150BooksForParticularDate setTitle(String title) {
        this.title = title;
        return this;
      }

      /** Author */
      @Key("author")
      private String author;

      /**  Author
       */
      public String getAuthor() {
        return author;
      }

      /** Author */
      public Top150BooksForParticularDate setAuthor(String author) {
        this.author = author;
        return this;
      }

      /** Choose a Month */
      @Key("month")
      private String month;

      /**  Choose a Month [default: 8]
       */
      public String getMonth() {
        return month;
      }

      /** Choose a Month */
      public Top150BooksForParticularDate setMonth(String month) {
        this.month = month;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public Top150BooksForParticularDate setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format [default: 2011]
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public Top150BooksForParticularDate setYear(String year) {
        this.year = year;
        return this;
      }

      /** Day of month. Must be a Thursday, when booklists are published. */
      @Key("date")
      private String date;

      /**  Day of month. Must be a Thursday, when booklists are published. [default: 4]
       */
      public String getDate() {
        return date;
      }

      /** Day of month. Must be a Thursday, when booklists are published. */
      public Top150BooksForParticularDate setDate(String date) {
        this.date = date;
        return this;
      }

      /** Class */
      @Key("class")
      private String bestsellingbooksapiClass;

      /**  Class
       */
      public String getBestsellingbooksapiClass() {
        return bestsellingbooksapiClass;
      }

      /** Class */
      public Top150BooksForParticularDate setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
        this.bestsellingbooksapiClass = bestsellingbooksapiClass;
        return this;
      }


    }
    /**
     * Returns the most recent top 150 books list, including details on each title
     *
     * Create a request for the method "BestSellingBooksMethods.Top150BooksMostRecent".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link Top150BooksMostRecent#execute()} method to invoke the
     * remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Top150BooksMostRecent top150BooksMostRecent() throws IOException {
      Top150BooksMostRecent result = new Top150BooksMostRecent();
      initialize(result);
      return result;
    }

    public class Top150BooksMostRecent extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/booklists";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Top150BooksMostRecent() {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "top150BooksMostRecent" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.BooksListResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.BooksListResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.BooksListResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.BooksListResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Category */
      @Key("category")
      private String category;

      /**  Category
       */
      public String getCategory() {
        return category;
      }

      /** Category */
      public Top150BooksMostRecent setCategory(String category) {
        this.category = category;
        return this;
      }

      /** Use this value to set the number of books returned. */
      @Key("count")
      private String count;

      /**  Use this value to set the number of books returned.
       */
      public String getCount() {
        return count;
      }

      /** Use this value to set the number of books returned. */
      public Top150BooksMostRecent setCount(String count) {
        this.count = count;
        return this;
      }

      /** Use with minyear to specify a range */
      @Key("maxyear")
      private String maxyear;

      /**  Use with minyear to specify a range
       */
      public String getMaxyear() {
        return maxyear;
      }

      /** Use with minyear to specify a range */
      public Top150BooksMostRecent setMaxyear(String maxyear) {
        this.maxyear = maxyear;
        return this;
      }

      /** Title */
      @Key("title")
      private String title;

      /**  Title
       */
      public String getTitle() {
        return title;
      }

      /** Title */
      public Top150BooksMostRecent setTitle(String title) {
        this.title = title;
        return this;
      }

      /** Author */
      @Key("author")
      private String author;

      /**  Author
       */
      public String getAuthor() {
        return author;
      }

      /** Author */
      public Top150BooksMostRecent setAuthor(String author) {
        this.author = author;
        return this;
      }

      /** Choose a Month */
      @Key("month")
      private String month;

      /**  Choose a Month
       */
      public String getMonth() {
        return month;
      }

      /** Choose a Month */
      public Top150BooksMostRecent setMonth(String month) {
        this.month = month;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public Top150BooksMostRecent setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Use with maxyear to specify a range */
      @Key("minyear")
      private String minyear;

      /**  Use with maxyear to specify a range
       */
      public String getMinyear() {
        return minyear;
      }

      /** Use with maxyear to specify a range */
      public Top150BooksMostRecent setMinyear(String minyear) {
        this.minyear = minyear;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public Top150BooksMostRecent setYear(String year) {
        this.year = year;
        return this;
      }

      /** Choose a Date */
      @Key("date")
      private String date;

      /**  Choose a Date
       */
      public String getDate() {
        return date;
      }

      /** Choose a Date */
      public Top150BooksMostRecent setDate(String date) {
        this.date = date;
        return this;
      }

      /** Class */
      @Key("class")
      private String bestsellingbooksapiClass;

      /**  Class
       */
      public String getBestsellingbooksapiClass() {
        return bestsellingbooksapiClass;
      }

      /** Class */
      public Top150BooksMostRecent setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
        this.bestsellingbooksapiClass = bestsellingbooksapiClass;
        return this;
      }


    }
    /**
     * Returns list of titles that have appeared on the books list.
     *
     * Create a request for the method "BestSellingBooksMethods.SearchbyISBN".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link SearchbyISBN#execute()} method to invoke the remote
     * operation.
     *
     * @param isbn ISBN of the book. Example: 9781451648539 for Steve Jobs Biography
    [default: 9781451648539]
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public SearchbyISBN searchbyISBN(String isbn) throws IOException {
      SearchbyISBN result = new SearchbyISBN(isbn);
      initialize(result);
      return result;
    }

    public class SearchbyISBN extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/titles/{isbn}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private SearchbyISBN(String isbn) {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
        this.isbn = isbn;
      }

      /**
       * Sends the "searchbyISBN" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.IsbnResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.IsbnResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.IsbnResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.IsbnResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Category */
      @Key("category")
      private String category;

      /**  Category
       */
      public String getCategory() {
        return category;
      }

      /** Category */
      public SearchbyISBN setCategory(String category) {
        this.category = category;
        return this;
      }

      /** ISBN of the book. Example: 9781451648539 for Steve Jobs Biography */
      @Key("isbn")
      private String isbn;

      /**  ISBN of the book. Example: 9781451648539 for Steve Jobs Biography [default: 9781451648539]
       */
      public String getIsbn() {
        return isbn;
      }

      /** ISBN of the book. Example: 9781451648539 for Steve Jobs Biography */
      public SearchbyISBN setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
      }

      /** Use with minyear to specify a range */
      @Key("maxyear")
      private String maxyear;

      /**  Use with minyear to specify a range
       */
      public String getMaxyear() {
        return maxyear;
      }

      /** Use with minyear to specify a range */
      public SearchbyISBN setMaxyear(String maxyear) {
        this.maxyear = maxyear;
        return this;
      }

      /** Author */
      @Key("author")
      private String author;

      /**  Author
       */
      public String getAuthor() {
        return author;
      }

      /** Author */
      public SearchbyISBN setAuthor(String author) {
        this.author = author;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public SearchbyISBN setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public SearchbyISBN setYear(String year) {
        this.year = year;
        return this;
      }

      /** Use with maxyear to specify a range */
      @Key("minyear")
      private String minyear;

      /**  Use with maxyear to specify a range
       */
      public String getMinyear() {
        return minyear;
      }

      /** Use with maxyear to specify a range */
      public SearchbyISBN setMinyear(String minyear) {
        this.minyear = minyear;
        return this;
      }

      /** Class */
      @Key("class")
      private String bestsellingbooksapiClass;

      /**  Class
       */
      public String getBestsellingbooksapiClass() {
        return bestsellingbooksapiClass;
      }

      /** Class */
      public SearchbyISBN setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
        this.bestsellingbooksapiClass = bestsellingbooksapiClass;
        return this;
      }


    }
    /**
     * Returns the date of each weekly books list for a particular year and month (published since
     * October 1993, when the books list began)
     *
     * Create a request for the method
     * "BestSellingBooksMethods.BestSellingBookListsForParticularYearAndMonth".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link BestSellingBookListsForParticularYearAndMonth#execute()}
     * method to invoke the remote operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public BestSellingBookListsForParticularYearAndMonth bestSellingBookListsForParticularYearAndMonth() throws IOException {
      BestSellingBookListsForParticularYearAndMonth result = new BestSellingBookListsForParticularYearAndMonth();
      initialize(result);
      return result;
    }

    public class BestSellingBookListsForParticularYearAndMonth extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/{year}/{month}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private BestSellingBookListsForParticularYearAndMonth() {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "bestSellingBookListsForParticularYearAndMonth" request to the Bestsellingbooksapi
       * server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.BooksListResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.BooksListResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.BooksListResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.BooksListResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public BestSellingBookListsForParticularYearAndMonth setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Month in M or MM format */
      @Key("month")
      private String month;

      /**  Month in M or MM format [default: 8]
       */
      public String getMonth() {
        return month;
      }

      /** Month in M or MM format */
      public BestSellingBookListsForParticularYearAndMonth setMonth(String month) {
        this.month = month;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format [default: 2011]
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public BestSellingBookListsForParticularYearAndMonth setYear(String year) {
        this.year = year;
        return this;
      }


    }
    /**
     * Returns a list of categories used to classify books.
     *
     * Create a request for the method "BestSellingBooksMethods.Categories".
     *
     * This request holds the parameters needed by the the bestsellingbooksapi server.  After setting
     * any optional parameters, call the {@link Categories#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Categories categories() throws IOException {
      Categories result = new Categories();
      initialize(result);
      return result;
    }

    public class Categories extends BestsellingbooksapiRequest {

      private static final String REST_PATH = "bestsellers/books/categories";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      private Categories() {
        super(Bestsellingbooksapi.this, HttpMethod.GET, REST_PATH, null);
      }

      /**
       * Sends the "categories" request to the Bestsellingbooksapi server.
       *
       * @return the {@link com.google.api.services.bestsellingbooksapi.model.CategoriesResponse} response
       * @throws IOException if the request fails
       */
      public com.google.api.services.bestsellingbooksapi.model.CategoriesResponse execute() throws IOException {
        HttpResponse response = executeUnparsed();

        com.google.api.services.bestsellingbooksapi.model.CategoriesResponse result = response.parseAs(
            com.google.api.services.bestsellingbooksapi.model.CategoriesResponse.class);
        result.setResponseHeaders(response.getHeaders());
        return result;

      }


      /** Use with minyear to specify a range */
      @Key("maxyear")
      private String maxyear;

      /**  Use with minyear to specify a range
       */
      public String getMaxyear() {
        return maxyear;
      }

      /** Use with minyear to specify a range */
      public Categories setMaxyear(String maxyear) {
        this.maxyear = maxyear;
        return this;
      }

      /** Title */
      @Key("title")
      private String title;

      /**  Title
       */
      public String getTitle() {
        return title;
      }

      /** Title */
      public Categories setTitle(String title) {
        this.title = title;
        return this;
      }

      /** Author */
      @Key("author")
      private String author;

      /**  Author
       */
      public String getAuthor() {
        return author;
      }

      /** Author */
      public Categories setAuthor(String author) {
        this.author = author;
        return this;
      }

      /** Output format as JSON or XML */
      @Key("encoding")
      private String encoding;

      /**  Output format as JSON or XML [default: json]
       */
      public String getEncoding() {
        return encoding;
      }

      /** Output format as JSON or XML */
      public Categories setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
      }

      /** Year in YYYY format */
      @Key("year")
      private String year;

      /**  Year in YYYY format
       */
      public String getYear() {
        return year;
      }

      /** Year in YYYY format */
      public Categories setYear(String year) {
        this.year = year;
        return this;
      }

      /** Use with maxyear to specify a range */
      @Key("minyear")
      private String minyear;

      /**  Use with maxyear to specify a range
       */
      public String getMinyear() {
        return minyear;
      }

      /** Use with maxyear to specify a range */
      public Categories setMinyear(String minyear) {
        this.minyear = minyear;
        return this;
      }

      /** Class */
      @Key("class")
      private String bestsellingbooksapiClass;

      /**  Class
       */
      public String getBestsellingbooksapiClass() {
        return bestsellingbooksapiClass;
      }

      /** Class */
      public Categories setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
        this.bestsellingbooksapiClass = bestsellingbooksapiClass;
        return this;
      }


    }

  }



  /**
   * Builder for {@link Bestsellingbooksapi}.
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

    /** Builds a new instance of {@link Bestsellingbooksapi}. */
    @Override
    public Bestsellingbooksapi build() {
      return new Bestsellingbooksapi(
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
