package enumexception;

public enum SysCode {

  // 1 - 1000 (reserved for error)
  SERVER_TIMEOUT(1, "Server Connection Time Out."),

  // 1001 - 2000 (reserved for warning.)
  DB_TIMEOUT(1001, "Database Time Out."),

  // 2001 - 3000 (others.)
  EMAIL_TOO_LONG(2001, "Email Address is too long.")
  ;
  
  private int code;
  private String message;

  private SysCode(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public int getCode() {
    return this.code;
  }

}
