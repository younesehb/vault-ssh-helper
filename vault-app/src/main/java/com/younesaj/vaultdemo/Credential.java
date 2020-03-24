package com.younesaj.vaultdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("vaultconfig")
public class Credential {


    private String username;
    private String password;


    

}
