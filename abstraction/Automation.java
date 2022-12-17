package abstraction;

public class Automation extends MultipleLanguage implements TestTool
{
	public String Java() {
		return "Java is a object oriented programming language!!";
	}

	public String Selenium() {
		return "Selenium is an open source for a range of tools and libraries aimed at supporting browser automation.";
	}

	public String python()
	{
		return "Python is a high-level, general-purpose programming language.";

	}

	public boolean ruby() {
		return false;
	}

	public static void main(String[] args)
	{
		Automation a=new Automation();
		System.out.println(a.Java());
		System.out.println(a.Selenium());
		System.out.println(a.python());
		System.out.println(a.ruby());
	}


}
