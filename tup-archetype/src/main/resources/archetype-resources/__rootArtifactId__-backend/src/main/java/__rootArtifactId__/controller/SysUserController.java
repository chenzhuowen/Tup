package ${groupId}.${rootArtifactId}.controller;

import ${groupId}.${rootArtifactId}.entity.SysUser;
import ${groupId}.${rootArtifactId}.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/getSysUserInfo")
    public SysUser getSysUserInfo(@RequestParam String userName) {
        return sysUserService.getSysUser(userName);
    }

}
