package neveruseswtich;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Jeka on 23/08/2016.
 */
@AllArgsConstructor
public enum MailType {
    WELCOME(1, new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2, new EmailCallbackMailGenerator());

    private final int dbCode;
    @Getter
    private final MailGenerator mailGenerator;

    public static MailType findByDbCode(int dbCode) {
        for (MailType value : values()) {
            if (value.dbCode == dbCode) {
                return value;
            }
        }
        throw new IllegalStateException("dbcode " + dbCode + " not binded");
    }


}
