package ${groupId}.${rootArtifactId}.mapper;

import ${groupId}.${rootArtifactId}.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface SysUserMapper {

    SysUser querySysUser(String userName);
}
