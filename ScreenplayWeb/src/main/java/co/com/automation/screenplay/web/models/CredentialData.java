package co.com.automation.screenplay.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CredentialData {
    private String user;
    private String password;
}
