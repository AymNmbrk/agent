import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello tout le monde !");
		get("/", (req, res) -> "salam");
		get("/coucou", (req, res) -> "welcome!");
		get("/fcb", (req, res) -> "visca barca!");
	}
}
