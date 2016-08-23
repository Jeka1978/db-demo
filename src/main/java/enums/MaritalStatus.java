package enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Created by Jeka on 23/08/2016.
 */
//@AllArgsConstructor
public enum MaritalStatus {

    SINGLE("холост",1),
    DIVORCED("разведен",2),
    WIDOW("вдовец",3),
    MARRIED("женат",6);

    MaritalStatus(String russianDesc, int dbCode) {
        this.russianDesc = russianDesc;
        this.dbCode = dbCode;
    }

    @Getter
    private String russianDesc;
    @Getter
    private int dbCode;

    public static MaritalStatus findByDbCode(int dbCode) throws IllegalStateException {
        for (MaritalStatus value : values()) {
            if (value.dbCode == dbCode) {
                return value;
            }
        }
        throw  new IllegalStateException("dbcode not found");
    }


}














