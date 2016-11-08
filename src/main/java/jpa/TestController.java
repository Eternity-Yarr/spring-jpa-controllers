package jpa;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
  @RequestMapping(
    path = "/bug",
    method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
  )
  public String test(List<TestEntity> entities) {
    System.err.println(entities.size());
    return entities.toString();
  }
}
