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
 * Model definition for Bestsellingbooksapi.IsbnTitleEntry.
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
public final class IsbnTitleEntry extends GenericJson {

  /**

   */
  @Key("Category")
  private java.util.List<CategoriesItem> category;

  
  public java.util.List<CategoriesItem> getCategory() {
    return category;
  }

  
  public IsbnTitleEntry setCategory(java.util.List<CategoriesItem> category) {
    this.category = category;
    return this;
  }
  /**

   */
  @Key("BookListAppearances")
  private Integer bookListAppearances;

  
  public Integer getBookListAppearances() {
    return bookListAppearances;
  }

  
  public IsbnTitleEntry setBookListAppearances(Integer bookListAppearances) {
    this.bookListAppearances = bookListAppearances;
    return this;
  }
  /**

   */
  @Key("Description")
  private String description;

  
  public String getDescription() {
    return description;
  }

  
  public IsbnTitleEntry setDescription(String description) {
    this.description = description;
    return this;
  }
  /**

   */
  @Key("HighestRank")
  private Integer highestRank;

  
  public Integer getHighestRank() {
    return highestRank;
  }

  
  public IsbnTitleEntry setHighestRank(Integer highestRank) {
    this.highestRank = highestRank;
    return this;
  }
  /**

   */
  @Key("Author")
  private String author;

  
  public String getAuthor() {
    return author;
  }

  
  public IsbnTitleEntry setAuthor(String author) {
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

  
  public IsbnTitleEntry setTitle(String title) {
    this.title = title;
    return this;
  }
  /**

   */
  @Key("FirstBookListAppearace")
  private BookListByDate firstBookListAppearace;

  
  public BookListByDate getFirstBookListAppearace() {
    return firstBookListAppearace;
  }

  
  public IsbnTitleEntry setFirstBookListAppearace(BookListByDate firstBookListAppearace) {
    this.firstBookListAppearace = firstBookListAppearace;
    return this;
  }
  /**

   */
  @Key("TitleAPIUrl")
  private String titleAPIUrl;

  
  public String getTitleAPIUrl() {
    return titleAPIUrl;
  }

  
  public IsbnTitleEntry setTitleAPIUrl(String titleAPIUrl) {
    this.titleAPIUrl = titleAPIUrl;
    return this;
  }
  /**

   */
  @Key("Formats")
  private java.util.List<Format> formats;

  
  public java.util.List<Format> getFormats() {
    return formats;
  }

  
  public IsbnTitleEntry setFormats(java.util.List<Format> formats) {
    this.formats = formats;
    return this;
  }
  /**

   */
  @Key("RankHistories")
  private java.util.List<RankHistoryEntry> rankHistories;

  
  public java.util.List<RankHistoryEntry> getRankHistories() {
    return rankHistories;
  }

  
  public IsbnTitleEntry setRankHistories(java.util.List<RankHistoryEntry> rankHistories) {
    this.rankHistories = rankHistories;
    return this;
  }
  /**

   */
  @Key("Class")
  private String bestsellingbooksapiClass;

  
  public String getBestsellingbooksapiClass() {
    return bestsellingbooksapiClass;
  }

  
  public IsbnTitleEntry setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
    this.bestsellingbooksapiClass = bestsellingbooksapiClass;
    return this;
  }
  /**

   */
  @Key("MostRecentBookListAppearance")
  private BookListByDate mostRecentBookListAppearance;

  
  public BookListByDate getMostRecentBookListAppearance() {
    return mostRecentBookListAppearance;
  }

  
  public IsbnTitleEntry setMostRecentBookListAppearance(BookListByDate mostRecentBookListAppearance) {
    this.mostRecentBookListAppearance = mostRecentBookListAppearance;
    return this;
  }


  private HttpHeaders responseHeaders;

  /**
   * Sets the HTTP headers returned with the server response, or <code>null</code>.
   *
   * This member should only be non-null if this object was the top level element of a response. For
   * example, a request that returns a single IsbnTitleEntry would include the response headers,
   * while a request which returns an array of IsbnTitleEntry, would have a non-null response header
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
