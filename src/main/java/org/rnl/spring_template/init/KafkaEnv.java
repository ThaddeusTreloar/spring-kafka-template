package org.rnl.spring_template.init;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @Builder
public class KafkaEnv {
    private String apiKey;
    private String apiSecret;
    private String bootstrapServers;
    private String schemaRegistryUrl;
    private String schemaRegistryUser;
    private String schemaRegistryPass;

    public boolean isNull() {
        return this.getApiKey() == null  
            | this.getApiSecret() == null
            | this.getBootstrapServers() == null
            | this.getSchemaRegistryUrl() == null
            | this.getSchemaRegistryUser() == null
            | this.getSchemaRegistryPass() == null;
    }

    public String getNullVar() {
        if (this.getApiKey() == null) {
            return "SPRING_KAFKA_API_KEY";
        }
        else if (this.getApiSecret() == null) {
            return "SPRING_KAFKA_API_SECRET";
        }
        else if (this.getBootstrapServers() == null) {
            return "SPRING_KAFKA_BOOTSTRAP_SERVERS";
        } else if (this.getSchemaRegistryUrl() == null) {
            return "SPRING_KAFKA_SCHEMA_REGISTRY_URL";
        } else if (this.getSchemaRegistryUser() == null) {
            return "SPRING_KAFKA_SCHEMA_REGISTRY_USER";
        } else if (this.getSchemaRegistryPass() == null) {
            return "SPRING_KAFKA_SCHEMA_REGISTRY_PASS";
        } else {
            return "";
        }
    } 
}