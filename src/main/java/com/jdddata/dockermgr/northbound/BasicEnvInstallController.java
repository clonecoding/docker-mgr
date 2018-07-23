package com.jdddata.dockermgr.northbound;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicEnvInstallController {

    public String jdkInstall() {
        return null;
    }
}
