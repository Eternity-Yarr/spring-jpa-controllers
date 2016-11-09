package jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@SpringBootApplication
@Controller
public class TestApplication {
  @RequestMapping(
    path = "/bug",
    method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
  )
  public String test(List<String> entities) {
    try {
      entities.size();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "i'm fine";
  }

  public static void main(String[] args) {
    SpringApplication.run(TestApplication.class, args);
  }
}
