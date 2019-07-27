package ${groupId}.${rootArtifactId}.controller;

import ${groupId}.${rootArtifactId}.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TimeStampController {
    @Autowired
    private TimeStampService timeStampService;

    @RequestMapping("/queryCurrentTimeStamp")
    public String queryCurrentTimeStamp() {
        return timeStampService.queryCurrentTimeStamp();
    }

    @RequestMapping("/queryUtcTimeStamp")
    public String queryUtcTimeStamp() {
        return timeStampService.queryUtcTimeStamp();
    }
}
