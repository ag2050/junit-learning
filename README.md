# junit-learning
<h2>@WebMvcTest:</h2>Spring Boot instantiates only the web layer rather than the whole context. In an application with multiple controllers, you can even ask for only one to be instantiated by using, for example, @WebMvcTest(HomeController.class).

<h2>MockMvc:</h2>MockMVC class is part of Spring MVC test framework which helps in testing the controllers explicitly starting a Servlet container.The <b>@WebMvcTest</b> annotation auto-configure MockMvc instance as well.
