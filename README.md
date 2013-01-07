# USA TODAY API Client Library for Java
###Java client libraries created with Mashery I/O Wraps, a semi-automated native language SDK generator.

## What is the USA TODAY API?
USA TODAY offers content APIs that allow developers to access their resources, such as news articles, book reviews, best seller lists (books), census data, movie reviews, music reviews and much more. Head over to [developer.usatoday.com](http://developer.usatoday.com) to learn more. You can register for instant access to their API, view their documentation, and even make live API calls with their interactive docs.

## Summary

An API client library (also known as an SDK or language wrapper) is an efficiency tool for programmer that helps bind external resources to your native programming language. Traditionally, to integrate an API into your project without a client library, you would need to do the following:

1. Construct a network request using a transport library (e.g. HTTP)

2. Integrate authentication flow and signatures (e.g. OAuth, MD5/SHA-256, etc.)

3. Construct and execute API calls manually, often a trial and error process while reading documentation

4. Parse through results

5. Lather. Rinse. Repeat.

## How does the client library help?
Client libraries make life easier by bringing the API into your native language environment. So, rather than making curl calls, piping the output into a variable, and parsing through the variable -- the client library handles the network connectivity, authorization and API call execution with syntax you're familiar with. Below is a pseudo-Java-code example of how this library works:

    // Instantiate the client library
    Usatodayapi usatodayapi = new Usatodayapi.Builder(new NetHttpTransport(), jsonFactory....

    // Initialize the request object
    UsatodayApiRequest apiRequest = (UsatodayApiRequest)request;
    
    // Set your API key
    apiRequest.set("apikey","YOUR_KEY_HERE");

    // Make an API call and store the response in an object
    StoryList storylist = new StoryList(usatodayapi.ArticleMethods().Search("presidential"));

## Requirements
1. [Java](http://www.java.com/en/)
2. [Maven](http://maven.apache.org/)
2. USA TODAY API key -- head over to [http://developer.usatodaycorp.com](http://developer.usatodaycorp.com) 

## IDE is optional, but nice
At Mashery, we love [vim](http://www.vim.org) just as much as the next guy, but when it comes to tool-tips, code-completion and general object-oriented goodness, IDEs can be really useful. [Eclipse](http://eclipse.org), [Netbeans](http://netbeans.org), etc. They're all very mature and useful tools.

## Installation / Quick Start Guide
Follow the steps below for a quick start to using this client library:

1. Grab the latest source with git. 

    <pre>git clone git://github.com/mashery/io-wraps-usatoday-java.git</pre>

2. From the root of the unpack repo above, build with Maven:

    <pre>maven install</pre>

3. Head over to [USA TODAY Developer Network](http://developer.usatoday.com) to fetch an API key

4. Open up your IDE and import the Maven project.

This client library was built using Mashery I/O Wraps, which incorporates the [Google Client Library Generator](http://code.google.com/p/google-apis-client-generator/) and other Google native language libraries. This is why the package layout looks like *com.google.api...* 


## About / License
* No warranty expressed or implied. Software as is.
* [MIT License](http://www.opensource.org/licenses/mit-license.html)
* Lovingly created by [Mashery Dev](http://dev.mashery.com)
