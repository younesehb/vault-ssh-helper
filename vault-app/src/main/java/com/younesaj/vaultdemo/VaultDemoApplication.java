package com.younesaj.vaultdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class VaultDemoApplication  implements CommandLineRunner {

    private Credential credential;
    private Logger logger = LoggerFactory.getLogger(VaultDemoApplication.class);
    public VaultDemoApplication(Credential credential) {
        this.credential = credential;
    }


    public static void main(String[] args) {
        SpringApplication.run(VaultDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Username : " + credential.getUsername() );
        logger.info("Password : " + credential.getPassword() );

        
    }
}
