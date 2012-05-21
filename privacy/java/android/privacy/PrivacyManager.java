package android.privacy;

import android.content.Context;
import android.os.RemoteException;

/**
 * {@hide}
 */
public class PrivacyManager {
  private static final String TAG = "PrivacyManager";
  private IPrivacyManager service;

  /**
   * @hide
   */
  public PrivacyManager(Context context, IPrivacyManager service) {
    this.service = service;
  }

  public void enterSensitiveContext() {
    try {
      service.enterSensitiveContext();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }

  public void leaveSensitiveContext() {
    try {
      service.leaveSensitiveContext();
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }

  public boolean inSensitiveContext() {
    try {
      return service.inSensitiveContext();
    } catch (RemoteException e) {
      e.printStackTrace();
      return true;
    }
  }

  public boolean isServiceAvailable() {
    if (service != null) return true;
    else return false;
  }
} 
