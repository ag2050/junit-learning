# junit-learning
<h2>@WebMvcTest:</h2>Spring Boot instantiates only the web layer rather than the whole context. In an application with multiple controllers, you can even ask for only one to be instantiated by using, for example, @WebMvcTest(HomeController.class).

<h2>MockMvc:</h2>MockMVC class is part of Spring MVC test framework which helps in testing the controllers explicitly starting a Servlet container.The <b>@WebMvcTest</b> annotation auto-configure MockMvc instance as well.

<h2>MvcResult:</h2>Provides access to the result of an executed request.
<h2>MockMvcRequestBuilders:</h2>We can create the executed request by using the perform(RequestBuilder requestBuilder) method of the MockMvc class. The MockMvcRequestBuilders class provides static methods that we can use to create the actual request builders. These methods are described in the following:<br>
<li>get() method creates a request builder for GET request.</li>
<li>post() method creates a request builder for POST request.</li>
<li>put() method creates a request builder for PUT method.</li>
<li>delete() method creates a request builder for DELETE request.</li>
<li>fileUpload() creates a request builder for multipart request.</li>

<h2>Verifying The Response:</h2>
The ResultActions interface declares methods that we can use to apply actions to the result of an executed requests. These methods are described in the following:

<li>void <b>andExpect</b>(ResultMatcher matcher) method is used to specify assertions to the result of the executed query.</li>
<li>void <b>andDo</b>(ResultHandler handler) method is used to apply an action to the result of the request.</li>
<li>MvcResult <b>andReturn</b>() method returns the result of the request.</li>
<br>We can get more information about the actions that we can apply to the result of the executed requests by taking a look at the following classes:

<li>The MockMvcResultMatchers class is used to specify assertions to the result of the request.</li>
<li>The MockMvcResultHandlers class for finding out out what kind of actions we can perform to the result of the executed request.</li>
