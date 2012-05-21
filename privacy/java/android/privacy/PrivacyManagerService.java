package android.privacy;

import android.content.Context;

/**
 * {@hide}
 */
public class PrivacyManagerService extends IPrivacyManager.Stub {
  private static final String TAG = "PrivacyManagerService";
  private static final String WRITE_PRIVACY_SETTINGS =
          "android.privacy.WRITE_PRIVACY_SETTINGS";

  private Context context;

  /**
   * @hide
   */
  public PrivacyManagerService(Context context) {
    this.context = context;
  }

  public void enterSensitiveContext() { }

  public void leaveSensitiveContext() { }
}
