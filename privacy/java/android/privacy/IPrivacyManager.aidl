package android.privacy;

/** {@hide} */
interface IPrivacyManager {
  void enterSensitiveContext();
  void leaveSensitiveContext();
  boolean inSensitiveContext();
}

