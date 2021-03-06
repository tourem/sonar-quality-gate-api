package com.bnpp.zephyr.tools.sonar.config;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "teams")
public class ProjectsConfig {
    private Map<String, KeyBranch> dna;
    private Map<String, KeyBranch> irma;
    private Map<String, KeyBranch> andy;

    @Getter
    @Setter
    public static class KeyBranch {
        private String key;
        private String branch;
    }
}
