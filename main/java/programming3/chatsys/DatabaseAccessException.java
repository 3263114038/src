package programming3.chatsys;

import java.sql.SQLException;

public class DatabaseAccessException extends RuntimeException {
    public DatabaseAccessException(Throwable cause) {
        super(cause);
    }
}
