package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:auth.properties"
})

public interface AuthConfig extends Config {

    @Key("userName")
    String getUserName();

    @Key("key")
    String getKey();

    @Key("remoteUrl")
    String getRemoteUrl();
}
