package ${groupId}.${rootArtifactId}.controller;

import ${groupId}.${rootArtifactId}.entity.SysUser;
import ${groupId}.${rootArtifactId}.service.SysUserService;
import ${groupId}.${rootArtifactId}.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "hello world!!!";
    }
}
