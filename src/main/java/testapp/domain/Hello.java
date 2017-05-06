package testapp.domain;

public class Hello {

	private String greeting;

	public Hello(String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hello [greeting=");
		builder.append(greeting);
		builder.append("]");
		return builder.toString();
	}

}
