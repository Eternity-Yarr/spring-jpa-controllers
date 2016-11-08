package jpa;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class OkController {
  @RequestMapping(
    path = "/ok",
    method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
  )
  public ResponseEntity<String> test(@RequestBody List<TestEntity> entities) {
    return ResponseEntity.ok(entities.toString());
  }
}
