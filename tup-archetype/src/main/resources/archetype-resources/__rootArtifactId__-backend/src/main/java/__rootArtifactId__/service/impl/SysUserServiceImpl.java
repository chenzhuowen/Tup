package ${groupId}.${rootArtifactId}.service.impl;

import ${groupId}.${rootArtifactId}.entity.SysUser;
import ${groupId}.${rootArtifactId}.mapper.SysUserMapper;
import ${groupId}.${rootArtifactId}.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser getSysUser(String userName) {
        return sysUserMapper.querySysUser(userName);
    }
}
