package com.example.ims.web.controller;

import com.example.ims.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "添加用户", notes = "传递一个完整的User对象")
    @ApiImplicitParam(name = "user", value = "用户实体User", required = true, dataType = "User")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public User addUser(@RequestParam("user") User user){
        return new User();
    }

}
