import android.app.Activity;
import android.os.Bundle;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class SampleUITest extends UiAutomatorTestCase {
	void testSample(){
		UiDevice d = getUiDevice();
        assertTrue(d.pressHome());
        Bundle status = new Bundle();
        status.putString("msg", "This is a demo test and I just pressed HOME");
        status.putString("product", getUiDevice().getProductName());
        status.putInt("dp-width", d.getDisplayWidth());
        status.putInt("dp-height", d.getDisplayHeight());
        getAutomationSupport().sendStatus(Activity.RESULT_OK, status);
	}
}
