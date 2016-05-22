/*
 * LicenseActivity.java
 *
 * Copyright 2015-2016 Michael Farrell
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.codebutler.farebot.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.codebutler.farebot.R;

public class LicenseActivity extends Activity {

    final static String mLicenseIntro = "FareBot\n" +
            "Copyright 2011-2016 Eric Butler <eric@codebutler.com> and contributors\n" +
            "Copyright 2011 \"an anonymous contributor\", Chris Hundt, David Hoover, Devin Carraway, Sean Cross\n" +
            "Copyright 2012 Jason Hsu, Sebastian Oliva, Shayan Guha, Toby Bonang, Victor Heng\n" +
            "Copyright 2012-2013 Wilbert Duijvenvoorde\n" +
            "Copyright 2013 Lauri Andler, Marcelo Liberato, Mike Castleman\n" +
            "Copyright 2014 Bao-Long Nguyen-Trong, Kramer Campbell\n" +
            "\n" +
            "This program is free software: you can redistribute it and/or modify " +
            "it under the terms of the GNU General Public License as published by " +
            "the Free Software Foundation, either version 3 of the License, or " +
            "(at your option) any later version.\n" +
            "\n" +
            "This program is distributed in the hope that it will be useful, " +
            "but WITHOUT ANY WARRANTY; without even the implied warranty of " +
            "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the " +
            "GNU General Public License for more details.\n" +
            "\n" +
            "You should have received a copy of the GNU General Public License " +
            "along with this program.  If not, see <http://www.gnu.org/licenses/>.\n\n\n";


    final static String mNfcFelicaLib = "This software contains nfc-felica-lib, an Android library for interfacing with FeliCa smartcards.  The following terms apply to nfc-felica-lib:\n" +
            "Copyright 2011 Kazzz.\n" +
            "\n" +
            "Licensed under the Apache License, Version 2.0 (the \"License\"); " +
            "you may not use this file except in compliance with the License. " +
            "You may obtain a copy of the License at\n" +
            "\n" +
            "   http://www.apache.org/licenses/LICENSE-2.0\n" +
            "\n" +
            "Unless required by applicable law or agreed to in writing, software " +
            "distributed under the License is distributed on an \"AS IS\" BASIS, " +
            "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. " +
            "See the License for the specific language governing permissions and " +
            "limitations under the License.\n\n\n";

    final static String mAOSP = "This software contains portions of the Android Open Source Project\n" +
            "Copyright 2006, 2011 The Android Open Source Project\n" +
            "\n" +
            "Licensed under the Apache License, Version 2.0 (the \"License\"); " +
            "you may not use this file except in compliance with the License. " +
            "You may obtain a copy of the License at\n" +
            "\n" +
            "   http://www.apache.org/licenses/LICENSE-2.0\n" +
            "\n" +
            "Unless required by applicable law or agreed to in writing, software " +
            "distributed under the License is distributed on an \"AS IS\" BASIS, " +
            "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. " +
            "See the License for the specific language governing permissions and " +
            "limitations under the License.\n\n\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView lblLicenseText = (TextView)findViewById(R.id.lblLicenseText);
        lblLicenseText.setText(mLicenseIntro);

        // TODO: Read this from third_party/nfc-felica-lib/COPYING
        lblLicenseText.append(mNfcFelicaLib);

        lblLicenseText.append(mAOSP);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return false;
    }
}
