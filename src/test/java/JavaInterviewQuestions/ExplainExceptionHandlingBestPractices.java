package JavaInterviewQuestions;

public class ExplainExceptionHandlingBestPractices {

	/**
	 * Never Hide Exceptions. At the least log them. printStactTrace method prints
	 * the entire stack trace when an exception occurs. If you handle an exception,
	 * it is always a good practice to log the trace. • Do not use exception
	 * handling for flow control in a program. They have a significant performance
	 * impact. • Think about the user. What does the user want to see if there is an
	 * exception? • Think about the support developer. What does the support
	 * developer need to debug the exception? • Think about the calling method. Can
	 * the calling method do something about the exception being thrown? If not,
	 * create un checked exceptions. For example, Spring Framework chooses to make
	 * most of the jdbc exceptions as unchecked exceptions because , in most cases,
	 * there is nothing that a caller of the method can do about a jdbc exception. •
	 * Have global exception handling
	 */

}
