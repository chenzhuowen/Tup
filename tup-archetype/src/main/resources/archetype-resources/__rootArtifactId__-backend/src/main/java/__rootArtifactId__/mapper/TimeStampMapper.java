package ${groupId}.${rootArtifactId}.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TimeStampMapper {

    String queryCurrentTimeStamp();

    String queryUtcTimeStamp();
}
