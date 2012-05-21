package android.privacy;

import android.content.Context;

/**
 * {@hide}
 */
public class PrivacyManagerService extends IPrivacyManager.Stub {
  private static final String TAG = "PrivacyManagerService";
  private static final String WRITE_PRIVACY_SETTINGS = "android.privacy.WRITE_PRIVACY_SETTINGS";

  private Context context;
  private boolean sensitiveState;

  /**
   * @hide
   */
  public PrivacyManagerService(Context context) {
    this.context = context;
    sensitiveState = false;
  }

  public void enterSensitiveContext() {
    sensitiveState = true;
 }

  public void leaveSensitiveContext() {
    sensitiveState = false;
  }

  public boolean inSensitiveContext() {
    return sensitiveState;
  }
}
