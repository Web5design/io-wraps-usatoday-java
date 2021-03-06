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
 * Model definition for Bestsellingbooksapi.BookList.
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
public final class BookList extends GenericJson {

  /**

   */
  @Key("BookListEntries")
  private java.util.List<BookListEntry> bookListEntries;

  
  public java.util.List<BookListEntry> getBookListEntries() {
    return bookListEntries;
  }

  
  public BookList setBookListEntries(java.util.List<BookListEntry> bookListEntries) {
    this.bookListEntries = bookListEntries;
    return this;
  }
  /**

   */
  @Key("BookListDate")
  private BookListByDate bookListDate;

  
  public BookListByDate getBookListDate() {
    return bookListDate;
  }

  
  public BookList setBookListDate(BookListByDate bookListDate) {
    this.bookListDate = bookListDate;
    return this;
  }
  /**
   * Name of the book list
   */
  @Key("Name")
  private String name;

  /** Name of the book list */
  public String getName() {
    return name;
  }

  /** Name of the book list */
  public BookList setName(String name) {
    this.name = name;
    return this;
  }


  private HttpHeaders responseHeaders;

  /**
   * Sets the HTTP headers returned with the server response, or <code>null</code>.
   *
   * This member should only be non-null if this object was the top level element of a response. For
   * example, a request that returns a single BookList would include the response headers, while a
   * request which returns an array of BookList, would have a non-null response header in the
   * enclosing object only.
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
