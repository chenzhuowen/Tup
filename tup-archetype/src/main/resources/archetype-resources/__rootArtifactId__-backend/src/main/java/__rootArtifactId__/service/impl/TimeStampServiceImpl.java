package ${groupId}.${rootArtifactId}.service.impl;

import ${groupId}.${rootArtifactId}.mapper.TimeStampMapper;
import ${groupId}.${rootArtifactId}.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeStampServiceImpl implements TimeStampService {

    @Autowired
    TimeStampMapper timeStampMapper;

    public String queryCurrentTimeStamp() {
        return timeStampMapper.queryCurrentTimeStamp();
    }

    public String queryUtcTimeStamp() {
        return timeStampMapper.queryUtcTimeStamp();
    }


}
