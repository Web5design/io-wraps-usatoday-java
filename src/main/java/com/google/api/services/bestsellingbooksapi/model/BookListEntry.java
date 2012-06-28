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
 * Warning! This file is generated. Modify at your own risk.
 */

package com.google.api.services.bestsellingbooksapi.model;


import com.google.api.client.http.HttpHeaders;
import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;


/**
 * Model definition for Bestsellingbooksapi.BookListEntry.
 *
 * This class models an object which will be transmitted to or from the Bestsellingbooksapi service.
 * To reduce the data transferred during service requests, you may remove members that contain data
 * elements that your application does not need.
 *
 * For a detailed explanation, see: <a href="http://code.google.com/p/google-api-java-
 * client/wiki/Json"> http://code.google.com/p/google-api-java-client/wiki/Json</a>
 *
 * @author Google, Inc.
 */
public final class BookListEntry extends GenericJson {

  /**

   */
  @Key("Category")
  private Category category;

  
  public Category getCategory() {
    return category;
  }

  
  public BookListEntry setCategory(Category category) {
    this.category = category;
    return this;
  }
  /**

   */
  @Key("ASIN")
  private String aSIN;

  
  public String getASIN() {
    return aSIN;
  }

  
  public BookListEntry setASIN(String aSIN) {
    this.aSIN = aSIN;
    return this;
  }
  /**

   */
  @Key("ISBN")
  private String iSBN;

  
  public String getISBN() {
    return iSBN;
  }

  
  public BookListEntry setISBN(String iSBN) {
    this.iSBN = iSBN;
    return this;
  }
  /**

   */
  @Key("Format")
  private Format format;

  
  public Format getFormat() {
    return format;
  }

  
  public BookListEntry setFormat(Format format) {
    this.format = format;
    return this;
  }
  /**

   */
  @Key("RankLastWeek")
  private String rankLastWeek;

  
  public String getRankLastWeek() {
    return rankLastWeek;
  }

  
  public BookListEntry setRankLastWeek(String rankLastWeek) {
    this.rankLastWeek = rankLastWeek;
    return this;
  }
  /**

   */
  @Key("Author")
  private String author;

  
  public String getAuthor() {
    return author;
  }

  
  public BookListEntry setAuthor(String author) {
    this.author = author;
    return this;
  }
  /**

   */
  @Key("Title")
  private String title;

  
  public String getTitle() {
    return title;
  }

  
  public BookListEntry setTitle(String title) {
    this.title = title;
    return this;
  }
  /**

   */
  @Key("Rank")
  private Integer rank;

  
  public Integer getRank() {
    return rank;
  }

  
  public BookListEntry setRank(Integer rank) {
    this.rank = rank;
    return this;
  }
  /**

   */
  @Key("TitleAPIUrl")
  private String titleAPIUrl;

  
  public String getTitleAPIUrl() {
    return titleAPIUrl;
  }

  
  public BookListEntry setTitleAPIUrl(String titleAPIUrl) {
    this.titleAPIUrl = titleAPIUrl;
    return this;
  }
  /**

   */
  @Key("BriefDescription")
  private String briefDescription;

  
  public String getBriefDescription() {
    return briefDescription;
  }

  
  public BookListEntry setBriefDescription(String briefDescription) {
    this.briefDescription = briefDescription;
    return this;
  }
  /**

   */
  @Key("Class")
  private String bestsellingbooksapiClass;

  
  public String getBestsellingbooksapiClass() {
    return bestsellingbooksapiClass;
  }

  
  public BookListEntry setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
    this.bestsellingbooksapiClass = bestsellingbooksapiClass;
    return this;
  }


  private HttpHeaders responseHeaders;

  /**
   * Sets the HTTP headers returned with the server response, or <code>null</code>.
   *
   * This member should only be non-null if this object was the top level element of a response. For
   * example, a request that returns a single BookListEntry would include the response headers,
   * while a request which returns an array of BookListEntry, would have a non-null response header
   * in the enclosing object only.
   */
  public void setResponseHeaders(HttpHeaders responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /**
   * Returns the HTTP headers that were returned with the server response, or
   * <code>null</code>.
   */
  public HttpHeaders getResponseHeaders() {
    return responseHeaders;
  }
}
