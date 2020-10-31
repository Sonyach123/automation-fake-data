package generators;

import API.Generator;

public class EmailGenerator implements Generator{
    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String generate() {
return email;
    }

}
