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
 * Model definition for Bestsellingbooksapi.ApiParameters.
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
public final class ApiParameters extends GenericJson {

  /**

   */
  @Key("Category")
  private String category;

  
  public String getCategory() {
    return category;
  }

  
  public ApiParameters setCategory(String category) {
    this.category = category;
    return this;
  }
  /**

   */
  @Key("Count")
  private Integer count;

  
  public Integer getCount() {
    return count;
  }

  
  public ApiParameters setCount(Integer count) {
    this.count = count;
    return this;
  }
  /**

   */
  @Key("ExcludeCurrentWeek")
  private String excludeCurrentWeek;

  
  public String getExcludeCurrentWeek() {
    return excludeCurrentWeek;
  }

  
  public ApiParameters setExcludeCurrentWeek(String excludeCurrentWeek) {
    this.excludeCurrentWeek = excludeCurrentWeek;
    return this;
  }
  /**

   */
  @Key("ISBN")
  private String iSBN;

  
  public String getISBN() {
    return iSBN;
  }

  
  public ApiParameters setISBN(String iSBN) {
    this.iSBN = iSBN;
    return this;
  }
  /**

   */
  @Key("MaxYear")
  private String maxYear;

  
  public String getMaxYear() {
    return maxYear;
  }

  
  public ApiParameters setMaxYear(String maxYear) {
    this.maxYear = maxYear;
    return this;
  }
  /**

   */
  @Key("Title")
  private String title;

  
  public String getTitle() {
    return title;
  }

  
  public ApiParameters setTitle(String title) {
    this.title = title;
    return this;
  }
  /**

   */
  @Key("Author")
  private String author;

  
  public String getAuthor() {
    return author;
  }

  
  public ApiParameters setAuthor(String author) {
    this.author = author;
    return this;
  }
  /**

   */
  @Key("Month")
  private String month;

  
  public String getMonth() {
    return month;
  }

  
  public ApiParameters setMonth(String month) {
    this.month = month;
    return this;
  }
  /**

   */
  @Key("MinYear")
  private String minYear;

  
  public String getMinYear() {
    return minYear;
  }

  
  public ApiParameters setMinYear(String minYear) {
    this.minYear = minYear;
    return this;
  }
  /**

   */
  @Key("Year")
  private String year;

  
  public String getYear() {
    return year;
  }

  
  public ApiParameters setYear(String year) {
    this.year = year;
    return this;
  }
  /**

   */
  @Key("Date")
  private String date;

  
  public String getDate() {
    return date;
  }

  
  public ApiParameters setDate(String date) {
    this.date = date;
    return this;
  }
  /**

   */
  @Key("Class")
  private String bestsellingbooksapiClass;

  
  public String getBestsellingbooksapiClass() {
    return bestsellingbooksapiClass;
  }

  
  public ApiParameters setBestsellingbooksapiClass(String bestsellingbooksapiClass) {
    this.bestsellingbooksapiClass = bestsellingbooksapiClass;
    return this;
  }
  /**

   */
  @Key("RecentWeekAllowance")
  private String recentWeekAllowance;

  
  public String getRecentWeekAllowance() {
    return recentWeekAllowance;
  }

  
  public ApiParameters setRecentWeekAllowance(String recentWeekAllowance) {
    this.recentWeekAllowance = recentWeekAllowance;
    return this;
  }


  private HttpHeaders responseHeaders;

  /**
   * Sets the HTTP headers returned with the server response, or <code>null</code>.
   *
   * This member should only be non-null if this object was the top level element of a response. For
   * example, a request that returns a single ApiParameters would include the response headers,
   * while a request which returns an array of ApiParameters, would have a non-null response header
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
