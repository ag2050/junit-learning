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
