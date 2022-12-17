package in.ghostreborn.chekuthan;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

import com.android.internal.logging.nano.MetricsProto;

public class Chekuthan extends SettingsPreferenceFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.chekuthan, container, false);

    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.CHEKUTHAN;
    }

}
