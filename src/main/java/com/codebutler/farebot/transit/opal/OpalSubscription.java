/*
 * OpalSubscription.java
 *
 * Copyright 2015 Michael Farrell <micolous+git@gmail.com>
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
package com.codebutler.farebot.transit.opal;


import android.os.Parcel;

import com.codebutler.farebot.R;
import com.codebutler.farebot.transit.Subscription;
import com.codebutler.farebot.util.Utils;

import java.util.Date;

/**
 * Class describing auto-topup on Opal.
 *
 * Opal has no concept of subscriptions, but when auto-topup is enabled, you no longer need to
 * manually refill the card with credit.
 *
 * Dates given are not valid.
 */
public class OpalSubscription extends Subscription {

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public Date getValidFrom() {
        // Start of Opal trial
        return new Date(2012 - 1900, 12 - 1, 7);
    }

    @Override
    public Date getValidTo() {
        // Maximum possible date representable on the card
        return new Date(2159 - 1900, 6 - 1, 6);
    }

    @Override
    public String getAgencyName() {
        return getShortAgencyName();
    }

    @Override
    public String getShortAgencyName() {
        return "Opal";
    }

    @Override
    public int getMachineId() {
        return 0;
    }

    @Override
    public String getSubscriptionName() {
        return Utils.localizeString(R.string.opal_automatic_top_up);
    }

    @Override
    public String getActivation() {
        return null;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
